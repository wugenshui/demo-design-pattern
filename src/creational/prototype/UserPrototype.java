package creational.prototype;

/**
 * @author : chenbo
 * @date : 2019/9/3
 */
public class UserPrototype implements Cloneable {

    private String name;

    private Integer age;

    public UserPrototype(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "UserPrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
