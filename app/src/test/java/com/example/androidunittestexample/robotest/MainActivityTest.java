package com.example.androidunittestexample.robotest;

import android.widget.TextView;
import com.example.androidunittestexample.ChangeGreetingEvent;
import com.example.androidunittestexample.EventBusHelper;
import com.example.androidunittestexample.MainActivity;
import com.example.androidunittestexample.R;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

//import org.ro

//import org.robolectric.Robolectric.buildActivity;
import org.robolectric.android.controller.ActivityController;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void dummyTest1() {
        Assert.assertEquals(3, 3);
    }

    @Test
    public void constructMainActivity() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);

        TextView textView = activity.findViewById(R.id.helloTextView);

        Assert.assertEquals("Hello World!", textView.getText());
    }

    @Test
    public void greetingTextChangedViaEventBusMessage() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);

        ChangeGreetingEvent greetingEvent = new ChangeGreetingEvent("who's scruffy looking?");
        EventBusHelper.getEventBus().post(greetingEvent);

        TextView textView = activity.findViewById(R.id.helloTextView);

        Assert.assertEquals(greetingEvent.getMessage(), textView.getText());
    }
}
