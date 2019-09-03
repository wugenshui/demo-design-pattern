package creational.singleton;

/**
 * 饿汉式单例
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 *
 * @author : chenbo
 * @date : 2019/9/2
 */
public class HungrySingleton {
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
        // 避免类在外部被实例化
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
