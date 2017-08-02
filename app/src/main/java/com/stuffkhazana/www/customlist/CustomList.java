package com.stuffkhazana.www.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomList extends AppCompatActivity {

    ListView listView;
    ArrayList<User> userlist;
    UserAdapter adapter;

    void initlist(){
        listView = (ListView)findViewById(R.id.listView);
        User u1 = new User(R.drawable.m1,"Simu","9501503826");
        User u2 = new User(R.drawable.m2,"Rattu","9779485016");
        User u3 = new User(R.drawable.m3,"Purr","9888693514");

        userlist =  new ArrayList<User>();
        userlist.add(u1);
        userlist.add(u2);
        userlist.add(u3);

        adapter = new UserAdapter(this,R.layout.list_item,userlist);
        listView.setAdapter(adapter);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        initlist();
    }
}
