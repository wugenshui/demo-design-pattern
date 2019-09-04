package structure.proxy;

/**
 * @author : chenbo
 * @date : 2019/9/4
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("--真实请求--");
    }
}
