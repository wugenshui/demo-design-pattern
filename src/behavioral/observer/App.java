package behavioral.observer;

/**
 * 观察者（Observer）模式
 * 指多个对象间存在一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * 这种模式有时又称作发布-订阅模式、模型-视图模式
 * <p>
 * 优点如下。
 * 降低了目标与观察者之间的耦合关系，两者之间是抽象耦合关系。
 * 目标与观察者之间建立了一套触发机制。
 * <p>
 * 缺点如下。
 * 目标与观察者之间的依赖关系并没有完全解除，而且有可能出现循环引用。
 * 当观察者对象很多时，通知的发布会花费很多时间，影响程序的效率。
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public class App {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        subject.add(observer1);
        subject.add(observer2);
        subject.notifyObserver();
    }
}
