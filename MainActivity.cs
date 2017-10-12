using Android.App;
using Android.Widget;
using Android.OS;
using Android.Content;
using Com.Revtwo.Revtwolibmodels.Enumerations;
using SampleApp;
using Com.Revtwo.Revtwolib;

namespace XamarinSampleApp
{
    [Activity(Label = "RevTwo", MainLauncher = true, Icon = "@drawable/icon")]
    public class MainActivity : Activity
    {
        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);
            SetContentView(Resource.Layout.Main);

            RevTwoXamarin.RevTwo.RegisterActivityForScreenshare(this);
            RevTwoXamarin.RevTwo.Initialize("ADD YOUR KEY HERE", "ADD YOUR PRIVATE KEY HERE", ModeEnum.R2modeDevelopment, true, this, () => {
                var activity = new Intent(this, typeof(DemoList));
                
                StartActivity(activity);
            }, (ex) => {/*error*/});
        }

    }
}

