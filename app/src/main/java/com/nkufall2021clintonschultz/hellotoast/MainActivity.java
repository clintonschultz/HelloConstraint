package com.nkufall2021clintonschultz.hellotoast;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorLong;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
                toast.show();
    }

    public void resetZero(View view) {
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(0));
            Button zero_button = (Button)findViewById(R.id.button_zero);
            zero_button.setBackgroundColor(Color.GRAY);
            mCount = 0;
            // change ZERO button back to GRAY - failed implementation
    }

    public void countUp(View view) {

        Button zero_button = (Button)findViewById(R.id.button_zero);
        zero_button.setBackgroundColor(-7829368);
        // change ZERO button color to PINK - failed implementation

        mCount++;
        final Button countButton = (Button) findViewById(R.id.button_count);

        if (mShowCount != null) mShowCount.setText(Integer.toString(mCount));

        if (mCount / 2 == 0) {
            view.setBackgroundColor(-65281);
            // change COUNT button to GREEN if even - failed implementation
        } else if (mCount / 2 != 0) {
            // change COUNT button color to CYAN if odd
        }
    }
}