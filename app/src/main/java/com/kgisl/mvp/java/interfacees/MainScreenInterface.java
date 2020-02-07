package com.kgisl.mvp.java.interfacees;

import com.kgisl.mvp.java.model.User;

import java.util.ArrayList;

public interface MainScreenInterface {

    //Carry values from activity to presenter
    interface presenter{
        void mainscreenpresenter();
    }

    //Carry values from presenter to activity
    interface mainscreenactivity{
        void mainscreensuccess(ArrayList<User> users);
        void mainscreenerror(String error);
    }
}
