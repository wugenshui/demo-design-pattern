package creational.builder;

/**
 * 指挥者：调用建造者中的方法完成复杂对象的创建
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
