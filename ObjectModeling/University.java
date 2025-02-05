import java.util.ArrayList;
import java.util.List;
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class Department {
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}class University {
    private String universityName;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Add a faculty to the university
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Show all departments in the university
    public void showDepartments() {
        System.out.println("Departments at " + universityName + ":");
        for (Department department : departments) {
            System.out.println("- " + department.getDepartmentName());
        }
    }

    // Show all faculty members associated with the university
    public void showFaculties() {
        System.out.println("Faculty members at " + universityName + ":");
        for (Faculty faculty : faculties) {
            System.out.println("- " + faculty.getName());
        }
    }

    // Delete the university and its departments
    public void deleteUniversity() {
        System.out.println("Deleting University: " + universityName);
        departments.clear(); // Deleting departments (composition)
        faculties.clear();   // Faculty can remain outside (aggregation)
    }
public static void main(String[] args) {
        // Create a university
        University myUniversity = new University("GLA University");
        Department cseDepartment = new Department("Computer Science Engineering");
        Department eeDepartment = new Department("Electrical Engineering");

        // Add departments to the university
        myUniversity.addDepartment(cseDepartment);
        myUniversity.addDepartment(eeDepartment);

        // Create faculty members
	// aggregation relationship
        Faculty ashutosh = new Faculty("Ashutosh Choubey");
        Faculty shardul = new Faculty("Shardul Kumbhar");

        // Add faculty members to the university
        myUniversity.addFaculty(ashutosh);
        myUniversity.addFaculty(shardul);

        // Display departments and faculties
        myUniversity.showDepartments();
        myUniversity.showFaculties();
        myUniversity.deleteUniversity();
        myUniversity.showDepartments(); 
        myUniversity.showFaculties();   
    }
}
