package org.digitalsoft.android.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class LaunchReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		String number = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
		String compareNumber = "\\+010.*";
		if (number.matches(compareNumber)) {
			Log.d("Bilal", "The dialed number is " + number);
			setResultData(null);
		}
	}

}