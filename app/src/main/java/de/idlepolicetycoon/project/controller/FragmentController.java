package de.idlepolicetycoon.project.controller;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import java.util.logging.Logger;

/**
 * Created by Dennis on 20.03.2018.
 */

public class FragmentController {

    private static AppCompatActivity appCompatActivity;

    public FragmentController(){}

    public void showFragmentAufView(int containerViewID, Fragment fragment, String fragmentTag){
        appCompatActivity.getSupportFragmentManager().beginTransaction().replace(containerViewID, fragment, fragmentTag).commit();
    }

    public void closeFragment(Fragment fragment){
        appCompatActivity.getSupportFragmentManager().beginTransaction().remove(fragment).commit();
    }

    public Fragment findFragmentByTag(String fragmentTag){
        return appCompatActivity.getSupportFragmentManager().findFragmentByTag(fragmentTag);
    }

    public Fragment findFragementById(int fragmentId){
        return appCompatActivity.getSupportFragmentManager().findFragmentById(fragmentId);
    }

    public AppCompatActivity getAppCompatActivity() {
        return appCompatActivity;
    }

    public void setAppCompatActivity(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }
}
