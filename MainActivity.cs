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

            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.Main);

            RevTwo.SetDomain("https://beta.revtwo.com/index.php/");

            RevTwoXamarin.RevTwo.Initialize("ADD YOUR KEY HERE", "ADD YOUR PRIVATE KEY HERE", ModeEnum.R2modeDevelopment, true, this, () => {
                var activity = new Intent(this, typeof(DemoList));
                
                StartActivity(activity);
            }, (ex) => {/*error*/});
        }

    }
}

