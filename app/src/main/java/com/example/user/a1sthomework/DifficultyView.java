package com.example.user.a1sthomework;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Locale;

public class DifficultyView extends LinearLayout {

    private ImageView mTitle;

    public DifficultyView(Context context) {
        this(context, null);
    }

    public DifficultyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.difficult_view, this, true);
        setOrientation(LinearLayout.VERTICAL);
        mTitle = (ImageView) findViewById(R.id.title);
    }

    public void setDifficulty(int difficulty, int stars) {
        String titleResource = String.format(Locale.US, "button_difficulty_%d_star_%d", difficulty, stars);
        int drawableResourceId = Shared.context.getResources().getIdentifier(titleResource, "drawable", Shared.context.getPackageName());
        mTitle.setImageResource(drawableResourceId);
    }

}
