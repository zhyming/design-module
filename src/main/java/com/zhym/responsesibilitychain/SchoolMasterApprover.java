package com.zhym.responsesibilitychain;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/11 0011 0:33
 */
public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name) {

        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (30000 < request.getPrice()) {
            System.out.println("请求编号 id = " + request.getId() + "被 " + this.name + "处理");
        }else {
            approver.processRequest(request);
        }
    }
}
