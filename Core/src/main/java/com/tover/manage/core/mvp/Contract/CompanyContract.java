package com.tover.manage.core.mvp.Contract;

import com.jess.arms.mvp.IModel;
import com.jess.arms.mvp.IView;
import com.tover.manage.commonsdk.http.RspModel;
import com.tover.manage.core.mvp.model.entity.Project;

import io.reactivex.Observable;

/**
 * Author by Mryang.
 * Date on 2018/9/17.
 * Description 公司信息契约类
 */
public interface CompanyContract {

    interface View extends IView{
        void getProjectSuccess();
    }

    interface Model extends IModel{
        Observable<RspModel<Project>> getProject(String searchName, String employeeId);
    }
}
