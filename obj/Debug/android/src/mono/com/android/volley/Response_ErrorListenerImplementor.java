package mono.com.android.volley;


public class Response_ErrorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.android.volley.Response.ErrorListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onErrorResponse:(Lcom/android/volley/VolleyError;)V:GetOnErrorResponse_Lcom_android_volley_VolleyError_Handler:Com.Android.Volley.Response/IErrorListenerInvoker, Volley\n" +
			"";
		mono.android.Runtime.register ("Com.Android.Volley.Response+IErrorListenerImplementor, Volley, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Response_ErrorListenerImplementor.class, __md_methods);
	}


	public Response_ErrorListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Response_ErrorListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Android.Volley.Response+IErrorListenerImplementor, Volley, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onErrorResponse (com.android.volley.VolleyError p0)
	{
		n_onErrorResponse (p0);
	}

	private native void n_onErrorResponse (com.android.volley.VolleyError p0);

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
