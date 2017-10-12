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

namespace XamarinSampleApp
{
    [Activity(Label = "RevTwo")]
    public class SQLiteDatabaseActivity : Activity
    {
        TextView title;
        TextView back_text;
        LinearLayout back;
        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            SetContentView(Resource.Layout.activity_sqlite_database);
            RevTwoXamarin.RevTwo.RegisterActivityForScreenshare(this);


            title = FindViewById<TextView>(Resource.Id.lblDescriptionX);
            title.SetText(Resource.String.sqlite);

            back = FindViewById<LinearLayout>(Resource.Id.back);
            back_text = FindViewById<TextView>(Resource.Id.back_text);

            back_text.SetText(Resource.String.tutorials);
            back.Click += delegate {
                OnBackPressed();
            };
        }
    }
}