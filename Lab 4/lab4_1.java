public class lab4_1 {

    private int employeeIdPrivate;
    private String employeeNamePrivate;
    private String employeeDepartmentPrivate;

    public int employeeIdPublic;
    public String employeeNamePublic;
    public String employeeDepartmentPublic;

    protected int employeeIdProtected;
    protected String employeeNameProtected;
    protected String employeeDepartmentProtected;

    int employeeIdDefault;
    String employeeNameDefault;
    String employeeDepartmentDefault;

    // Setter methods (for private data members)
    private void setEmployeeIdPrivate(int id) {
        this.employeeIdPrivate = id;
    }

    private void setEmployeeNamePrivate(String name) {
        this.employeeNamePrivate = name;
    }

    private void setEmployeeDepartmentPrivate(String department) {
        this.employeeDepartmentPrivate = department;
    }

    // Getter methods (for private data members)
    private int getEmployeeIdPrivate() {
        return employeeIdPrivate;
    }

    private String getEmployeeNamePrivate() {
        return employeeNamePrivate;
    }

    private String getEmployeeDepartmentPrivate() {
        return employeeDepartmentPrivate;
    }

    // Setter methods (for public data members)
    public void setEmployeeIdPublic(int id) {
        this.employeeIdPublic = id;
    }

    public void setEmployeeNamePublic(String name) {
        this.employeeNamePublic = name;
    }

    public void setEmployeeDepartmentPublic(String department) {
        this.employeeDepartmentPublic = department;
    }

    // Getter methods (for public data members)
    public int getEmployeeIdPublic() {
        return employeeIdPublic;
    }

    public String getEmployeeNamePublic() {
        return employeeNamePublic;
    }

    public String getEmployeeDepartmentPublic() {
        return employeeDepartmentPublic;
    }

    // Setter methods (for protected data members)
    protected void setEmployeeIdProtected(int id) {
        this.employeeIdProtected = id;
    }

    protected void setEmployeeNameProtected(String name) {
        this.employeeNameProtected = name;
    }

    protected void setEmployeeDepartmentProtected(String department) {
        this.employeeDepartmentProtected = department;
    }

    // Getter methods (for protected data members)
    protected int getEmployeeIdProtected() {
        return employeeIdProtected;
    }

    protected String getEmployeeNameProtected() {
        return employeeNameProtected;
    }

    protected String getEmployeeDepartmentProtected() {
        return employeeDepartmentProtected;
    }

    // Setter methods (for default data members)
    void setEmployeeIdDefault(int id) {
        this.employeeIdDefault = id;
    }

    void setEmployeeNameDefault(String name) {
        this.employeeNameDefault = name;
    }

    void setEmployeeDepartmentDefault(String department) {
        this.employeeDepartmentDefault = department;
    }

    // Getter methods (for default data members)
    int getEmployeeIdDefault() {
        return employeeIdDefault;
    }

    String getEmployeeNameDefault() {
        return employeeNameDefault;
    }

    String getEmployeeDepartmentDefault() {
        return employeeDepartmentDefault;
    }

    public static void main(String[] args) {
        lab4_1 emp = new lab4_1();

        emp.employeeIdPublic = 101;
        emp.employeeNamePublic = "John Doe";
        emp.employeeDepartmentPublic = "Finance";

        System.out.println("Public Access: ");
        System.out.println("ID: " + emp.employeeIdPublic + ", Name: " + emp.employeeNamePublic + ", Department: " + emp.employeeDepartmentPublic);

        emp.setEmployeeIdPrivate(102);
        emp.setEmployeeNamePrivate("Jane Doe");
        emp.setEmployeeDepartmentPrivate("HR");
        
        System.out.println("Private Access (via methods): ");
        System.out.println("ID: " + emp.getEmployeeIdPrivate() + ", Name: " + emp.getEmployeeNamePrivate() + ", Department: " + emp.getEmployeeDepartmentPrivate());

    }
}
