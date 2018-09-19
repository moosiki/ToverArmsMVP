package com.tover.manage.module_reportform.mvp.model;

import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;
import com.tover.manage.module_reportform.mvp.contract.ReportFormContract;

import javax.inject.Inject;

public class ReportFormModel extends BaseModel implements ReportFormContract.Model{

    @Inject
    public ReportFormModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }
}
