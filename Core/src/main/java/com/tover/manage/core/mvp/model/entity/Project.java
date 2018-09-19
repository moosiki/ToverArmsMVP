package com.tover.manage.core.mvp.model.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Author by Mryang.
 * Date on 2018/9/17.
 * Description 项目信息实体类
 */
public class Project {
    @SerializedName("APTITUDE_REQUIREMENT")
    private String aptitudeRequirement;
    @SerializedName("BIDDING_METHOD")
    private String biddingMethod;
    @SerializedName("BUDGET_CLERK")
    private String budgetClerk;
    @SerializedName("BUDGET_MODE")
    private String budgetMode;
    @SerializedName("BUILD_TIME")
    private String buildTime;
    @SerializedName("CONTRACT_MODEL")
    private String contractModel;
    @SerializedName("CONTRACT_NUMBER")
    private String contractNumber;
    @SerializedName("COST_RATE")
    private double costRate;
    @SerializedName("CREATE_TIME")
    private String createTime;
    @SerializedName("CURRENCY")
    private String currency;
    @SerializedName("DATA_CLERK")
    private String dataClerk;
    @SerializedName("DEPOSIT_DEDUCTION")
    private double depositDeduction;
    @SerializedName("DESIGN_UNIT")
    private String designUnit;
    @SerializedName("END_TIME")
    private String endTime;
    @SerializedName("HANDER")
    private String hander;
    @SerializedName("IMPLEMENT_DEPARTMENT")
    private String implementDepartment;
    @SerializedName("IMPORTANCE")
    private String importance;
    @SerializedName("INSPECTOR")
    private String inspector;
    @SerializedName("IS_BUILD")
    private int isBuild;
    @SerializedName("IS_DELETE")
    private int isDelete;
    @SerializedName("ITEM_NUMBER")
    private String itemNumber;
    @SerializedName("ITEM_TYPE")
    private String itemType;
    @SerializedName("MANAGER_PHONE")
    private String managerPhone;
    @SerializedName("MATERIAL_CLERK")
    private String materialClerk;
    @SerializedName("PAY_METHOD")
    private String payMethod;
    @SerializedName("PRINCIPAL_PHONE")
    private String principalPhone;
    @SerializedName("PROJECT_ADDRESS")
    private String projectAddress;
    @SerializedName("PROJECT_AREA")
    private String projectArea;
    @SerializedName("PROJECT_COST")
    private String projectCost;
    @SerializedName("PROJECT_DATE")
    private int projectDate;
    @SerializedName("PROJECT_DEPARTMENT")
    private String projectDepartment;
    @SerializedName("PROJECT_ID")
    private int projectId;
    @SerializedName("PROJECT_LEADER")
    private String projectLeader;
    @SerializedName("PROJECT_NAME")
    private String projectName;
    @SerializedName("PROJECT_NUMBER")
    private String projectNumber;
    @SerializedName("PROJECT_PERSON")
    private String projectPerson;
    @SerializedName("PROJECT_PROPERTIES")
    private String projectProperties;
    @SerializedName("PROJECT_RANK")
    private String projectRank;
    @SerializedName("PROJECT_RATE")
    private double projectRate;
    @SerializedName("PROJECT_TIME")
    private int projectTime;
    @SerializedName("PROJECT_TYPE")
    private String projectType;
    @SerializedName("PROJECT_UNIT")
    private String projectUnit;
    @SerializedName("QUALITY_GRADE")
    private String qualityGrade;
    @SerializedName("RISK_MARGIN")
    private double riskMargin;
    @SerializedName("SAFETY_OFFICER")
    private String safetyOfficer;
    @SerializedName("SETTLE_METHOD")
    private String settleMethod;
    @SerializedName("SUPERVISOR")
    private String supervisor;
    @SerializedName("SURVEYOR")
    private String surveyor;
    @SerializedName("TARCK_PERSON")
    private String tarckPerson;
    @SerializedName("TAX_RATE")
    private double taxRate;
    @SerializedName("WARRANTY_PROPORTION")
    private double warrantyProportion;
    @SerializedName("oa_project_id")
    private int oaProjectId;

    public String getAptitudeRequirement() {
        return aptitudeRequirement;
    }

    public void setAptitudeRequirement(String aptitudeRequirement) {
        this.aptitudeRequirement = aptitudeRequirement;
    }

    public String getBiddingMethod() {
        return biddingMethod;
    }

    public void setBiddingMethod(String biddingMethod) {
        this.biddingMethod = biddingMethod;
    }

    public String getBudgetClerk() {
        return budgetClerk;
    }

    public void setBudgetClerk(String budgetClerk) {
        this.budgetClerk = budgetClerk;
    }

    public String getBudgetMode() {
        return budgetMode;
    }

    public void setBudgetMode(String budgetMode) {
        this.budgetMode = budgetMode;
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }

    public String getContractModel() {
        return contractModel;
    }

    public void setContractModel(String contractModel) {
        this.contractModel = contractModel;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public double getCostRate() {
        return costRate;
    }

    public void setCostRate(double costRate) {
        this.costRate = costRate;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDataClerk() {
        return dataClerk;
    }

    public void setDataClerk(String dataClerk) {
        this.dataClerk = dataClerk;
    }

    public double getDepositDeduction() {
        return depositDeduction;
    }

    public void setDepositDeduction(double depositDeduction) {
        this.depositDeduction = depositDeduction;
    }

    public String getDesignUnit() {
        return designUnit;
    }

    public void setDesignUnit(String designUnit) {
        this.designUnit = designUnit;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getHander() {
        return hander;
    }

    public void setHander(String hander) {
        this.hander = hander;
    }

    public String getImplementDepartment() {
        return implementDepartment;
    }

    public void setImplementDepartment(String implementDepartment) {
        this.implementDepartment = implementDepartment;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public int getIsBuild() {
        return isBuild;
    }

    public void setIsBuild(int isBuild) {
        this.isBuild = isBuild;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public String getMaterialClerk() {
        return materialClerk;
    }

    public void setMaterialClerk(String materialClerk) {
        this.materialClerk = materialClerk;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getPrincipalPhone() {
        return principalPhone;
    }

    public void setPrincipalPhone(String principalPhone) {
        this.principalPhone = principalPhone;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public String getProjectArea() {
        return projectArea;
    }

    public void setProjectArea(String projectArea) {
        this.projectArea = projectArea;
    }

    public String getProjectCost() {
        return projectCost;
    }

    public void setProjectCost(String projectCost) {
        this.projectCost = projectCost;
    }

    public int getProjectDate() {
        return projectDate;
    }

    public void setProjectDate(int projectDate) {
        this.projectDate = projectDate;
    }

    public String getProjectDepartment() {
        return projectDepartment;
    }

    public void setProjectDepartment(String projectDepartment) {
        this.projectDepartment = projectDepartment;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getProjectPerson() {
        return projectPerson;
    }

    public void setProjectPerson(String projectPerson) {
        this.projectPerson = projectPerson;
    }

    public String getProjectProperties() {
        return projectProperties;
    }

    public void setProjectProperties(String projectProperties) {
        this.projectProperties = projectProperties;
    }

    public String getProjectRank() {
        return projectRank;
    }

    public void setProjectRank(String projectRank) {
        this.projectRank = projectRank;
    }

    public double getProjectRate() {
        return projectRate;
    }

    public void setProjectRate(double projectRate) {
        this.projectRate = projectRate;
    }

    public int getProjectTime() {
        return projectTime;
    }

    public void setProjectTime(int projectTime) {
        this.projectTime = projectTime;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectUnit() {
        return projectUnit;
    }

    public void setProjectUnit(String projectUnit) {
        this.projectUnit = projectUnit;
    }

    public String getQualityGrade() {
        return qualityGrade;
    }

    public void setQualityGrade(String qualityGrade) {
        this.qualityGrade = qualityGrade;
    }

    public double getRiskMargin() {
        return riskMargin;
    }

    public void setRiskMargin(double riskMargin) {
        this.riskMargin = riskMargin;
    }

    public String getSafetyOfficer() {
        return safetyOfficer;
    }

    public void setSafetyOfficer(String safetyOfficer) {
        this.safetyOfficer = safetyOfficer;
    }

    public String getSettleMethod() {
        return settleMethod;
    }

    public void setSettleMethod(String settleMethod) {
        this.settleMethod = settleMethod;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getSurveyor() {
        return surveyor;
    }

    public void setSurveyor(String surveyor) {
        this.surveyor = surveyor;
    }

    public String getTarckPerson() {
        return tarckPerson;
    }

    public void setTarckPerson(String tarckPerson) {
        this.tarckPerson = tarckPerson;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getWarrantyProportion() {
        return warrantyProportion;
    }

    public void setWarrantyProportion(double warrantyProportion) {
        this.warrantyProportion = warrantyProportion;
    }

    public int getOaProjectId() {
        return oaProjectId;
    }

    public void setOaProjectId(int oaProjectId) {
        this.oaProjectId = oaProjectId;
    }
}
