package mono.com.android.volley;


public class RequestQueue_RequestFinishedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.android.volley.RequestQueue.RequestFinishedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRequestFinished:(Lcom/android/volley/Request;)V:GetOnRequestFinished_Lcom_android_volley_Request_Handler:Com.Android.Volley.RequestQueue/IRequestFinishedListenerInvoker, Volley\n" +
			"";
		mono.android.Runtime.register ("Com.Android.Volley.RequestQueue+IRequestFinishedListenerImplementor, Volley, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", RequestQueue_RequestFinishedListenerImplementor.class, __md_methods);
	}


	public RequestQueue_RequestFinishedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == RequestQueue_RequestFinishedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Android.Volley.RequestQueue+IRequestFinishedListenerImplementor, Volley, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onRequestFinished (com.android.volley.Request p0)
	{
		n_onRequestFinished (p0);
	}

	private native void n_onRequestFinished (com.android.volley.Request p0);

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
