package org.digitalsoft.android.test;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

public class CallMaker {
	public static void skype(String targetContact, Context context) throws ActivityNotFoundException {
		// Intent sky = new Intent("android.intent.action.CALL_PRIVILEGED");
		// the above line tries to create an intent for which the skype app doesn't supply public api
		Intent intent = new Intent("android.intent.action.VIEW");
		String URI = "skype:" + targetContact + "?call";
		intent.setData(Uri.parse(URI));
		Log.d(Config.logTag, "skype:" + targetContact);
		context.startActivity(intent);
	}

	public static void dilaer(String targetContact, Context context) {
		Intent intent = new Intent(Intent.ACTION_CALL);
		String URI = "tel:" + targetContact;
		intent.setData(Uri.parse(URI));
		Log.d(Config.logTag, "dilaer:" + targetContact);
		context.startActivity(intent);
	}
	
	public static void email(String targetContact, Context context) {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		String URI = "mailto:" + targetContact;
		Uri data = Uri.parse(URI);
		intent.setData(data);
		context.startActivity(intent);
	}

}
