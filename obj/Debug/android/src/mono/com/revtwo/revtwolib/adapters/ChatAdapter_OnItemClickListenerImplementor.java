package mono.com.revtwo.revtwolib.adapters;


public class ChatAdapter_OnItemClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.revtwo.revtwolib.adapters.ChatAdapter.OnItemClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onItemClick:(Lcom/revtwo/revtwolibmodels/message/ChatMessage;)V:GetOnItemClick_Lcom_revtwo_revtwolibmodels_message_ChatMessage_Handler:Com.Revtwo.Revtwolib.Adapters.ChatAdapter/IOnItemClickListenerInvoker, RevTwo\n" +
			"n_removeAnswersQuestion:()V:GetRemoveAnswersQuestionHandler:Com.Revtwo.Revtwolib.Adapters.ChatAdapter/IOnItemClickListenerInvoker, RevTwo\n" +
			"n_showFoundAnAnswer:(JLjava/lang/String;Ljava/lang/String;)V:GetShowFoundAnAnswer_JLjava_lang_String_Ljava_lang_String_Handler:Com.Revtwo.Revtwolib.Adapters.ChatAdapter/IOnItemClickListenerInvoker, RevTwo\n" +
			"";
		mono.android.Runtime.register ("Com.Revtwo.Revtwolib.Adapters.ChatAdapter+IOnItemClickListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ChatAdapter_OnItemClickListenerImplementor.class, __md_methods);
	}


	public ChatAdapter_OnItemClickListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ChatAdapter_OnItemClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Revtwo.Revtwolib.Adapters.ChatAdapter+IOnItemClickListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onItemClick (com.revtwo.revtwolibmodels.message.ChatMessage p0)
	{
		n_onItemClick (p0);
	}

	private native void n_onItemClick (com.revtwo.revtwolibmodels.message.ChatMessage p0);


	public void removeAnswersQuestion ()
	{
		n_removeAnswersQuestion ();
	}

	private native void n_removeAnswersQuestion ();


	public void showFoundAnAnswer (long p0, java.lang.String p1, java.lang.String p2)
	{
		n_showFoundAnAnswer (p0, p1, p2);
	}

	private native void n_showFoundAnAnswer (long p0, java.lang.String p1, java.lang.String p2);

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
