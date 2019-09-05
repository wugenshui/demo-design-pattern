package behavioral.interpreter;

/**
 * @author : chenbo
 * @date : 2019/9/5
 */
public class AndExpression implements AbstractExpression {
    private AbstractExpression city;
    private AbstractExpression person;

    public AndExpression(AbstractExpression city, AbstractExpression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[] s = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}
