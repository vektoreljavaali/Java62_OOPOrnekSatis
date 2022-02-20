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

        System.out.println("******************");
        System.out.println("****  SATIŞ   ****");
        System.out.println("******************");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        MusteriService musteriService = new MusteriService();
        Musteri secilenMusteri = musteriService.musteriSec();
        UrunService urunService = new UrunService();
        Urun secilenUrun = urunService.urunSec();
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
