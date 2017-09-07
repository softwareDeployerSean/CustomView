package com.example.khjbkj.customview.base_canvas_paint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.khjbkj.customview.R;

/**
 * Created by xiaotao on 2017/8/25.
 */

public class BaseCanvas extends View {
    private boolean round;
    private boolean CoverColor;

    public BaseCanvas(Context context) {
        super(context);
    }

    public BaseCanvas(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseCanvas(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 得到属性值
     *
     * @param context
     * @param attrs
     */
    private void getAttrs(Context context, AttributeSet attrs) {
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.myViewDefinedAttr);
        round = ta.getBoolean(R.styleable.myViewDefinedAttr_round, true);
        CoverColor = ta.getBoolean(R.styleable.myViewDefinedAttr_CoverColor, true);
        ta.recycle();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        //共有信息，画笔的颜色；
        paint.setColor(getResources().getColor(R.color.colorAccent));
        //paint 的style,
        paint.setStyle(Paint.Style.STROKE); // Style 修改为画线模式
        //stroke的宽度
        paint.setStrokeWidth(20);
        //抗锯齿
        paint.setAntiAlias(true);
        //坐标和半径，独有信息，画圆，paint公有信息；
        canvas.drawCircle(150, 50, 50, paint);
        paint.setColor(Color.parseColor("#13C143"));
        paint.setStyle(Paint.Style.FILL);
        Rect rect = new Rect(250, 50, 300, 500);
        canvas.drawRect(rect, paint);
        //填充颜色；
        canvas.drawColor(Color.parseColor("#88880000"));

    }
}
