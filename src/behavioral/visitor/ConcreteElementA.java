package behavioral.visitor;

/**
 * 具体元素A类
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "具体元素A的操作。";
    }
}
