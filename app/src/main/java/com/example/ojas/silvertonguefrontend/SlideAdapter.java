package com.example.ojas.silvertonguefrontend;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Ojas on 12/29/17.
 */

public class SlideAdapter extends PagerAdapter{
    Context context;
    LayoutInflater inflater;

    //Images below (list of them)
    public int[] first_images = {
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4
    };

    // List of Strings for slide titles

    public String[] first_title = {
            "Title 1",
            "Title 2",
            "Title 3",
            "Title 4"
    };

    //list of descriptions

    public String[] first_description = {
            "Description 1",
            "Description 2",
            "Description 3",
            "Description 4"
    };
    //List for background colors
    public int[] first_backgroundcolor = {
            Color.rgb(55, 55, 55),
            Color.rgb(239, 85, 85),
            Color.rgb(110, 49, 89),
            Color.rgb(1, 188, 212)
    };

    public SlideAdapter(Context context) {
        this.context = context;
    }



    @Override
    public int getCount() {
        return first_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container, false);
        LinearLayout layoutslide = view.findViewById(R.id.slidelinearlayout) ;
        ImageView imgslide = (ImageView)  view.findViewById(R.id.slideimg);
        TextView txttitle = (TextView) view.findViewById(R.id.txttitle);
        TextView description = (TextView)  view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundColor(first_backgroundcolor[position]);
        imgslide.setImageResource(first_images[position]);
        txttitle.setText(first_title[position]);
        description.setText(first_description[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
