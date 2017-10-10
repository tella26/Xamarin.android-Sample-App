package mono.com.revtwo.revtwolibcore;


public class CallerManager_IScreenShareListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.revtwo.revtwolibcore.CallerManager.IScreenShareListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onImageData:([BLjava/lang/String;)V:GetOnImageData_arrayBLjava_lang_String_Handler:Com.Revtwo.Revtwolibcore.CallerManager/IScreenShareListenerInvoker, RevTwo\n" +
			"";
		mono.android.Runtime.register ("Com.Revtwo.Revtwolibcore.CallerManager+IScreenShareListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CallerManager_IScreenShareListenerImplementor.class, __md_methods);
	}


	public CallerManager_IScreenShareListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CallerManager_IScreenShareListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Revtwo.Revtwolibcore.CallerManager+IScreenShareListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onImageData (byte[] p0, java.lang.String p1)
	{
		n_onImageData (p0, p1);
	}

	private native void n_onImageData (byte[] p0, java.lang.String p1);

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
