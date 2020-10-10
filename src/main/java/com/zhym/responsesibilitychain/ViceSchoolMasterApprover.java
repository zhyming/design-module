package com.zhym.responsesibilitychain;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/11 0011 0:32
 */
public class ViceSchoolMasterApprover extends Approver{
    public ViceSchoolMasterApprover(String name) {

        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (10000 < request.getPrice() && request.getPrice() <= 30000) {
            System.out.println("请求编号 id = " + request.getId() + "被 " + this.name + "处理");
        }else {
            approver.processRequest(request);
        }
    }
}
