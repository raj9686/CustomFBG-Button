package com.fun.socialbutton;

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
public class CustumFacebookButton extends TextView {


    public CustumFacebookButton(Context context) {
        super(context);
        init();

    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public CustumFacebookButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustumFacebookButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CustumFacebookButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        this.setText("Sign in with Facebook");
        this.setBackgroundColor(Color.parseColor("#3b5998"));
        this.setTextColor(getResources().getColor(android.R.color.white));
        this.setGravity(Gravity.CENTER);
        this.setTextSize(18);
        Drawable draw = getResources().getDrawable(R.mipmap.ic_fb);
        this.setCompoundDrawablesWithIntrinsicBounds(draw, null, null, null);
    }

}


