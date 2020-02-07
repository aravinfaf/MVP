package com.kgisl.mvp.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kgisl.mvp.R
import com.kgisl.mvp.interfaces.MainInterface
import com.kgisl.mvp.model.Model
import com.kgisl.mvp.presenter.MainPresenter
import com.kgisl.mvp.view.adapter.RecyclerAdapter

class MainActivity : AppCompatActivity() ,MainInterface.mainactivity{

    lateinit var recyclerView:RecyclerView
    lateinit var arrayList:ArrayList<Model>
    lateinit var adapter:RecyclerAdapter
    lateinit var presenter:MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recycerview)

        presenter= MainPresenter(this,this)
        presenter.presenter()
    }

    override fun mainsuccess(arrayList: ArrayList<Model>) {

        adapter= RecyclerAdapter(arrayList)
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        recyclerView.adapter=adapter
    }

    override fun mainerror(error: String) {
        Toast.makeText(applicationContext,"Error response",Toast.LENGTH_LONG).show()
    }
}
