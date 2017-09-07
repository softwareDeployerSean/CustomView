package com.example.khjbkj.customview.base_canvas_paint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by xiaotao on 2017/9/5.
 */

public class CanvasbyBaseLine extends View {
    Path path = new Path();


    public CanvasbyBaseLine(Context context) {
        super(context);
    }

    public CanvasbyBaseLine(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CanvasbyBaseLine(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        path.lineTo(200, 100);
        path.rLineTo(-100, 500);
        path.rQuadTo(100, -200, 300, -300);
        path.moveTo(500, 100);
        path.rCubicTo(100, 100, 150, 200, 304, 350);
        paint.setStyle(Paint.Style.STROKE);
        RectF rectF = new RectF(100, 100, 300, 300);
        path.arcTo(rectF, -90, 90, false);
        canvas.drawPath(path, paint);
        paint.setStyle(Paint.Style.FILL);
        path.moveTo(100, 100);
        path.lineTo(200, 100);
        path.lineTo(150, 150);
        path.close();
        canvas.drawPath(path, paint);
    }
}
