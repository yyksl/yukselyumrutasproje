package controller;

import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Ogrenci;
import org.hibernate.Session;

public class ObsYonetici {
    private JTable ogrenciTablo;
    private final static String SORGU_KALIP = "from Ogrenci oy";
    private Session session;
    private Vector<String> sutunlar = new Vector<>();
    private Vector<Object> satir;
    private DefaultTableModel model;
    public ObsYonetici(JTable ogrenciTablo) {
        this.ogrenciTablo = ogrenciTablo;
        sutunlar.add("Öğrenci ID");
        sutunlar.add("Öğrenci No");
        sutunlar.add("Ad Soyad");
        sutunlar.add("Şehir");
        sutunlar.add("Tel No");
        model=(DefaultTableModel)ogrenciTablo.getModel();
        model.setColumnIdentifiers(sutunlar);
    }

    public void ogrenciGetir(String aranan, String filtre) {
        String sorguMetin = "";
        if (filtre.equalsIgnoreCase("ogrencino")) {
            sorguMetin = SORGU_KALIP + " where oy.ogrencino like '%" + aranan + "%'";
        } else if (filtre.equalsIgnoreCase("adsoyad")) {
            sorguMetin = SORGU_KALIP + " where oy.adsoyad like '%" + aranan + "%'";
        }
        session.beginTransaction();
        List obsList = session.createQuery(sorguMetin).list();
        session.getTransaction().commit();
        ogrenciGoster(obsList);

    }
    
    public void ogrenciListele(){
        
         String sorguMetin = "from Ogrenci";
         session.beginTransaction();
         List obsList = session.createQuery(sorguMetin).list();
         session.getTransaction().commit();
         ogrenciGoster(obsList);
    }
    
     public void ogrenciEkle(Ogrenci ogrenci){
        session.beginTransaction();
        session.save(ogrenci);
        session.getTransaction().commit();
        ogrenciListele();
    }
    
    public void ogrenciSil(int id){
        session.beginTransaction();
        session.delete((Ogrenci) session.load(Ogrenci.class, id));
        session.getTransaction().commit();
        ogrenciListele();
    }
      
    public void ogrenciGuncelle(int id,Ogrenci ogrenci){
        session.beginTransaction();
        Ogrenci gelenOgrenci = ( Ogrenci) session.load(Ogrenci.class, id);
        //session.evict(gelenOgrenci);
        gelenOgrenci.setOgrencino(ogrenci.getOgrencino());
        gelenOgrenci.setAdsoyad(ogrenci.getAdsoyad());
        gelenOgrenci.setSehir(ogrenci.getSehir());
        gelenOgrenci.setTelno(ogrenci.getTelno());
        session.merge(gelenOgrenci);
        session.getTransaction().commit();
        ogrenciListele();
    }

    public void ac() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void kapat() {
        session.close();
    }

    private void ogrenciGoster(List<Ogrenci> obsList) {
        model.getDataVector().removeAllElements();
        for (Ogrenci gelenOgrenci : obsList) {
            satir=new Vector();
            satir.add(gelenOgrenci.getOgrenciid());
            satir.add(gelenOgrenci.getOgrencino());
            satir.add(gelenOgrenci.getAdsoyad());
            satir.add(gelenOgrenci.getSehir());
            satir.add(gelenOgrenci.getTelno());
            model.addRow(satir);
        }
    }
}
   
