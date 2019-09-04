package creational.factory.method;

/**
 * 具体产品：马类
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class Horse implements Animal {
    @Override
    public void show() {
        System.out.println("马儿：咴咴嘶");
    }
}
