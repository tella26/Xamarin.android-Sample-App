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
using static Android.Widget.AdapterView;
using XamarinSampleApp;

namespace SampleApp
{
    [Activity(Label = "RevTwo")]
    public class DemoList : ListActivity
    {
        static readonly string[] menuItems = new String[] { "Logging", "File browsing", "SQLite Database", "My ticket view", "Community view", "FAQ" };

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            SetContentView(Resource.Layout.demo_list);
            RevTwoXamarin.RevTwo.RegisterActivityForScreenshare(this);


            ListAdapter = new ArrayAdapter<string>(this, Resource.Layout.demo_list_item, Resource.Id.textView1,  menuItems);
            
            ListView.TextFilterEnabled = true;

            ListView.ItemClick += delegate (object sender, ItemClickEventArgs args)
            {
                if (args.Position == 0)
                {
                    var activity = new Intent(this, typeof(LoggingActivity));
                    StartActivity(activity);
                }
                if (args.Position == 1)
                {
                    var activity = new Intent(this, typeof(FileBrowsingActivity));
                    StartActivity(activity);
                }
                if (args.Position == 2)
                {
                    var activity = new Intent(this, typeof(SQLiteDatabaseActivity));
                    StartActivity(activity);
                }
                if (args.Position == 3)
                {
                    var activity = new Intent(this, typeof(Com.Revtwo.Revtwolib.MyTicketActivity));

                    // Provide tags that you want for ticket routing
                    activity.PutExtra(Com.Revtwo.Revtwolib.MyTicketActivity.Tags, new string[] { "yellow", "blue" });
                    activity.PutExtra(Com.Revtwo.Revtwolib.MyTicketActivity.TagBackButton, "Tutorials");

                    StartActivity(activity);
                }
                if (args.Position == 4)
                {
                    var activity = new Intent(this, typeof(Com.Revtwo.Revtwolib.CommunityActivity));

                    // Provide tags that you want for ticket routing
                    activity.PutExtra(Com.Revtwo.Revtwolib.CommunityActivity.Tags, new string[] { "yellow" });
                    activity.PutExtra(Com.Revtwo.Revtwolib.CommunityActivity.TagBackButton, "Tutorials");

                    StartActivity(activity);
                }
                if (args.Position == 5)
                {
                    var activity = new Intent(this, typeof(Com.Revtwo.Revtwolib.KBAnswersActivity));
                    StartActivity(activity);
                }
            };
        }
        
    }
}