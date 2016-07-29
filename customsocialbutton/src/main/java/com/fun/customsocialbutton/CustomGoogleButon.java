package com.fun.customsocialbutton;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

/**
 * Created by rajesh gauswami on 29-07-2016.
 */
public class CustomGoogleButon extends TextView {
    public CustomGoogleButon(Context context) {
        super(context);
        init();
    }

    public CustomGoogleButon(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomGoogleButon(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CustomGoogleButon(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        this.setText("Sign in with Google");
        this.setBackgroundColor(Color.parseColor("#F44336"));
        this.setTextColor(getResources().getColor(android.R.color.white));
        this.setGravity(Gravity.CENTER);
        this.setTextSize(18);
        Drawable draw = getResources().getDrawable(R.mipmap.ic_google_new);
        this.setCompoundDrawablesWithIntrinsicBounds(draw, null, null, null);
    }
}
