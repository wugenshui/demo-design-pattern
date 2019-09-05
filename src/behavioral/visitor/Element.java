package behavioral.visitor;

/**
 * 抽象元素类
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public interface Element {
    void accept(Visitor visitor);
}
