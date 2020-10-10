package com.zhym.responsesibilitychain;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/11 0011 0:27
 */
public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {

        if (request.getPrice() <= 5000) {
            System.out.println("请求编号 id = " + request.getId() + "被 " + this.name + "处理");

        }else  {
            approver.processRequest(request);
        }
    }
}
