package behavioral.interpreter;

/**
 * 抽象表达式类
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public interface AbstractExpression {
    /**
     * 解释方法
     *
     * @param info 方法信息
     * @return 解释中断
     */
    boolean interpret(String info);
}
