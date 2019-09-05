package behavioral.visitor;

/**
 * 具体元素B类
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "具体元素B的操作。";
    }
}
