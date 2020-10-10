package com.zhym.responsesibilitychain;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/11 0011 0:24
 */
public abstract class Approver {

    Approver approver; //下一个处理者

    String name; //名字

    public Approver(String name) {
        this.name = name;
    }

    //下一个处理者
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //处理审批请求方法，让子类去具体处理，所以这里设置为抽象方法
    public abstract void processRequest(PurchaseRequest request) ;
}
