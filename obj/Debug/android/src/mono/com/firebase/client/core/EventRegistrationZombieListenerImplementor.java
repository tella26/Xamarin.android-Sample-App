package mono.com.firebase.client.core;


public class EventRegistrationZombieListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.firebase.client.core.EventRegistrationZombieListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onZombied:(Lcom/firebase/client/core/EventRegistration;)V:GetOnZombied_Lcom_firebase_client_core_EventRegistration_Handler:Com.Firebase.Client.Core.IEventRegistrationZombieListenerInvoker, RevTwo\n" +
			"";
		mono.android.Runtime.register ("Com.Firebase.Client.Core.IEventRegistrationZombieListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", EventRegistrationZombieListenerImplementor.class, __md_methods);
	}


	public EventRegistrationZombieListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == EventRegistrationZombieListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Firebase.Client.Core.IEventRegistrationZombieListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onZombied (com.firebase.client.core.EventRegistration p0)
	{
		n_onZombied (p0);
	}

	private native void n_onZombied (com.firebase.client.core.EventRegistration p0);

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
