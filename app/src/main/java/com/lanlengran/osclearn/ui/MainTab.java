package com.lanlengran.osclearn.ui;

import com.lanlengran.osclearn.R;
import com.lanlengran.osclearn.viewpagerfragment.ExploreFragment;
import com.lanlengran.osclearn.viewpagerfragment.GeneralViewPagerFragment;
import com.lanlengran.osclearn.viewpagerfragment.MyInformationFragment;
import com.lanlengran.osclearn.viewpagerfragment.TweetsViewPagerFragment;

/**
 * Created by dobest on 2016/8/9.
 */
public enum MainTab {
    NEW(0,"综合", R.drawable.tab_icon_new, GeneralViewPagerFragment.class),
    TWEET(1,"动弹", R.drawable.tab_icon_tweet, TweetsViewPagerFragment.class),
    QUICK(2,"快速", R.drawable.tab_icon_new, null),
    EXPLORE(3,"发现", R.drawable.tab_icon_explore, ExploreFragment.class),
    ME(4,"我的", R.drawable.tab_icon_me, MyInformationFragment.class);

    private int idx;
    private String resName;
    private int resIcon;
    private Class<?> clz;
    private MainTab(int idx,String ResName,int ResIcon,Class cls){
        this.idx=idx;
        this.resName=ResName;
        this.resIcon=ResIcon;
        this.clz=cls;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public int getResIcon() {
        return resIcon;
    }

    public void setResIcon(int resIcon) {
        this.resIcon = resIcon;
    }

    public Class<?> getClz() {
        return clz;
    }

    public void setClz(Class<?> clz) {
        this.clz = clz;
    }
}
