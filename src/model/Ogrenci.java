package model;
public class Ogrenci implements java.io.Serializable {


     private Integer ogrenciid;
     private String ogrencino;
     private String adsoyad;
     private String sehir;
     private String telno;

    public Ogrenci() {
    }

    public Ogrenci(String ogrencino, String adsoyad, String sehir, String telno) {
       this.ogrencino = ogrencino;
       this.adsoyad = adsoyad;
       this.sehir = sehir;
       this.telno = telno;
    }
   
    public Integer getOgrenciid() {
        return this.ogrenciid;
    }
    
    public void setOgrenciid(Integer ogrenciid) {
        this.ogrenciid = ogrenciid;
    }
    public String getOgrencino() {
        return this.ogrencino;
    }
    
    public void setOgrencino(String ogrencino) {
        this.ogrencino = ogrencino;
    }
    public String getAdsoyad() {
        return this.adsoyad;
    }
    
    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }
    public String getSehir() {
        return this.sehir;
    }
    
    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
    public String getTelno() {
        return this.telno;
    }
    
    public void setTelno(String telno) {
        this.telno = telno;
    }
}


