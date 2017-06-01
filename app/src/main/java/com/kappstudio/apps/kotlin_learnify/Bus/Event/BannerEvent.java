package com.kappstudio.apps.kotlin_learnify.Bus.Event;

import com.kappstudio.apps.kotlin_learnify.Bus.EventModel.BannerEventModel;

/**
 * Created by kanishk on 1/6/17.
 */

public interface BannerEvent {
    void onSetBanner(BannerEventModel bannerEventModel);
    void onUpdateBanner(BannerEventModel bannerEventModel);
}
