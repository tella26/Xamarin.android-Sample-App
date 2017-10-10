package mono.com.revtwo.revtwolib.adapters;


public class TicketAdapter_OnItemClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.revtwo.revtwolib.adapters.TicketAdapter.OnItemClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Lcom/revtwo/revtwolibmodels/models/Ticket;Landroid/view/View;I)V:GetOnClick_Lcom_revtwo_revtwolibmodels_models_Ticket_Landroid_view_View_IHandler:Com.Revtwo.Revtwolib.Adapters.TicketAdapter/IOnItemClickListenerInvoker, RevTwo\n" +
			"";
		mono.android.Runtime.register ("Com.Revtwo.Revtwolib.Adapters.TicketAdapter+IOnItemClickListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", TicketAdapter_OnItemClickListenerImplementor.class, __md_methods);
	}


	public TicketAdapter_OnItemClickListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == TicketAdapter_OnItemClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Revtwo.Revtwolib.Adapters.TicketAdapter+IOnItemClickListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onClick (com.revtwo.revtwolibmodels.models.Ticket p0, android.view.View p1, int p2)
	{
		n_onClick (p0, p1, p2);
	}

	private native void n_onClick (com.revtwo.revtwolibmodels.models.Ticket p0, android.view.View p1, int p2);

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
