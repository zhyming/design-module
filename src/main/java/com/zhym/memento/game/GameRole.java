package com.zhym.memento.game;

/**
 * @description:
 * @author: zhym
 * @time: 2020/10/10 0010 0:11
 */
public class GameRole {

    //攻击力
    private int vit;
    //防御力
    private int def;

    //创建一个备忘录对象Memento,即根据当前状态得到一个Memento
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    //从备忘录对象恢复角色状态
    public void recoverGameRoleFromMemento(Memento memento) {

        this.vit = memento.getVit();
        this.def = memento.getDef();

    }

    //显示当前角色状态
    public void display() {
        System.out.println("当前角色攻击力: " + this.vit);
        System.out.println("当前角色防御力: " + this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
