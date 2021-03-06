package com.lrony.mvpframe.presentation.fragment.second;

import com.lrony.mvpframe.mvp.MvpPresenter;
import com.lrony.mvpframe.mvp.MvpView;

import java.util.List;

/**
 * Created by Lrony on 18-4-10.
 */
public interface SecondContract {

    interface View extends MvpView {

        void setRefresh(boolean refresh);

        void showDatas(List<String> datas);
    }

    interface Presenter extends MvpPresenter<View> {

        void getDatas();
    }
}
