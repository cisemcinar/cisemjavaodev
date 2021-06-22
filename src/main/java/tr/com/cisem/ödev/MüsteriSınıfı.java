package tr.com.cisem.ödev;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static tr.com.cisem.ödev.ParaÇekYatır.paraCek;
import static tr.com.cisem.ödev.ParaÇekYatır.paraYatır;

public class MüsteriSınıfı {
    public static void main(String[] args) {

        System.out.println("-------Kurumsal Müşteriler--------------");

        KurumsalMusteri kurumsalMusteri1 = new KurumsalMusteri();
        kurumsalMusteri1.setAdSoyad("Ahmet Çınar");
        kurumsalMusteri1.setHesapBakiyesi(40000000);
        kurumsalMusteri1.setSırketAdı("34makina");
        kurumsalMusteri1.setTCKimlikNo(12345678080l);
        System.out.println("Kurumsal Müşteri1 Adı Soyadı:" + kurumsalMusteri1.getAdSoyad());
        System.out.println("Kurumsal Müşteri1 Hesap Bakiyesi:" + kurumsalMusteri1.getHesapBakiyesi());
        System.out.println("Kurumsal Müşteri1 Şirket Adı:" + kurumsalMusteri1.getSırketAdı());
        System.out.println("Kurumsal Müşteri1 TC Kimlik No:" + kurumsalMusteri1.getTCKimlikNo());

        System.out.println("---------------------------");

        KurumsalMusteri kurumsalMusteri2 = new KurumsalMusteri();
        kurumsalMusteri2.setAdSoyad("Emine Çınar");
        kurumsalMusteri2.setHesapBakiyesi(3500000);
        kurumsalMusteri2.setSırketAdı("Kama");
        kurumsalMusteri2.setTCKimlikNo(12345678902l);
        System.out.println("Kurumsal Müşteri2 Adı Soyadı:" + kurumsalMusteri2.getAdSoyad());
        System.out.println("Kurumsal Müşteri2 Hesap Bakiyesi:" + kurumsalMusteri2.getHesapBakiyesi());
        System.out.println("Kurumsal Müşteri2 Şirket Adı:" + kurumsalMusteri2.getSırketAdı());
        System.out.println("Kurumsal Müşteri2 TC Kimlik No:" + kurumsalMusteri2.getTCKimlikNo());

        System.out.println("---------------------------");

        KurumsalMusteri kurumsalMusteri3 = new KurumsalMusteri();
        kurumsalMusteri3.setAdSoyad("Aytuğ Yılmaz");
        kurumsalMusteri3.setHesapBakiyesi(5500000);
        kurumsalMusteri3.setSırketAdı("KingBross");
        kurumsalMusteri3.setTCKimlikNo(12345678903l);
        System.out.println("Kurumsal Müşteri3 Adı Soyadı:" + kurumsalMusteri3.getAdSoyad());
        System.out.println("Kurumsal Müşteri3 Hesap Bakiyesi:" + kurumsalMusteri3.getHesapBakiyesi());
        System.out.println("Kurumsal Müşteri3 Şirket Adı:" + kurumsalMusteri3.getSırketAdı());
        System.out.println("Kurumsal Müşteri3 TC Kimlik No:" + kurumsalMusteri3.getTCKimlikNo());

        System.out.println("---------------------------");

        KurumsalMusteri kurumsalMusteri4 = new KurumsalMusteri();
        kurumsalMusteri4.setAdSoyad("Göktuğ Yılmaz");
        kurumsalMusteri4.setHesapBakiyesi(5500001);
        kurumsalMusteri4.setSırketAdı("Güveyi Kına");
        kurumsalMusteri4.setTCKimlikNo(12345678904l);
        System.out.println("Kurumsal Müşteri4 Adı Soyadı:" + kurumsalMusteri4.getAdSoyad());
        System.out.println("Kurumsal Müşteri4 Hesap Bakiyesi:" + kurumsalMusteri4.getHesapBakiyesi());
        System.out.println("Kurumsal Müşteri4 Şirket Adı:" + kurumsalMusteri4.getSırketAdı());
        System.out.println("Kurumsal Müşteri4 TC Kimlik No:" + kurumsalMusteri4.getTCKimlikNo());

        System.out.println("---------------------------");

        KurumsalMusteri kurumsalMusteri5 = new KurumsalMusteri();
        kurumsalMusteri5.setAdSoyad("Melis Top");
        kurumsalMusteri5.setHesapBakiyesi(5500002);
        kurumsalMusteri5.setSırketAdı("Top Holding");
        kurumsalMusteri5.setTCKimlikNo(12345678905l);
        System.out.println("Kurumsal Müşteri5 Adı Soyadı:" + kurumsalMusteri5.getAdSoyad());
        System.out.println("Kurumsal Müşteri5 Hesap Bakiyesi:" + kurumsalMusteri5.getHesapBakiyesi());
        System.out.println("Kurumsal Müşteri5 Şirket Adı:" + kurumsalMusteri5.getSırketAdı());
        System.out.println("Kurumsal Müşteri5 TC Kimlik No:" + kurumsalMusteri5.getTCKimlikNo());

        System.out.println("--------Bireysel Müşteriler--------");

        BireyselMusteri bireyselMusteri1 = new BireyselMusteri();
        bireyselMusteri1.setAdSoyad("Dila Toprak");
        bireyselMusteri1.setHesapBakiyesi(5500003);
        bireyselMusteri1.setEvAdresi("Mecidiyeköy 13.sokak");
        bireyselMusteri1.setTCKimlikNo(12345678906l);
        System.out.println("Bireysel Müşteri1 Adı Soyadı:" + bireyselMusteri1.getAdSoyad());
        System.out.println("Bireysel Müşteri1 Hesap Bakiyesi:" + bireyselMusteri1.getHesapBakiyesi());
        System.out.println("Bireysel Müşteri1 Ev Adresi:" + bireyselMusteri1.getEvAdresi());
        System.out.println("Bireysel Müşteri1 TC Kimlik No:" + bireyselMusteri1.getTCKimlikNo());

        System.out.println("---------------------------");

        BireyselMusteri bireyselMusteri2 = new BireyselMusteri();
        bireyselMusteri2.setAdSoyad("Sena Kahraman");
        bireyselMusteri2.setHesapBakiyesi(5500004);
        bireyselMusteri2.setEvAdresi("Güneşli 14.sokak");
        bireyselMusteri2.setTCKimlikNo(12345678907l);
        System.out.println("Bireysel Müşteri2 Adı Soyadı:" + bireyselMusteri2.getAdSoyad());
        System.out.println("Bireysel Müşteri2 Hesap Bakiyesi:" + bireyselMusteri2.getHesapBakiyesi());
        System.out.println("Bireysel Müşteri2 Ev Adresi:" + bireyselMusteri2.getEvAdresi());
        System.out.println("Bireysel Müşteri2 TC Kimlik No:" + bireyselMusteri2.getTCKimlikNo());

        System.out.println("---------------------------");

        BireyselMusteri bireyselMusteri3 = new BireyselMusteri();
        bireyselMusteri3.setAdSoyad("Ceren Aktürk");
        bireyselMusteri3.setHesapBakiyesi(5500005);
        bireyselMusteri3.setEvAdresi("Yeşilpınar 16.sokak");
        bireyselMusteri3.setTCKimlikNo(12345678908l);
        System.out.println("Bireysel Müşteri3 Adı Soyadı:" + bireyselMusteri3.getAdSoyad());
        System.out.println("Bireysel Müşteri3 Hesap Bakiyesi:" + bireyselMusteri3.getHesapBakiyesi());
        System.out.println("Bireysel Müşteri3 Ev Adresi:" + bireyselMusteri3.getEvAdresi());
        System.out.println("Bireysel Müşteri3 TC Kimlik No:" + bireyselMusteri3.getTCKimlikNo());

        System.out.println("---------------------------");

        BireyselMusteri bireyselMusteri4 = new BireyselMusteri();
        bireyselMusteri4.setAdSoyad("Yağmur Saka");
        bireyselMusteri4.setHesapBakiyesi(5500006);
        bireyselMusteri4.setEvAdresi("Yenibosna 20.sokak");
        bireyselMusteri4.setTCKimlikNo(12345678909l);
        System.out.println("Bireysel Müşteri4 Adı Soyadı:" + bireyselMusteri4.getAdSoyad());
        System.out.println("Bireysel Müşteri4 Hesap Bakiyesi:" + bireyselMusteri4.getHesapBakiyesi());
        System.out.println("Bireysel Müşteri4 Ev Adresi:" + bireyselMusteri4.getEvAdresi());
        System.out.println("Bireysel Müşteri4 TC Kimlik No:" + bireyselMusteri4.getTCKimlikNo());

        System.out.println("---------------------------");

        BireyselMusteri bireyselMusteri5 = new BireyselMusteri();
        bireyselMusteri5.setAdSoyad("Berke Çınar");
        bireyselMusteri5.setHesapBakiyesi(5500007);
        bireyselMusteri5.setEvAdresi("Güneşli 19.sokak");
        bireyselMusteri5.setTCKimlikNo(12345678910l);
        System.out.println("Bireysel Müşteri5 Adı Soyadı:" + bireyselMusteri5.getAdSoyad());
        System.out.println("Bireysel Müşteri5 Hesap Bakiyesi:" + bireyselMusteri5.getHesapBakiyesi());
        System.out.println("Bireysel Müşteri5 Ev Adresi:" + bireyselMusteri5.getEvAdresi());
        System.out.println("Bireysel Müşteri5 TC Kimlik No:" + bireyselMusteri5.getTCKimlikNo());

        Map<String, KurumsalMusteri> kurumsalMusteriMap = new HashMap<>();

        kurumsalMusteriMap.put("17090720", kurumsalMusteri1);
        kurumsalMusteriMap.put("17090721", kurumsalMusteri2);
        kurumsalMusteriMap.put("17090722", kurumsalMusteri3);
        kurumsalMusteriMap.put("17090723", kurumsalMusteri4);
        kurumsalMusteriMap.put("17090724", kurumsalMusteri5);

        Map<String, BireyselMusteri> bireyselMusteriMap = new HashMap<>();

        bireyselMusteriMap.put("17090740", bireyselMusteri1);
        bireyselMusteriMap.put("17090741", bireyselMusteri2);
        bireyselMusteriMap.put("17090742", bireyselMusteri3);
        bireyselMusteriMap.put("17090743", bireyselMusteri4);
        bireyselMusteriMap.put("17090744", bireyselMusteri5);

        System.out.println("------------------------");

        Scanner musteriNumarasi = new Scanner(System.in);

        Scanner musteri = new Scanner(System.in);
        System.out.println("Banka Müşteri No : ");
        String musteriNo = musteri.nextLine();
        System.out.println("Banka Müşterisi No: " + musteriNo);


        if (bireyselMusteriMap.containsKey(musteriNo)) {
            System.out.println("Müşteri Bilgileri : " + bireyselMusteriMap.get(musteriNo).toString());

        } else if (kurumsalMusteriMap.containsKey(musteriNo)) {
            System.out.println("Müşteri Bilgileri : " + kurumsalMusteriMap.get(musteriNo).toString());
        } else {
            System.out.println(musteriNo + "nolu kullanıcı bulunmamaktadır. ");
        }
        Scanner islem = new Scanner(System.in);

        Scanner islemler = new Scanner(System.in);
        System.out.println("İşlem No : ");
        int islemNumarasi = islemler.nextInt();
        System.out.println("Seçilen İşlem No: " + islemNumarasi);

        if (islemNumarasi == 1) {
            if (bireyselMusteriMap.containsKey(musteriNo)) {
                System.out.println("Bireysel Müşteri Bakiyesi:" + bireyselMusteriMap.get(musteriNo).musteriBakiye());
                System.out.println("Para Yatırma ");
                System.out.println("Yatırılacak Para:");
                int para = islemler.nextInt();
                System.out.println("İşlem Numarası " + para);
                int x = bireyselMusteriMap.get(musteriNo).getHesapBakiyesi();
                int sonuc = 0;
                paraYatır(0, x, para);

            } else if (kurumsalMusteriMap.containsKey(musteriNo)) {
                System.out.println("Kurumsal Müşteri Bakiyesi:" + kurumsalMusteriMap.get(musteriNo).musteriBakiye());
                kurumsalMusteriMap.get(musteriNo);
                int x = kurumsalMusteriMap.get(musteriNo).getHesapBakiyesi();
                System.out.println("Para Yatırma ");
                System.out.println("Yatırılacak Para:");
                int para = islemler.nextInt();
                System.out.println("İşlem Numarası " + para);
                int sonuc = 0;
                paraYatır(0, x, para);


            }


        } else if (islemNumarasi == 2) {
            if (bireyselMusteriMap.containsKey(musteriNo)) {
                System.out.println("Bireysel Müşteri Bakiyesi:" + bireyselMusteriMap.get(musteriNo).musteriBakiye());
                System.out.println("Para Çekme ");
                System.out.println("Çekilecek Para:");
                int para = islemler.nextInt();
                System.out.println("İşlem Numarası " + para);
                int x = bireyselMusteriMap.get(musteriNo).getHesapBakiyesi();
                int sonuc = 0;
                paraCek(0, x, para);
                System.out.println(sonuc);


            } else if (kurumsalMusteriMap.containsKey(musteriNo)) {
                System.out.println("Kurumsal Müşteri Bakiyesi:" + kurumsalMusteriMap.get(musteriNo).musteriBakiye());
                System.out.println("Para Çekme ");
                System.out.println("Çekilecek Para:");
                int para = islemler.nextInt();
                System.out.println("İşlem Numarası " + para);
                int x = kurumsalMusteriMap.get(musteriNo).getHesapBakiyesi();
                int sonuc = 0;
                paraCek(0, x, para);
                System.out.println(sonuc);
            }
            else {
                    System.out.println("İşlem Gerçekleştirilemiyor.");
                }


            }


        }
    }




