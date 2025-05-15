
import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Department> departments;

    public University() {
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String name) {
        Department department = new Department(name.trim());
        departments.add(department);
    }

    public void addProfessor(String departmentName, String professorName, String specialization) {
        String trimmedDepartmentName = departmentName.trim();
        for (Department department : departments) {
            if (department.getName().equals(trimmedDepartmentName)) {
                department.addProfessor(professorName.trim(), specialization.trim());
                return;
            }
        }
        System.out.println("Department " + departmentName + " not found.");
    }

    public void displayAllProfessors() {
        for (Department department : departments) {
            department.displayProfessors();
        }
    }

    public class Department {

        private String name;
        private List<Professor> professors;

        public Department(String name) {
            this.name = name;
            this.professors = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addProfessor(String name, String specialization) {
            Professor professor = new Professor(name.trim(), specialization.trim());
            professors.add(professor);
        }

        public void displayProfessors() {
            System.out.println("Department: " + name);
            for (Professor professor : professors) {
                professor.displayInfo();
            }
        }

        public class Professor {

            private String name;
            private String specialization;

            public Professor(String name, String specialization) {
                this.name = name;
                this.specialization = specialization;
            }

            public void displayInfo() {
                System.out.println("Professor Name: " + name + ", Specialization: " + specialization);
            }
        }
    }

    public static void main(String[] args) {
        University university = new University();
        university.addDepartment(" INFORMATIKA ");
        university.addDepartment(" SISTEM INFORMASI ");

        university.addProfessor("INFORMATIKA", " FAHMI AL",
                "Artificial Intelligence");
        university.addProfessor("INFORMATIKA", " BONDAN ",
                "Software Engineering");
        university.addProfessor("SISTEM INFORMASI", "DIFA",
                " ARITMATIKA ");

        university.displayAllProfessors();
    }
}
