class BackgroundServiceSettings {
  final bool enabled;
  final BackgroundScanPeriod backgroundScanPeriod;
  final ForegroundNotification foregroundNotification;

  const BackgroundServiceSettings({
    this.enabled = false,
    BackgroundScanPeriod backgroundScanPeriod = const BackgroundScanPeriod(),
    required this.foregroundNotification,
  }) : backgroundScanPeriod = backgroundScanPeriod;

  Map<String, dynamic> toMap() {
    return {
      "enabled": enabled,
      "backgroundScanPeriod": backgroundScanPeriod.toMap(),
      "foregroundNotification": foregroundNotification.toMap(),
    };
  }
}

class BackgroundScanPeriod {
  final double? backgroundBetweenScanPeriod;
  final double? backgroundScanPeriod;

  const BackgroundScanPeriod({this.backgroundBetweenScanPeriod, this.backgroundScanPeriod});

  Map<String, dynamic> toMap() {
    return {
      "backgroundBetweenScanPeriod": backgroundBetweenScanPeriod,
      "backgroundScanPeriod": backgroundScanPeriod,
    };
  }
}

class ForegroundNotification {
  final String channelId;
  final String channelName;

  final String notificationTitle;
  final String? notificationMessage;
  final String icon;

  const ForegroundNotification({
    required this.channelId,
    required this.channelName,
    required this.notificationTitle,
    this.notificationMessage,
    required this.icon,
  });

  Map<String, dynamic> toMap() {
    return {
      "channelId": channelId,
      "channelName": channelName,
      "notificationTitle": notificationTitle,
      "notificationMessage": notificationMessage,
      "icon": icon,
    };
  }
}
