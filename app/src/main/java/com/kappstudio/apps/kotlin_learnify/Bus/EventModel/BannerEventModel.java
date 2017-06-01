package com.kappstudio.apps.kotlin_learnify.Bus.EventModel;

import com.kappstudio.apps.kotlin_learnify.Model.Object.Banner;

import java.util.ArrayList;

/**
 * Created by kanishk on 1/6/17.
 */

public class BannerEventModel {
    private ArrayList<Banner> bannerArrayList = new ArrayList<>();

    public BannerEventModel(ArrayList<Banner> bannerArrayList) {
        this.bannerArrayList = bannerArrayList;
    }

    public ArrayList<Banner> getBannerArrayList() {
        return bannerArrayList;
    }
}
