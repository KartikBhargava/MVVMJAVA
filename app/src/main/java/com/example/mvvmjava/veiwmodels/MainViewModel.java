package com.example.mvvmjava.veiwmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

     public MutableLiveData<String> name = new MutableLiveData<String>();
    public  MutableLiveData<String> age  = new MutableLiveData<String>();


}
