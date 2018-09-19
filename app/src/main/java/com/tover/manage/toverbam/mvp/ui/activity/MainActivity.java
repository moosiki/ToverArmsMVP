package com.tover.manage.toverbam.mvp.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.tover.manage.commonsdk.core.RouterHub;
import com.tover.manage.commonsdk.utils.Utils;
import com.tover.manage.toverbam.R;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import dagger.BindsInstance;

/**
 * Author by Mryang.
 * Date on 2018/9/17.
 * Description
 */
@Route(path = RouterHub.APP_MAINACTIVITY, name = "app主页")
public class MainActivity extends BaseActivity implements BottomNavigationBar.OnTabSelectedListener{

    int lastSelectedPosition = 0;

    @BindView(R.id.main_bnb_bottom_navigation)
    BottomNavigationBar bottomBar;

    FragmentManager fragmentManager;
    FragmentTransaction transaction;

    Map<String,Fragment> fragments = new HashMap<String,Fragment>();
    String currentFragmentTAG;  //当前fragment的标记

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_main;

    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        initFragment();
        setDefaultFragment(0,"reportForm"); //报表
        initNavigaion();
    }

    public void initNavigaion(){
        bottomBar
                    .setMode(BottomNavigationBar.MODE_FIXED)
                    .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC)
                    .setBarBackgroundColor(R.color.public_white)
                    .setActiveColor(R.color.public_colorPrimary)
                    .setInActiveColor(R.color.public_color_CDD3D7);

        bottomBar
                    .addItem(new BottomNavigationItem(R.drawable.main_svg_reportform_menu,R.string.main_menu_report_form))
                    .addItem(new BottomNavigationItem(R.drawable.main_svg_cost_menu,R.string.main_menu_cost))
                    .addItem(new BottomNavigationItem(R.drawable.main_svg_gathering_menu,R.string.main_menu_gathering))
                    .addItem(new BottomNavigationItem(R.drawable.main_svg_function_menu,R.string.main_menu_function));
        bottomBar
                    .setFirstSelectedPosition(lastSelectedPosition)
                    .setTabSelectedListener(this)
                    .initialise();
    }

    /**
     * 加载所有fragment
     */
    public void initFragment(){
        addFragment("reportForm",RouterHub.REPORT_MAINFRAGMENT);
        addFragment("cost",RouterHub.COST_MAINFRAGMENT);
    }

    /**
     * 添加一个fragment到集合和管理器中
     * @param TAG 标签
     * @param path 路由地址
     */
    public void addFragment(String TAG, String path){
        fragments.put(TAG,Utils.naviFragment(path));
        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.main_fl_container,fragments.get(TAG),TAG);
        transaction.hide(fragments.get(TAG));
        transaction.commit();
    }
    /**
     * 设置初始页面
     * @param bottomBarOrder  底部导航编号 ，以0开始
     * @param TAG  初始fragment的标签
     */
    public void setDefaultFragment(int bottomBarOrder,String TAG){
        lastSelectedPosition = bottomBarOrder;
        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        transaction.show(fragments.get(TAG));
        transaction.commit();
        currentFragmentTAG = TAG;
    }

    /**
     * 底部导航切换监听
     * @param position  导航序号
     */
    @Override
    public void onTabSelected(int position) {
        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        switch (position){
            case 0:
                tranplaceFragment("reportForm",transaction);
                break;
            case 1:
                tranplaceFragment("cost",transaction);
                break;

            default:
                break;
        }
        //提交事务
        transaction.commit();
    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }

    /**
     * 切换fragment，使用hide，保留数据
     * @param newFragmentTAG 新fragment的标签
     * @param transaction 事务管理
     */
    public void tranplaceFragment(String newFragmentTAG,FragmentTransaction transaction){
        transaction.hide(fragments.get(currentFragmentTAG));
        transaction.show(fragments.get(newFragmentTAG));
        currentFragmentTAG = newFragmentTAG;
    }
}
