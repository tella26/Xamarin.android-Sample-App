package mono.com.firebase.client;


public class Firebase_AuthStateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.firebase.client.Firebase.AuthStateListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAuthStateChanged:(Lcom/firebase/client/AuthData;)V:GetOnAuthStateChanged_Lcom_firebase_client_AuthData_Handler:Com.Firebase.Client.Firebase/IAuthStateListenerInvoker, RevTwo\n" +
			"";
		mono.android.Runtime.register ("Com.Firebase.Client.Firebase+IAuthStateListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Firebase_AuthStateListenerImplementor.class, __md_methods);
	}


	public Firebase_AuthStateListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Firebase_AuthStateListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Firebase.Client.Firebase+IAuthStateListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onAuthStateChanged (com.firebase.client.AuthData p0)
	{
		n_onAuthStateChanged (p0);
	}

	private native void n_onAuthStateChanged (com.firebase.client.AuthData p0);

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
