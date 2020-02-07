package com.kgisl.mvp.interfaces

import com.kgisl.mvp.model.Model

interface MainInterface {

    public interface mainpresenter{
        public fun presenter()
    }

    public interface mainactivity{
        public fun mainsuccess(arrayList:ArrayList<Model>)
        public fun mainerror(error:String)
    }
}