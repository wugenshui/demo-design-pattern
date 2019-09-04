package structure.bridge;

/**
 * 抽象化角色
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
abstract class Abstraction {
    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
