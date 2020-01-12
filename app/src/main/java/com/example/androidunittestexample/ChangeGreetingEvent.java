package com.example.androidunittestexample;

public class ChangeGreetingEvent {

    private String mMessage;

    public ChangeGreetingEvent(String message) {
        mMessage = message;
    }

    public String getMessage() {
        return mMessage;
    }
}
