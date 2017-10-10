package mono.com.firebase.client;


public class ChildEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.firebase.client.ChildEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCancelled:(Lcom/firebase/client/FirebaseError;)V:GetOnCancelled_Lcom_firebase_client_FirebaseError_Handler:Com.Firebase.Client.IChildEventListenerInvoker, RevTwo\n" +
			"n_onChildAdded:(Lcom/firebase/client/DataSnapshot;Ljava/lang/String;)V:GetOnChildAdded_Lcom_firebase_client_DataSnapshot_Ljava_lang_String_Handler:Com.Firebase.Client.IChildEventListenerInvoker, RevTwo\n" +
			"n_onChildChanged:(Lcom/firebase/client/DataSnapshot;Ljava/lang/String;)V:GetOnChildChanged_Lcom_firebase_client_DataSnapshot_Ljava_lang_String_Handler:Com.Firebase.Client.IChildEventListenerInvoker, RevTwo\n" +
			"n_onChildMoved:(Lcom/firebase/client/DataSnapshot;Ljava/lang/String;)V:GetOnChildMoved_Lcom_firebase_client_DataSnapshot_Ljava_lang_String_Handler:Com.Firebase.Client.IChildEventListenerInvoker, RevTwo\n" +
			"n_onChildRemoved:(Lcom/firebase/client/DataSnapshot;)V:GetOnChildRemoved_Lcom_firebase_client_DataSnapshot_Handler:Com.Firebase.Client.IChildEventListenerInvoker, RevTwo\n" +
			"";
		mono.android.Runtime.register ("Com.Firebase.Client.IChildEventListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ChildEventListenerImplementor.class, __md_methods);
	}


	public ChildEventListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ChildEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Firebase.Client.IChildEventListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCancelled (com.firebase.client.FirebaseError p0)
	{
		n_onCancelled (p0);
	}

	private native void n_onCancelled (com.firebase.client.FirebaseError p0);


	public void onChildAdded (com.firebase.client.DataSnapshot p0, java.lang.String p1)
	{
		n_onChildAdded (p0, p1);
	}

	private native void n_onChildAdded (com.firebase.client.DataSnapshot p0, java.lang.String p1);


	public void onChildChanged (com.firebase.client.DataSnapshot p0, java.lang.String p1)
	{
		n_onChildChanged (p0, p1);
	}

	private native void n_onChildChanged (com.firebase.client.DataSnapshot p0, java.lang.String p1);


	public void onChildMoved (com.firebase.client.DataSnapshot p0, java.lang.String p1)
	{
		n_onChildMoved (p0, p1);
	}

	private native void n_onChildMoved (com.firebase.client.DataSnapshot p0, java.lang.String p1);


	public void onChildRemoved (com.firebase.client.DataSnapshot p0)
	{
		n_onChildRemoved (p0);
	}

	private native void n_onChildRemoved (com.firebase.client.DataSnapshot p0);

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
