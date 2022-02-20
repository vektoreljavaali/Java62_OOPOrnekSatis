package com.vektorel.repository;

import com.vektorel.repository.entity.Satis;

import java.util.ArrayList;
import java.util.List;

public class SatisRepository {
    List<Satis> satisList = new ArrayList<>();

    /**
     * Satış bilgieleri verilen nesneyi listeye ekler.
     * @param satis
     */
    public void save(Satis satis){
        satisList.add(satis);
    }
}
