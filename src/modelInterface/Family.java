package modelInterface;

public class Family {

    private String name;

    public Family(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                '}';
    }
}
