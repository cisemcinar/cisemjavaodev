package tr.com.cisem.ödev;

public class ParaÇekYatır {

    public static int paraYatır(int sonuc,int x, int y) {

        sonuc = x + y;
        System.out.println(sonuc);
        return sonuc;

    }

    public static int paraCek(int sonuc,int x, int y){
        sonuc = x - y;
        System.out.println(sonuc);
        return sonuc;
    }

}
