package creational.prototype;

/**
 * 原型（Prototype）模式
 * 用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。
 * 例如：Windows 操作系统的安装通常较耗时，如果复制就快了很多。
 *
 * @author : chenbo
 * @date : 2019/9/3
 */
public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        UserPrototype user1 = new UserPrototype("张三", 18);
        UserPrototype user2 = (UserPrototype) user1.clone();
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1 == user2);
    }
}
