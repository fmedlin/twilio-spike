package com.twotoasters.twilio_spike;

import static org.fest.assertions.api.ANDROID.*;
import static org.junit.Assert.assertNotNull;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import com.twotoasters.twilio_spike.R;

@RunWith(RobolectricTestRunner.class) public class MainActivityTest {

    MainActivity activity;
    TextView boomText;

    @Before public void setUp() throws Exception {
        activity = new MainActivity();
        activity.onCreate(null);
        boomText = (TextView) activity.findViewById(R.id.text_boom);
    }

    @Test public void itShouldNotBeNull() {
    	assertNotNull(activity);
    	assertThat(boomText).containsText("Boom. Toasted.");
    }
}