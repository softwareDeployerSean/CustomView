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

public class CanvasbyBasePath extends View {
    Path path = new Path();
    RectF rectF = new RectF(200, 200, 400, 400);

    {
        path.addCircle(200, 200, 100, Path.Direction.CW);
        path.addRect(rectF, Path.Direction.CW);
    }

    public CanvasbyBasePath(Context context) {
        super(context);
    }

    public CanvasbyBasePath(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CanvasbyBasePath(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        canvas.drawPath(path, paint);
    }
}
