package structure.decorator;

/**
 * 具体构件角色
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class ConcreteComponent implements Component {
    public ConcreteComponent() {
        System.out.println("创建具体构建角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
