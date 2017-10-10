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
    [Activity(Label = "LoggingActivity")]
    public class LoggingActivity : Activity
    {
        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            SetContentView(Resource.Layout.activity_logging);

            // Create your application here

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

        }
    }
}