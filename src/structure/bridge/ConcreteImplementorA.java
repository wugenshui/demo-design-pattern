package structure.bridge;

/**
 * 具体实现化角色
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现化(ConcreteImplementor)角色被访问");
    }
}
