package md58b178aea055a91c19600bdca38d4a377;


public class RevTwo_RevTwoInitializationCallback
	extends com.revtwo.revtwolibmodels.callback.Callback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSuccess:(Ljava/lang/Object;)V:GetOnSuccess_Ljava_lang_Object_Handler\n" +
			"n_onError:(Ljava/lang/Throwable;)V:GetOnError_Ljava_lang_Throwable_Handler\n" +
			"";
		mono.android.Runtime.register ("RevTwoXamarin.RevTwo+RevTwoInitializationCallback, RevTwoXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", RevTwo_RevTwoInitializationCallback.class, __md_methods);
	}


	public RevTwo_RevTwoInitializationCallback () throws java.lang.Throwable
	{
		super ();
		if (getClass () == RevTwo_RevTwoInitializationCallback.class)
			mono.android.TypeManager.Activate ("RevTwoXamarin.RevTwo+RevTwoInitializationCallback, RevTwoXamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onSuccess (java.lang.Object p0)
	{
		n_onSuccess (p0);
	}

	private native void n_onSuccess (java.lang.Object p0);


	public void onError (java.lang.Throwable p0)
	{
		n_onError (p0);
	}

	private native void n_onError (java.lang.Throwable p0);

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
