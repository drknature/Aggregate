package com.example.moveover.aggregate;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.widget.TextViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Button;

/**
 * Created by jeffreyli on 9/24/16.
 */
public class CustomSwipeAdapter extends PagerAdapter {

    private int[] image_resources = {R.drawable.icon, R.drawable.icon,
            R.drawable.icon, R.drawable.icon,
            R.drawable.icon, R.drawable.icon,
            R.drawable.icon, R.drawable.icon};
    private Context context;
    private LayoutInflater layoutInflater;

    public CustomSwipeAdapter (Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (RelativeLayout) object);
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        System.out.println("Adding " + position);
        System.out.println("new");
        final SeekBar seek;
        final TextView score;


        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View item_view = layoutInflater.inflate(R.layout.swipe_layout, container, false);

        ImageView imageView = (ImageView) item_view.findViewById(R.id.imageView);
        TextView textView = (TextView) item_view.findViewById(R.id.imagecount);



        score = (TextView) item_view.findViewById(R.id.score);

        seek = (SeekBar) item_view.findViewById(R.id.seekBar);
        seek.setMax(5);


        score.setText(seek.getProgress() + "/" + seek.getMax());
        seek.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progressed;

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progressed =  progress;
                        score.setText(seek.getProgress() + "/" + seek.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        score.setText(progressed+ "/" + seek.getMax());
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                        score.setText(progressed + "/" + seek.getMax());

                    }

                }
        );

        textView.setText("Question " + (position) + " of " + image_resources.length);
        container.addView(item_view);

        Button myButton = null;

        final Button but = (Button) item_view.findViewById(R.id.button);
        final ViewGroup ctn = container;
        final int pos = position;

        final CustomSwipeAdapter mine = this;
        //System.out.println("printing " + item_view);
        //        public myListener(ViewGroup my_ctn, int my_newPos, CustomSwipeAdapter my_mine, View my_item_view) {
        myListener listener = new myListener(container, position, mine, item_view);
        but.setOnClickListener(listener);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        System.out.println("Removing " + position);
        container.removeView((RelativeLayout) object);
    }

    class myListener implements View.OnClickListener {
        ViewGroup ctn;
        int newPos;
        CustomSwipeAdapter mine;
        View item_view;

        public myListener(ViewGroup my_ctn, int my_newPos, CustomSwipeAdapter my_mine, View my_item_view) {
            ctn = my_ctn;
            newPos = my_newPos;
            mine =my_mine;
            item_view = my_item_view;
        }
        @Override
        public void onClick(View v){

            mine.destroyItem(ctn, newPos, item_view);

            mine.instantiateItem(ctn, newPos);
        }
    }
}

