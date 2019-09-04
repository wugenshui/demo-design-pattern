package creational.builder;

/**
 * 建造者（Builder）模式
 * 指将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示，这样的设计模式被称为建造者模式。
 *
 * 优点：
 * 各个具体的建造者相互独立，有利于系统的扩展。
 * 客户端不必知道产品内部组成的细节，便于控制细节风险。
 *
 * 缺点：
 * 产品的组成部分必须相同，这限制了其使用范围。
 * 如果产品的内部变化复杂，该模式会增加很多的建造者类。
 *
 * 例如
 * 游戏中的不同角色，其性别、个性、能力、脸型、体型、服装、发型等特性都有所差异
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class App {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
