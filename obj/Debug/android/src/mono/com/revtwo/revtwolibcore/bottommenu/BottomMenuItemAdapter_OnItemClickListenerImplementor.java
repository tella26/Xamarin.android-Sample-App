package mono.com.revtwo.revtwolibcore.bottommenu;


public class BottomMenuItemAdapter_OnItemClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.revtwo.revtwolibcore.bottommenu.BottomMenuItemAdapter.OnItemClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onItemClick:(Lcom/revtwo/revtwolibcore/bottommenu/BottomMenuItem;I)V:GetOnItemClick_Lcom_revtwo_revtwolibcore_bottommenu_BottomMenuItem_IHandler:Com.Revtwo.Revtwolibcore.Bottommenu.BottomMenuItemAdapter/IOnItemClickListenerInvoker, RevTwo\n" +
			"";
		mono.android.Runtime.register ("Com.Revtwo.Revtwolibcore.Bottommenu.BottomMenuItemAdapter+IOnItemClickListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", BottomMenuItemAdapter_OnItemClickListenerImplementor.class, __md_methods);
	}


	public BottomMenuItemAdapter_OnItemClickListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == BottomMenuItemAdapter_OnItemClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Revtwo.Revtwolibcore.Bottommenu.BottomMenuItemAdapter+IOnItemClickListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onItemClick (com.revtwo.revtwolibcore.bottommenu.BottomMenuItem p0, int p1)
	{
		n_onItemClick (p0, p1);
	}

	private native void n_onItemClick (com.revtwo.revtwolibcore.bottommenu.BottomMenuItem p0, int p1);

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
