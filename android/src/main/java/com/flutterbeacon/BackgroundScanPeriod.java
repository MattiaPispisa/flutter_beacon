package com.flutterbeacon;

import java.util.Map;

public class BackgroundScanPeriod {
    final double backgroundBetweenScanPeriod;
    final double backgroundScanPeriod;

    private BackgroundScanPeriod(double backgroundBetweenScanPeriod, double backgroundScanPeriod) {
        this.backgroundBetweenScanPeriod = backgroundBetweenScanPeriod;
        this.backgroundScanPeriod = backgroundScanPeriod;
    }

    public static BackgroundScanPeriod fromMap(Map<String,Object> map) {
        final Object backgroundBetweenScanPeriod = map.get("backgroundBetweenScanPeriod");
        final Object backgroundScanPeriod = map.get("backgroundScanPeriod");
        return new BackgroundScanPeriod(backgroundBetweenScanPeriod == null ? 0 : (Double) backgroundBetweenScanPeriod, backgroundScanPeriod == null ? 1000 : (Double) backgroundScanPeriod ) ;
    }
}
