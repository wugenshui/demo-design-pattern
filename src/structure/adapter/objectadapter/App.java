package structure.adapter.objectadapter;

import structure.adapter.classadapter.Adaptee;
import structure.adapter.classadapter.Target;

/**
 * 适配器模式：对象适配器模式
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class App {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
