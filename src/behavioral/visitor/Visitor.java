package behavioral.visitor;

/**
 * 抽象访问者
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
interface Visitor {
    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}
