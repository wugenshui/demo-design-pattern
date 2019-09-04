package creational.singleton;

/**
 * 单例模式
 * 指一个类只有一个实例，且该类能自行创建这个实例的一种模式
 * 例如：Windows 中只能打开一个任务管理器
 * <p>
 * 特点：
 * 单例类只有一个实例对象；
 * 该单例对象必须由单例类自行创建；
 * 单例类对外提供一个访问该单例的全局访问点；
 *
 * @author : chenbo
 * @date : 2019/9/2
 */
public class App {
    public static void main(String[] args) {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);

        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton1);
        System.out.println(hungrySingleton2);

        DoubleCheckSingleton doubleCheckSingleton1 = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton doubleCheckSingleton2 = DoubleCheckSingleton.getInstance();
        System.out.println(doubleCheckSingleton1);
        System.out.println(doubleCheckSingleton2);
    }
}
