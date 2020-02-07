package com.kgisl.mvp.java.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.kgisl.mvp.R;
import com.kgisl.mvp.java.interfacees.MainScreenInterface;
import com.kgisl.mvp.java.model.User;
import com.kgisl.mvp.java.presenter.MainScreenPresenter;
import com.kgisl.mvp.java.view.adapter.MainscreenAdapter;

import java.util.ArrayList;
                                                    //Implement activity interface here to get the results
public class MainSCreen extends AppCompatActivity implements MainScreenInterface.mainscreenactivity {

    RecyclerView recyclerView;

    //Create presenter class
    MainScreenPresenter presenter;
    MainscreenAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen2);

        recyclerView=findViewById(R.id.recyler);

        //Intialize presnter inside onCreate
        presenter=new MainScreenPresenter(MainSCreen.this,MainSCreen.this);

        //Call the method of presenter
        /*

            If presenter method has params pass like this
            presenter.mainscreenpresenter(username,password);

        else pass like current method
        */
        presenter.mainscreenpresenter();

    }

    //Scuccess response
    @Override
    public void mainscreensuccess(ArrayList<User> users) {

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new MainscreenAdapter(MainSCreen.this,users);
        recyclerView.setAdapter(adapter);

    }

    //failure response
    @Override
    public void mainscreenerror(String error) {
        Toast.makeText(MainSCreen.this, "Error response", Toast.LENGTH_SHORT).show();
    }
}
