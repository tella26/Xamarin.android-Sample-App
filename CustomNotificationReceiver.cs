using Android.App;
using Android.Content;
using Com.Revtwo.Revtwolibcore;
using Android.Support.V4.App;
using Android.Graphics;

namespace XamarinSampleApp
{
    public class CustomNotificationReceiver : NotificationBroadcastReceiver
    {
        protected override void OnNotificationReceived(Context context, string ticketId, string message, int unreadMessages, bool inForeground)
        {
            NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(context)
                .SetContentTitle("New message")
                .SetContentText(message)
                .SetSmallIcon(Resource.Drawable.Icon)
                //.SetLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher_revtwo))
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