package controller;

import java.awt.Dimension;
import javax.swing.JDialog;
import model.Ogrenci;

public class GuncelleDialogYonetici {
    
    private Ogrenci ogrenci;
    private JDialog dialog;

    public GuncelleDialogYonetici(Ogrenci ogrenci, JDialog dialog) {
        this.ogrenci = ogrenci;
        this.dialog = dialog;
    }
    public void dialogGoster(){
        dialog.setMinimumSize(new Dimension(500, 300));
        dialog.setVisible(true);
    }
    
    public void dialogKapat(){
        dialog.dispose();
    }
    
     public void ogrenciAyarla(String ogrencino, String adsoyad, String sehir, String telno){
         ogrenci.setOgrencino(ogrencino);
         ogrenci.setAdsoyad(adsoyad);
         ogrenci.setSehir(sehir);
         ogrenci.setTelno(telno);
     }
}
