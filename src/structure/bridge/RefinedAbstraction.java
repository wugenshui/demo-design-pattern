package structure.bridge;

/**
 * 扩展抽象化角色
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化(RefinedAbstraction)角色被访问");
        implementor.operationImpl();
    }
}
