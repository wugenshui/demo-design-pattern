package behavioral.interpreter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 终结符表达式类
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public class TerminalExpression implements AbstractExpression {
    private Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data) {
        Collections.addAll(set, data);
    }

    @Override
    public boolean interpret(String info) {
        return set.contains(info);
    }
}
