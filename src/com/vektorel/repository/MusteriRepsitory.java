package com.vektorel.repository;

import com.vektorel.repository.entity.Musteri;

import java.util.ArrayList;
import java.util.List;

public class MusteriRepsitory {
    /**
     * Temel olarak verilerin depolandığı yerden alınarak
     * istenilen şekilde sunulmasını yapar.
     * 1- Herhangi bir depolama yeri olmadan hafıza veriler
     * tutularak sanal verilerle çalışılabilir.
     * 2- Geçici veritabanlarından veriler işlenere alınabilir.
     * 3- Sabit veritabanlarından bağlantı kurularak veriler
     * alınır ve işlenerek sunulur.
     * - Bir veriyi kaydetmek
     * - Bir veriyi silmek
     * - Bir veriyi düzenlemek
     * - Bir veriyi Listelemek
     * - Aranılan bir veriyi kriterlere göre listelemek
     * - v.s.
     */
    /**
     * Müşteri listesninin içine sadece müşteri nesneleri atılır.
     */
    // Liste tanımlama          Initialize - Başlatmak.
    private List<Musteri> musteriList = new ArrayList<>();

    public void RastGeleMusteriListesiOlustur(){

        Musteri musteri = new Musteri();
        musteri.setId(1L);
        musteri.setAd("Müşteri-");
        musteri.setSoyad("Soyad-");
        musteri.setAdres("Ankara");
        musteri.setTckimlik("121321123213");
        musteri.setTelefon("0 555 444 1144");
        /**
         * Muşteri Listesi-> add(ekle)-> musteri nesnesi
         */
        musteriList.add(musteri);
    }
}
