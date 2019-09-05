package behavioral.observer;

/**
 * 具体观察者1
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public class ConcreteObserver1 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}
