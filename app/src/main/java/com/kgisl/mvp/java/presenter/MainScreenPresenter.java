package com.kgisl.mvp.java.presenter;

import android.content.Context;

import com.kgisl.mvp.java.interfacees.MainScreenInterface;
import com.kgisl.mvp.java.model.User;

import java.util.ArrayList;

public class MainScreenPresenter implements MainScreenInterface.presenter {

    Context context;
    ArrayList<User> userArrayList;

    //activity interface to send the response(right or wrong) to activity
    MainScreenInterface.mainscreenactivity view;

    //Create constructor to call from activity
    public MainScreenPresenter(Context context,MainScreenInterface.mainscreenactivity view){
        this.context=context;
        this.view=view;
    }

    //API call(Retrofit or Volley.,etc)
    @Override
    public void mainscreenpresenter() {

        userArrayList=new ArrayList<>();

        userArrayList.add(new User("Karthi","RS PURAM"));
        userArrayList.add(new User("Karthi","RS PURAM"));
        userArrayList.add(new User("Karthi","RS PURAM"));
        userArrayList.add(new User("Karthi","RS PURAM"));
        userArrayList.add(new User("Karthi","RS PURAM"));

        //if success
        view.mainscreensuccess(userArrayList);

        //if failure
        // view.mainscreenerror("Server error");
    }
}
