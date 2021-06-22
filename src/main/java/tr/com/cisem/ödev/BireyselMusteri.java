package tr.com.cisem.ödev;

public class BireyselMusteri {
    private Long TCKimlikNo;
    private String adSoyad;
    private String evAdresi;
    private Integer hesapBakiyesi;


    public BireyselMusteri() {
    }

    public BireyselMusteri(String adSoyad, Long TCKimlikNo, Integer hesapBakiyesi, String evAdresi) {
        this.adSoyad = adSoyad;
        this.TCKimlikNo = TCKimlikNo;
        this.hesapBakiyesi = hesapBakiyesi;
        this.evAdresi = evAdresi;
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

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }

    @Override
    public String toString() {
        return "BireyselMusteri{" +
                "TCKimlikNo=" + TCKimlikNo + ", adSoyad=" + adSoyad + ", evAdresi=" + evAdresi + ", hesapBakiyesi=" + hesapBakiyesi + '}';

    }
    public String musteriBakiye(){
        return "Müşteri Bakiyesi:"+hesapBakiyesi;
    }
}
