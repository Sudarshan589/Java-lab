public class UniversityNestedClassDemo {
    static class Department {
        int departmentId;
        String departmentName;
        String headOfDepartment;

        Department(int departmentId, String departmentName, String headOfDepartment) {
            this.departmentId = departmentId;
            this.departmentName = departmentName;
            this.headOfDepartment = headOfDepartment;
        }

        void displayDepartmentDetails() {
            System.out.println("Department ID: " + departmentId);
            System.out.println("Department Name: " + departmentName);
            System.out.println("Head of Department: " + headOfDepartment);
        }
    }

    public static void main(String[] args) {
        Department department = new Department(10, "Computer Science", "Dr. Sharma");
        department.displayDepartmentDetails();
    }
}