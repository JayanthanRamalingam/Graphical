package com.jayanthan.graphical;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap bg = Bitmap.createBitmap(720,1280,Bitmap.Config.ARGB_8888);
        ImageView i = (ImageView)findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(bg));
        Canvas canvas=new Canvas(bg);
        Paint paint=new Paint();
        paint.setTextSize(25);
        paint.setColor(Color.GREEN);
        canvas.drawText("Rectangle",420,150,paint);
        canvas.drawRect(400,200,650,700,paint);
        canvas.drawText("Circle",120,150,paint);
        canvas.drawCircle(200,350,150,paint);
    }
}
