package com.stuffkhazana.www.customlist;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Darpan Garg on 26-07-2017.
 */

public class UserAdapter extends ArrayAdapter <User> {

    Context context;
    int resource;
    ArrayList<User> userlist;


    public UserAdapter(Context context, int resource,ArrayList<User> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        userlist = objects;



    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = null;
        view = LayoutInflater.from(context).inflate(resource,parent,false);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        TextView textName = (TextView) view.findViewById(R.id.textViewName);
        TextView textPhone = (TextView) view.findViewById(R.id.textViewPhone);

        User user = userlist.get(position);
        imageView.setBackgroundResource(user.getIcon());
        textName.setText(user.getName());
        textPhone.setText(user.getPhone());


        return view;
    }
}
