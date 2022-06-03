package com.flutterbeacon;

import java.util.Map;

public class ForegroundNotification {
    final String channelId;
    final String channelName;

    final String notificationTitle;
    final String notificationMessage;
    final String icon;

    private ForegroundNotification(String channelId, String channelName, String notificationTitle, String notificationMessage, String icon) {
        this.channelId = channelId;
        this.channelName = channelName;
        this.notificationTitle = notificationTitle;
        this.notificationMessage = notificationMessage;
        this.icon = icon;
    }

    static public ForegroundNotification fromMap(Map<String,Object> map) {
        final Object notificationMessage = map.get("notificationMessage");
        return new ForegroundNotification((String) map.get("channelId"),(String) map.get("channelName"),(String) map.get("notificationTitle"),notificationMessage == null ? null : (String) notificationMessage,(String) map.get("icon"));
    }
}
