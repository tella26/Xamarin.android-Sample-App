package mono.com.android.volley;


public class Response_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.android.volley.Response.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResponse:(Ljava/lang/Object;)V:GetOnResponse_Ljava_lang_Object_Handler:Com.Android.Volley.Response/IListenerInvoker, Volley\n" +
			"";
		mono.android.Runtime.register ("Com.Android.Volley.Response+IListenerImplementor, Volley, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Response_ListenerImplementor.class, __md_methods);
	}


	public Response_ListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Response_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Android.Volley.Response+IListenerImplementor, Volley, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onResponse (java.lang.Object p0)
	{
		n_onResponse (p0);
	}

	private native void n_onResponse (java.lang.Object p0);

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
