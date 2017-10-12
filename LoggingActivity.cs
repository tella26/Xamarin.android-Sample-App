using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using XamarinSampleApp;

namespace SampleApp
{
    [Activity(Label = "RevTwo")]
    public class LoggingActivity : Activity
    {
        LinearLayout back;
        TextView back_text;
        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            SetContentView(Resource.Layout.activity_logging);

            // Create your application here
            back = FindViewById<LinearLayout>(Resource.Id.back);
            back_text = FindViewById<TextView>(Resource.Id.back_text);

            Button traceBtn = FindViewById<Button>(Resource.Id.btnTraceLog1);
            traceBtn.Click += delegate {
                RevTwoXamarin.RevTwo.Trace("Trace Log Message", this);
            };

            Button debugBtn = FindViewById<Button>(Resource.Id.btnDebugLog1);
            debugBtn.Click += delegate {
                RevTwoXamarin.RevTwo.Trace("Debug Log Message", this);
            };

            Button warningBtn = FindViewById<Button>(Resource.Id.btnWarningLog1);
            warningBtn.Click += delegate {
                RevTwoXamarin.RevTwo.Trace("Warning Log Message", this);
            };

            Button ErorBtn = FindViewById<Button>(Resource.Id.btnErrorLog1);
            ErorBtn.Click += delegate {
                RevTwoXamarin.RevTwo.Trace("Error Log Message", this);
            };

            back_text.SetText(Resource.String.tutorials);
            back.Click += delegate {
                OnBackPressed();
            };
        }
    }
}