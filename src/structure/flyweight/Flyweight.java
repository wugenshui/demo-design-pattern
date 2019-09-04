package structure.flyweight;

/**
 * 抽象享元角色
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
interface Flyweight {
    void operation(UnsharedConcreteFlyweight state);
}
