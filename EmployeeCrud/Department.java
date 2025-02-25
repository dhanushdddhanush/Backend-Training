package MapsCollections;
public class Department {
    private int departmentId;
    private String departmentName;

    /**
     * Constructor for deppartment
     * @param deptId   
     * @param deptName 
     */
    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    /**
     * @return The unique identifier of the department.
     */
    public int getDeptId() {
        return departmentId;
    }

    /**
     * @return The name of the department.
     */
    public String getDeptName() {
        return departmentName;
    }
}
