package com.example.androidunittestexample;

import org.greenrobot.eventbus.EventBus;

public class EventBusHelper {

    public static EventBus getEventBus() {
        return EventBus.getDefault();
    }
}
