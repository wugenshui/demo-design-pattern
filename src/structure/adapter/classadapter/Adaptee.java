package structure.adapter.classadapter;

/**
 * 适配者接口
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}
