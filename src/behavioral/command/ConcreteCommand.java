package behavioral.command;

/**
 * 具体命令
 *
 * @author : chenbo
 * @date : 2019/9/5
 */
public class ConcreteCommand implements Command {
    private Receiver recever;

    public ConcreteCommand() {
        recever = new Receiver();
    }

    @Override
    public void execute() {
        recever.action();
    }
}
