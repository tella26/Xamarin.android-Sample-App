package md5cbbb2fbbe10c56c03356c711f2e3e1a7;


public class CustomNotificationReceiver
	extends com.revtwo.revtwolibcore.NotificationBroadcastReceiver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onNotificationReceived:(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IZ)V:GetOnNotificationReceived_Landroid_content_Context_Ljava_lang_String_Ljava_lang_String_IZHandler\n" +
			"";
		mono.android.Runtime.register ("XamarinSampleApp.CustomNotificationReceiver, XamarinSampleApp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CustomNotificationReceiver.class, __md_methods);
	}


	public CustomNotificationReceiver () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CustomNotificationReceiver.class)
			mono.android.TypeManager.Activate ("XamarinSampleApp.CustomNotificationReceiver, XamarinSampleApp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onNotificationReceived (android.content.Context p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4)
	{
		n_onNotificationReceived (p0, p1, p2, p3, p4);
	}

	private native void n_onNotificationReceived (android.content.Context p0, java.lang.String p1, java.lang.String p2, int p3, boolean p4);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
