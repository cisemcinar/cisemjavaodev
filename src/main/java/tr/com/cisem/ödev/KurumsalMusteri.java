package tr.com.cisem.ödev;

public class KurumsalMusteri {
    private Long TCKimlikNo;
    private String adSoyad;
    private String sırketAdı;
    private Integer hesapBakiyesi;

    public KurumsalMusteri() {
    }

    public KurumsalMusteri(String adSoyad, Long TCKimlikNo, Integer hesapBakiyesi, String sırketAdı) {
        this.adSoyad = adSoyad;
        this.TCKimlikNo = TCKimlikNo;
        this.hesapBakiyesi = hesapBakiyesi;
        this.sırketAdı = sırketAdı;

    }

    public Integer getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(Integer hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public Long getTCKimlikNo() {
        return TCKimlikNo;
    }

    public void setTCKimlikNo(Long TCKimlikNo) {
        this.TCKimlikNo = TCKimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getSırketAdı() {
        return sırketAdı;
    }

    public void setSırketAdı(String sırketAdı) {
        this.sırketAdı = sırketAdı;
    }

    @Override
    public String toString() {
        return "KurumsalMusteri{" +
                "TCKimlikNo=" + TCKimlikNo + ", adSoyad=" + adSoyad + ", sirketAdı=" + sırketAdı + ", hesapBakiyesi=" + hesapBakiyesi + '}';
    }
    public String musteriBakiye(){
        return "Müşteri Bakiyesi:"+hesapBakiyesi;
    }
}






