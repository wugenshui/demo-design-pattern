package creational.singleton;

/**
 * 双重检查【推荐使用】
 * 优点：线程安全；延迟加载；效率较高。
 *
 * @author : chenbo
 * @date : 2019/9/3
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton singleton;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
