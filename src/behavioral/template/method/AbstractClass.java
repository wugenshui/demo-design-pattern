package behavioral.template.method;

/**
 * 抽象类
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public abstract class AbstractClass {
    /**
     * 模板方法
     */
    public void templateMethod() {
        abstractMethod1();
        specificMethod();
        abstractMethod2();
    }

    /**
     * 具体方法
     */
    public void specificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    /**
     * 抽象方法1
     */
    public abstract void abstractMethod1();

    /**
     * 抽象方法2
     */
    public abstract void abstractMethod2();
}
