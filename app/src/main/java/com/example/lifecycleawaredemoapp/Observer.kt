package com.example.lifecycleawaredemoapp

import android.util.Log
import androidx.lifecycle.*

class Observer: DefaultLifecycleObserver {

    /* @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
     fun onCreate(){
         Log.d("MAIN", "Observer OnCreate")
     }*/
    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.d("MAIN", "Observer OnCreate")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d("MAIN", "Observer OnResume")
    }


    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.d("MAIN", "Observer OnPause")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.d("MAIN", "Observer OnStop")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.d("MAIN", "Observer OnDestroy")
    }
    /*
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(){
        Log.d("MAIN", "Observer OnResume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause(){
        Log.d("MAIN", "Observer OnPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop(){
        Log.d("MAIN", "Observer OnStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy(){
        Log.d("MAIN", "Observer OnDestroy")
    }*/
}