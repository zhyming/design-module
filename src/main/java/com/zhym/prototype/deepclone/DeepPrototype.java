package com.zhym.prototype.deepclone;

import java.io.*;

/**
 * @description:
 * @author: zhym
 * @time: 2020/9/27 0027 23:43
 */
public class DeepPrototype implements Serializable, Cloneable {

    private static final long serialVersionUID = 7047677609780002263L;
    private String name;

    private DeepCloneableTarget target;

    public DeepPrototype() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getTarget() {
        return target;
    }

    public void setTarget(DeepCloneableTarget target) {
        this.target = target;
    }

    //深拷贝--方式一:重写clone方法

    @Override
    protected Object clone() throws CloneNotSupportedException {

        //完成对基本数据类型clone
        Object deep = super.clone();
        //再对引用类型单独处理
        DeepPrototype prototype = (DeepPrototype)deep;
        prototype.target = (DeepCloneableTarget)target.clone();

        return prototype;
    }

    //深拷贝-- 方式二 通过对象的序列化实现
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //把当前对象以对象流方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype deep = (DeepPrototype) ois.readObject();

            return deep;

        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
