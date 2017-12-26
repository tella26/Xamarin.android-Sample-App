using Android.App;
using Android.Content;
using Com.Revtwo.Revtwolibcore;
using Android.Support.V4.App;
using Android.Graphics;
using Android.OS;

namespace XamarinSampleApp
{
    [BroadcastReceiver(Enabled = true)]
    [IntentFilter(new[] { "com.revtwo.action.NOTIFICATION" })]
    public class CustomNotificationReceiver : NotificationBroadcastReceiver
    {
        protected override void OnNotificationReceived(Context context, string ticketId, string message, int unreadMessages, bool inForeground)
        {

			if (Build.VERSION.SdkInt >= BuildVersionCodes.O)
			{

				string CHANNEL_ID = "R2Channel";
                Notification.Builder mNotificationBuilder = new Notification.Builder(context, CHANNEL_ID)
						.SetSmallIcon(Resource.Mipmap.ic_launcher_revtwo)
						.SetLargeIcon(BitmapFactory.DecodeResource(context.Resources, Resource.Mipmap.ic_launcher_revtwo))
						.SetColor(Color.Transparent)
						.SetContentTitle("New message")
						.SetContentText(message)
						.SetOngoing(false);

				Intent mIntent = new Intent(context, typeof(MainActivity));
				mIntent.SetAction(Intent.ActionMain);
				mIntent.AddCategory(Intent.CategoryLauncher);
				
                PendingIntent mPendingIntent = PendingIntent.GetActivity(context, 0, mIntent, PendingIntentFlags.OneShot);
				mNotificationBuilder.SetContentIntent(mPendingIntent);

				NotificationManager mNotificationManager = (NotificationManager)context.GetSystemService(Context.NotificationService);
				mNotificationManager.Notify(System.Convert.ToInt16(ticketId), mNotificationBuilder.Build());
 
                return;
            }


            NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(context)
                .SetContentTitle("New message")
                .SetContentText(message)
                .SetSmallIcon(Resource.Mipmap.ic_launcher_revtwo)
                .SetLargeIcon(BitmapFactory.DecodeResource(context.Resources, Resource.Mipmap.ic_launcher_revtwo))
                .SetColor(Color.Transparent)
                .SetDefaults(NotificationCompat.DefaultSound)
                .SetPriority(2);

            //Intent intent = context.PackageManager.GetLaunchIntentForPackage(context.PackageName);

            Intent intent = new Intent(context, typeof(MainActivity));
            intent.SetAction(Intent.ActionMain);
            intent.AddCategory(Intent.CategoryLauncher);
            //Long ticketIdArgValue = Long.valueOf(ticketId);
            //intent.putExtra("ticketId",ticketIdArgValue);
            //intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);

            PendingIntent pendingIntent = PendingIntent.GetActivity(context, 0, intent, PendingIntentFlags.OneShot);
            notificationBuilder.SetContentIntent(pendingIntent);

            NotificationManager notificationManager = (NotificationManager)context.GetSystemService(Context.NotificationService);
            notificationManager.Notify(System.Convert.ToInt16(ticketId), notificationBuilder.Build());
        }
    }
}