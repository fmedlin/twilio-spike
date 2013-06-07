package com.twotoasters.twilio_spike;

import android.content.Context;
import android.util.Log;

import com.twilio.client.Twilio;

public class ToasterPhone implements Twilio.InitListener {

	static public final String TAG = "ToasterPhone";

	public ToasterPhone(Context context) {
		Twilio.initialize(context, this);
	}

	@Override
	public void onInitialized() {
		Log.d(TAG, "Twilio SDK is ready");
	}

	@Override
	public void onError(Exception e) {
		Log.e(TAG, "Twilio SDK failed to start", e);
	}
}