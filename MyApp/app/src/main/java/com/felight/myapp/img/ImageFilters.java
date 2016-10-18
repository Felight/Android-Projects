package com.felight.myapp.img;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;

/**
 * Created by vinaynoah on 17/01/17.
 */
public class ImageFilters {

    public static Bitmap toGrayscale(Bitmap bmpOriginal) {
        int width, height;
        height = bmpOriginal.getHeight();
        width = bmpOriginal.getWidth();

        Bitmap bitmapNew = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(bitmapNew);
        Paint paint = new Paint();
        ColorMatrix cm = new ColorMatrix();
        cm.setSaturation(0);
        ColorMatrixColorFilter f = new ColorMatrixColorFilter(cm);
        paint.setColorFilter(f);
        c.drawBitmap(bmpOriginal, 0, 0, paint);
        return bitmapNew;
    }

    public ImageFilters() {
    }


    public Bitmap bright(Bitmap bmpOriginal){

        int width, height;
        height = bmpOriginal.getHeight();
        width = bmpOriginal.getWidth();

        Bitmap bitmapNew = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);


        for(int i=0; i<bmpOriginal.getWidth(); i++){
            for(int j=0; j<bmpOriginal.getHeight(); j++){
                int p = bmpOriginal.getPixel(i, j);
                int r = Color.red(p);
                int g = Color.green(p);
                int b = Color.blue(p);
                int alpha = Color.alpha(p);

                r = 100  +  r;
                g = 100  + g;
                b = 100  + b;
                alpha = 100 + alpha;
                bitmapNew.setPixel(i, j, Color.argb(alpha, r, g, b));
            }
        }
        return bitmapNew;
    }

    public Bitmap dark(Bitmap bmpOriginal){
        int width, height;
        height = bmpOriginal.getHeight();
        width = bmpOriginal.getWidth();

        Bitmap bitmapNew = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

        for(int i=0; i<bmpOriginal.getWidth(); i++){
            for(int j=0; j<bmpOriginal.getHeight(); j++){
                int p = bmpOriginal.getPixel(i, j);
                int r = Color.red(p);
                int g = Color.green(p);
                int b = Color.blue(p);
                int alpha = Color.alpha(p);

                r =  r - 50;
                g =  g - 50;
                b =  b - 50;
                alpha = alpha -50;
                bitmapNew.setPixel(i, j, Color.argb(Color.alpha(p), r, g, b));
            }
        }
        return bitmapNew;
    }

}
