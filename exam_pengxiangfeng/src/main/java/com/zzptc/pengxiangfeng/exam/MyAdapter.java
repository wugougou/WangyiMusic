package com.zzptc.pengxiangfeng.exam;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

/**
 * Created by Administrator on 2017/6/21 021.
 */
//创建一个自定义适配器
public class MyAdapter extends BaseAdapter {
    private Context mContext;

    private int mImageHeight;

    private int[] mIds;

    private Bitmap bitmap;

    @Override
    public int getCount() {
        return mIds.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final ImageView imageView= new ImageView(mContext);
        if (position<mIds.length){
            int imaged=mIds[position];
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setLayoutParams(new Gallery.LayoutParams(Gallery.LayoutParams.MATCH_PARENT,mImageHeight));
            imageView.setImageBitmap(bitmap);
        }

        return imageView;

    }
}
