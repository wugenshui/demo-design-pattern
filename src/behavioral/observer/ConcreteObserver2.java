package behavioral.observer;

/**
 * @author : chenbo
 * @date : 2019/9/5
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}
