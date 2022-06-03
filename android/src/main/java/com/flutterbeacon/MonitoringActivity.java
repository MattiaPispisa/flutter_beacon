package com.flutterbeacon;

import android.app.Activity;

import org.altbeacon.beacon.MonitorNotifier;

public class MonitoringActivity extends Activity {
    final MonitorNotifier monitorNotifier;

    public MonitoringActivity(MonitorNotifier monitorNotifier) {
        this.monitorNotifier = monitorNotifier;
    }
}
