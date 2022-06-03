package com.flutterbeacon;

import java.util.Map;

public class BackgroundSettings {
    final BackgroundScanPeriod backgroundScanPeriod;
    final ForegroundNotification foregroundNotification;

    private BackgroundSettings(BackgroundScanPeriod backgroundScanPeriod, ForegroundNotification foregroundNotification) {
        this.backgroundScanPeriod = backgroundScanPeriod;
        this.foregroundNotification = foregroundNotification;
    }

    public static BackgroundSettings fromMap(Map<String,Object> map) {
        return new BackgroundSettings(BackgroundScanPeriod.fromMap((Map<String, Object>) map.get("backgroundScanPeriod")),ForegroundNotification.fromMap( (Map<String, Object>) map.get("foregroundNotification")));
    }
}
