package com.example.khjbkj.customview.base_canvas_paint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by xiaotao on 2017/9/5.
 */

public class CanvasbyOvel extends View {
    public CanvasbyOvel(Context context) {
        super(context);
    }

    public CanvasbyOvel(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CanvasbyOvel(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#95BC10"));
        RectF rectF = new RectF(100, 100, 400, 600);
        //矩形
        canvas.drawRect(rectF, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#4E8DF5"));
        //矩形的内切圆
        canvas.drawOval(rectF, paint);

    }
}
