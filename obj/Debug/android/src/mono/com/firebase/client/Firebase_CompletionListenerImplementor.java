package mono.com.firebase.client;


public class Firebase_CompletionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.firebase.client.Firebase.CompletionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onComplete:(Lcom/firebase/client/FirebaseError;Lcom/firebase/client/Firebase;)V:GetOnComplete_Lcom_firebase_client_FirebaseError_Lcom_firebase_client_Firebase_Handler:Com.Firebase.Client.Firebase/ICompletionListenerInvoker, RevTwo\n" +
			"";
		mono.android.Runtime.register ("Com.Firebase.Client.Firebase+ICompletionListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Firebase_CompletionListenerImplementor.class, __md_methods);
	}


	public Firebase_CompletionListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Firebase_CompletionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Firebase.Client.Firebase+ICompletionListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onComplete (com.firebase.client.FirebaseError p0, com.firebase.client.Firebase p1)
	{
		n_onComplete (p0, p1);
	}

	private native void n_onComplete (com.firebase.client.FirebaseError p0, com.firebase.client.Firebase p1);

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
