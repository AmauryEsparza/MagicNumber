package org.digitalsoft.android.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class LaunchReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		String dialedNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);

		if (dialedNumber.matches(Config.numberRegEx)) {
			Log.d(Config.logTag, "The dialed number is " + dialedNumber);
			

			
			setResultData(null);
		}
	}


}