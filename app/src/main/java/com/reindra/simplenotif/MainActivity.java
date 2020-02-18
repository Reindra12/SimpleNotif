package com.reindra.simplenotif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
    //aksi onclik button
        public void sendNotification(View view){

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://dicoding.com"));
            PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
            NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, CHANNEL_ID)
                    .setContentIntent(pendingIntent)
                    .setSmallIcon(R.drawable.baseline_notifications_white_18dp)
                    .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.baseline_notifications_white_18dp))
                    .setContentTitle(getResources().getString(R.string.content_title))
                    .setContentText(getResources().getString(R.string.content_text))
                    .setSubText(getResources().getString(R.string.subtext))
                    .setAutoCancel(true);
