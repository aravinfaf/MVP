package com.kgisl.mvp.presenter

import android.content.Context
import com.kgisl.mvp.interfaces.MainInterface
import com.kgisl.mvp.model.Model

public class MainPresenter(val context: Context, val view: MainInterface.mainactivity) : MainInterface.mainpresenter {

    lateinit var arrayList: ArrayList<Model>


    override fun presenter() {

        arrayList=ArrayList<Model>()

        arrayList.add(Model("Aravind","Kangeyam"))
        arrayList.add(Model("Aravind","Kangeyam"))
        arrayList.add(Model("Aravind","Kangeyam"))
        arrayList.add(Model("Aravind","Kangeyam"))
        arrayList.add(Model("Aravind","Kangeyam"))
        arrayList.add(Model("Aravind","Kangeyam"))
        arrayList.add(Model("Aravind","Kangeyam"))

        //If success response
        view.mainsuccess(arrayList)
    }
}