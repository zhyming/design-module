package com.zhym.responsesibilitychain;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/11 0011 0:30
 */
public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {

        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (5000 < request.getPrice() && request.getPrice() <= 10000) {
            System.out.println("请求编号 id = " + request.getId() + "被 " + this.name + "处理");
        }else {
            approver.processRequest(request);
        }
    }
}
