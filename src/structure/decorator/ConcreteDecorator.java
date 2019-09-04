package structure.decorator;

/**
 * @author : chenbo
 * @date : 2019/9/4
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addFunction();
    }

    public void addFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}
