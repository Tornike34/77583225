import java.util.Objects;

public class Department {
    private long id;
    private String name;
    private String managerName;
    private long WorkersAmount;

    public Department(long id, String name, String managerName, long workersAmount) {
        this.id = id;
        this.name = name;
        this.managerName = managerName;
        WorkersAmount = workersAmount;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", managerName='" + managerName + '\'' +
                ", WorkersAmount=" + WorkersAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id && WorkersAmount == that.WorkersAmount && Objects.equals(name, that.name) && Objects.equals(managerName, that.managerName);
    }

}
