package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    /**
     * 增加观察者方法
     *
     * @param observer 观察者
     */
    public void add(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者方法
     *
     * @param observer 观察者
     */
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者方法
     */
    public abstract void notifyObserver();
}
