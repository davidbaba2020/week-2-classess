public class Staff {
    private String name;
    private String department;

    public Staff(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public Staff() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
