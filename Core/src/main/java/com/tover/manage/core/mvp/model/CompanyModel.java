package com.tover.manage.core.mvp.model;

import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;
import com.tover.manage.commonsdk.http.RspModel;
import com.tover.manage.core.mvp.Contract.CompanyContract;
import com.tover.manage.core.mvp.model.api.service.CompanyService;
import com.tover.manage.core.mvp.model.entity.Project;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Author by Mryang.
 * Date on 2018/9/17.
 * Description 公司信息模型类，用于获取数据
 */
public class CompanyModel extends BaseModel implements CompanyContract.Model{

    @Inject
    public CompanyModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    /**
     * 根据关键字获取项目
     * @param searchName 关键字
     * @param emplyeeId 用户id
     * @return 携带数据的模型
     */
    @Override
    public Observable<RspModel<Project>> getProject(String searchName, String emplyeeId){
        return mRepositoryManager
                .obtainRetrofitService(CompanyService.class)
                .getProject(searchName, emplyeeId);
    }
}
