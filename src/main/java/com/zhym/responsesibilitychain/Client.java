package com.zhym.responsesibilitychain;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/11 0011 0:33
 */
public class Client {

    public static void main(String[] args) {
        //创建一个请求

        PurchaseRequest request = new PurchaseRequest(1, 2000, 1);

        //创建相关审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("王主任");

        CollegeApprover collegeApprover = new CollegeApprover("王院长");

        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校长");

        SchoolMasterApprover masterApprover = new SchoolMasterApprover("王校长");

        //需要将各个审批人下个级别处理者设置好(处理人构成一个环形)
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(masterApprover);
        masterApprover.setApprover(departmentApprover);

        viceSchoolMasterApprover.processRequest(request);
    }
}
