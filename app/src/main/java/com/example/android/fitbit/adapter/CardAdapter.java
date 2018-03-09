package com.example.android.fitbit.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.fitbit.R;
import com.example.android.fitbit.model.Set;

import java.util.ArrayList;

/**
 * Created by PCB on 3/8/2018.
 */

public class CardAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Set> sets;

    public CardAdapter(Context context, ArrayList<Set> sets) {
        this.context = context;
        this.sets = sets;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int object) {
        return sets.get(object);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = View.inflate(context, R.layout.list_items,null);
        }
        ImageView images = (ImageView) view.findViewById(R.id.imgView);
        TextView title = (TextView) view.findViewById(R.id.set_name);
        TextView day = (TextView) view.findViewById(R.id.day);

        Set set = sets.get(i);
        //images.setImageResource(set.g);

        return view;
    }
}
