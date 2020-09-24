package com.example.nabda_error;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter {

    private Context mcomtect;
    private int[] images=new int[]{R.drawable.pro1,R.drawable.pro2,R.drawable.pro3,R.drawable.pro4,R.drawable.pro5};
    public ImageAdapter(Context mcomtect) {
        this.mcomtect = mcomtect; }



    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView=new ImageView(mcomtect);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageResource(images[position]);
        container.addView(imageView,0);
        return imageView; }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }

}
