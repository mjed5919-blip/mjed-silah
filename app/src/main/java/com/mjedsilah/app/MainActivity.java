
package com.mjedsilah.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("مرحباً بك في تطبيق مجد سيلة");
        text.setTextSize(24);
        text.setGravity(Gravity.CENTER);

        setContentView(text);
    }
}
