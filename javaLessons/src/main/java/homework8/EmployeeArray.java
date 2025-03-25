package homework8;

public class EmployeeArray {
    public static void main(String [] Arg) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Leslie Knope", "Deputy Director", "leslieknope@mail.com", "1234567", 10000, 40 );
        employees [1] = new Employee("Tom Haverford", "Administrator", "tomhaverford", "2345678", 50000, 30);
        employees [2] = new Employee("Ron Swanson", "Director of the Park and Recriations Department", "", "3456789", 20000, 48);
        employees [3] = new Employee("April Ludgate-Dwyer", "Intern", "aprilludgate@mail.com", "4567891", 3000, 26);
        employees [4] = new Employee("Donna Meagle", "Permits Security", "donnameagle@mail.com", "5678910", 50000, 46);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.getInfoAboutEmployee();
            }
        }

    }
}
