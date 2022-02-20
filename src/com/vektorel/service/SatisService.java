package com.vektorel.service;

import com.vektorel.repository.MusteriRepsitory;
import com.vektorel.repository.SatisRepository;
import com.vektorel.repository.UrunRepository;
import com.vektorel.repository.entity.Musteri;
import com.vektorel.repository.entity.Satis;
import com.vektorel.repository.entity.Urun;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SatisService {

    public void satisYap(){
        SatisRepository satisRepository = new SatisRepository();
        MusteriRepsitory musteriRepsitory = new MusteriRepsitory();
        musteriRepsitory.RastGeleMusteriListesiOlustur();
        List<Musteri> mlist = musteriRepsitory.getMusteriList();
        UrunRepository urunRepository = new UrunRepository();
        urunRepository.RestGelenUrunOlustur();
        List<Urun> uList = urunRepository.getUrunList();
        System.out.println("******************");
        System.out.println("****  SATIŞ   ****");
        System.out.println("******************");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Müşteri Listesi");
        /**
         * Müşteri listesi kader dönecek bir for döngüsü oluşturup müşteri
         * listesini yazdırıyoruz.
         */
        for (int i=0;i<mlist.size();i++){
            /**
             * DİKKAT! her seferinde müşteri listesinden veri çekmek yerine
             * bir defa çekerek işlem yapınız.
             */
            Musteri mst = mlist.get(i);
            System.out.print("SNo: "+(i+1));
            System.out.print(", Ad: "+mst.getAd());
            System.out.print(", Soyad: "+mst.getSoyad());
            System.out.print(", Telefon: "+mst.getTelefon());
            System.out.println();
        }
        System.out.print("Müşteri Seç....: ");
        int musterisirano = scanner.nextInt() - 1;
        Musteri secilenMusteri = mlist.get(musterisirano);
        System.out.println("Seçilen Müşteri..: "+ secilenMusteri.getAd());
        System.out.println("**** ÜRÜN SEÇ  *****");
        for (int i=0;i<uList.size();i++){
            Urun urun = uList.get(i);
            System.out.print("SNo: "+(i+1));
            System.out.print(", UrunAdı: "+urun.getAd());
            System.out.print(", Marka: "+urun.getMarka());
            System.out.print(", Model: "+urun.getModel());
            System.out.println();
        }
        System.out.print("Ürün Seç...: ");
        int secilenurunsirano = scanner.nextInt()-1;
        Urun secilenUrun = uList.get(secilenurunsirano);
        System.out.println("Seçilen Ürün...: "+secilenUrun.getAd());
        System.out.print("Satılan Adet...: ");
        int adet = scanner.nextInt();
        /**
         * Buradan sonra satış için gerekli alanları
         * satiş nesnesi içine yerleştiriyoruz.
         */
        Satis satis = new Satis();
        satis.setMusteriid(secilenMusteri.getId());
        satis.setUrunid(secilenUrun.getId());
        satis.setBirimfiyat(secilenUrun.getSatisfiyati());
        satis.setAdet(adet);
        satis.setToplamfiyat(secilenUrun.getSatisfiyati()*adet);
        satis.setSatistarihi(new Date());
        satis.setIslemtarihi(new Date());
        satisRepository.save(satis);


        /*
        Musteri musteri = musteriRepsitory.getMusteriList().get(5);
        System.out.println(musteri.getId());
        System.out.println(musteri.getAd());
        System.out.println(musteri.getSoyad());
        */
    }
}
