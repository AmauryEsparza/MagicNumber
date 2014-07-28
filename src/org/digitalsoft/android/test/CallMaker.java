package org.digitalsoft.android.test;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class CallMaker {
	public static void skype(String targetContact, Context context) throws ActivityNotFoundException {
		Intent intent = new Intent("android.intent.action.VIEW");
		String URI = "skype:" + targetContact + "?chat";
		intent.setData(Uri.parse(URI));
		context.startActivity(intent);
	}
	
	public static void viber(String targetContact, Context context) {
		Intent intent = new Intent("android.intent.action.VIEW");
		intent.setClassName("com.viber.voip", "com.viber.voip.WelcomeActivity");
		Uri uri = Uri.parse("tel:" + Uri.encode(targetContact)); 
		intent.setData(uri); 
		context.startActivity(intent);
	}


	public static void dilaer(String targetContact, Context context) {
		Intent intent = new Intent(Intent.ACTION_CALL);
		String URI = "tel:" + targetContact;
		intent.setData(Uri.parse(URI));
		context.startActivity(intent);
	}
	
	
	public static void sms(String targetContact, Context context) {		
		Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
		smsIntent.addCategory(Intent.CATEGORY_DEFAULT);
		smsIntent.setDataAndType(Uri.parse("sms:" + targetContact), "vnd.android-dir/mms-sms");
		context.startActivity(smsIntent);	
	}

	
	public static void email(String targetContact, Context context) {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		String URI = "mailto:" + targetContact;
		Uri data = Uri.parse(URI);
		intent.setData(data);
		context.startActivity(intent);
	}

}
