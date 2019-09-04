package structure.flyweight;

/**
 * 非享元角色
 *
 * @author : chenbo
 * @date : 2019/9/4
 */
public class UnsharedConcreteFlyweight {
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
