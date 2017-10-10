package mono.com.firebase.client;


public class Firebase_AuthListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.firebase.client.Firebase.AuthListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAuthError:(Lcom/firebase/client/FirebaseError;)V:GetOnAuthError_Lcom_firebase_client_FirebaseError_Handler:Com.Firebase.Client.Firebase/IAuthListenerInvoker, RevTwo\n" +
			"n_onAuthRevoked:(Lcom/firebase/client/FirebaseError;)V:GetOnAuthRevoked_Lcom_firebase_client_FirebaseError_Handler:Com.Firebase.Client.Firebase/IAuthListenerInvoker, RevTwo\n" +
			"n_onAuthSuccess:(Ljava/lang/Object;)V:GetOnAuthSuccess_Ljava_lang_Object_Handler:Com.Firebase.Client.Firebase/IAuthListenerInvoker, RevTwo\n" +
			"";
		mono.android.Runtime.register ("Com.Firebase.Client.Firebase+IAuthListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Firebase_AuthListenerImplementor.class, __md_methods);
	}


	public Firebase_AuthListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Firebase_AuthListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Firebase.Client.Firebase+IAuthListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onAuthError (com.firebase.client.FirebaseError p0)
	{
		n_onAuthError (p0);
	}

	private native void n_onAuthError (com.firebase.client.FirebaseError p0);


	public void onAuthRevoked (com.firebase.client.FirebaseError p0)
	{
		n_onAuthRevoked (p0);
	}

	private native void n_onAuthRevoked (com.firebase.client.FirebaseError p0);


	public void onAuthSuccess (java.lang.Object p0)
	{
		n_onAuthSuccess (p0);
	}

	private native void n_onAuthSuccess (java.lang.Object p0);

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
