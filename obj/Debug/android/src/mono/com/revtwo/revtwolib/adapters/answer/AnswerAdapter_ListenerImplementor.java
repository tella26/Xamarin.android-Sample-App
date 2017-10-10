package mono.com.revtwo.revtwolib.adapters.answer;


public class AnswerAdapter_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.revtwo.revtwolib.adapters.answer.AnswerAdapter.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnswerClicked:(Ljava/lang/String;Ljava/lang/String;)V:GetOnAnswerClicked_Ljava_lang_String_Ljava_lang_String_Handler:Com.Revtwo.Revtwolib.Adapters.Answer.AnswerAdapter/IListenerInvoker, RevTwo\n" +
			"n_onAskQuestionClicked:()V:GetOnAskQuestionClickedHandler:Com.Revtwo.Revtwolib.Adapters.Answer.AnswerAdapter/IListenerInvoker, RevTwo\n" +
			"n_onCategoryClicked:(I)V:GetOnCategoryClicked_IHandler:Com.Revtwo.Revtwolib.Adapters.Answer.AnswerAdapter/IListenerInvoker, RevTwo\n" +
			"";
		mono.android.Runtime.register ("Com.Revtwo.Revtwolib.Adapters.Answer.AnswerAdapter+IListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AnswerAdapter_ListenerImplementor.class, __md_methods);
	}


	public AnswerAdapter_ListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AnswerAdapter_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Revtwo.Revtwolib.Adapters.Answer.AnswerAdapter+IListenerImplementor, RevTwo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onAnswerClicked (java.lang.String p0, java.lang.String p1)
	{
		n_onAnswerClicked (p0, p1);
	}

	private native void n_onAnswerClicked (java.lang.String p0, java.lang.String p1);


	public void onAskQuestionClicked ()
	{
		n_onAskQuestionClicked ();
	}

	private native void n_onAskQuestionClicked ();


	public void onCategoryClicked (int p0)
	{
		n_onCategoryClicked (p0);
	}

	private native void n_onCategoryClicked (int p0);

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
