package xiaoheihei.example.com.canvas_test03;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by xhh on 2017/10/11.
 */

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int baseLineX = 0;
        int baseLineY = 200;
        Paint paint  = new Paint();
        paint.setColor(Color.RED);
        canvas.drawLine(baseLineX, baseLineY, 3000, baseLineY, paint);
        //写文字
        paint.setColor(Color.GREEN);
        paint.setTextSize(120); //以px为单位
        paint.setTextAlign(Paint.Align.LEFT);//设置绘制的文本相对绘制点的位置  左边  右边 中间
        canvas.drawText("harvic\'s blog", baseLineX, baseLineY, paint);
    }
}
