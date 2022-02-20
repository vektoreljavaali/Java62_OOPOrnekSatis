package com.vektorel;

import com.vektorel.service.SatisService;

public class Runner {
    public static void main(String[] args) {
        /**
         * Presentation Layer - Sunum Katmanı - Garson
         * Services Layer - Aşçı -
         * Data Access Layer - Veri Katmanı - Ürünlerin temin edildiği depo v.s.
         */
        SatisService satisService = new SatisService();
        satisService.satisYap();
    }
}
