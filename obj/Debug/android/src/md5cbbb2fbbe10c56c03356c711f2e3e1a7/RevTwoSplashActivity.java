package md5cbbb2fbbe10c56c03356c711f2e3e1a7;


public class RevTwoSplashActivity
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("XamarinSampleApp.RevTwoSplashActivity, XamarinSampleApp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", RevTwoSplashActivity.class, __md_methods);
	}


	public RevTwoSplashActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == RevTwoSplashActivity.class)
			mono.android.TypeManager.Activate ("XamarinSampleApp.RevTwoSplashActivity, XamarinSampleApp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

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
