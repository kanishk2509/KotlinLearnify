package com.kappstudio.apps.kotlin_learnify.Data.Factory;

import com.kappstudio.apps.kotlin_learnify.Bus.Event.BannerEvent;
import com.kappstudio.apps.kotlin_learnify.Bus.EventModel.BannerEventModel;
import com.kappstudio.apps.kotlin_learnify.Model.Object.Banner;

import java.util.ArrayList;

/**
 * Created by kanishk on 1/6/17.
 */

public class BannerDataManager {

    public static void getBanner(BannerEvent bannerEvent) {
        ArrayList<Banner> list = new ArrayList<>();
        list.add(new Banner("Post 1", "A new post using MVVM!", "https://cdn.pixabay.com/photo/2017/02/11/17/11/road-2058106_960_720.jpg"));
        list.add(new Banner("Post 1", "A new post using MVVM!", "https://cdn.pixabay.com/photo/2016/10/31/13/03/code-1785541_960_720.jpg"));
        list.add(new Banner("Post 1", "A new post using MVVM!", "https://cdn.pixabay.com/photo/2015/04/20/13/17/work-731198_960_720.jpg"));
        list.add(new Banner("Post 1", "A new post using MVVM!", "https://cdn.pixabay.com/photo/2016/11/30/20/44/computer-1873831_960_720.png"));
        BannerEventModel eventModel = new BannerEventModel(list);
        bannerEvent.onSetBanner(eventModel);
    }


}
