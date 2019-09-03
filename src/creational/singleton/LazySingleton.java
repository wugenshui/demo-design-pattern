package creational.singleton;

/**
 * 懒汉式单例类[不推荐使用]
 * 优点：Lazy Loading,同时解决的同步的问题
 * 缺点：方法进行同步效率太低
 *
 * @author : chenbo
 * @date : 2019/9/2
 */
public class LazySingleton {
    /**
     * 保证 instance 在所有线程中同步
     */
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
        // 避免类在外部被实例化
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}