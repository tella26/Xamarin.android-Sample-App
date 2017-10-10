﻿using Android.App;
using Android.Widget;
using Android.OS;
using Android.Content;
using Com.Revtwo.Revtwolibmodels.Enumerations;
using SampleApp;
using Com.Revtwo.Revtwolib;

namespace XamarinSampleApp
{
    [Activity(Label = "XamarinSampleApp", MainLauncher = true, Icon = "@drawable/icon")]
    public class MainActivity : Activity
    {
        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);

            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.Main);

            RevTwo.SetDomain("https://beta.revtwo.com/index.php/");

            RevTwoXamarin.RevTwo.Initialize("93D0B119-7D97-8A3A-5C9F-3945C8464AE0", "6gZPk4cxpj7rCzBfLSTbNQVtM", ModeEnum.R2modeDevelopment, true, this, () => {
                var activity = new Intent(this, typeof(DemoList));
                
                StartActivity(activity);
            }, (ex) => {/*error*/});
        }

}
}

