package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {

        System.out.println("=== TEST1 findById ===");
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Department dept = departmentDao.findById(1);
        System.out.println(dept);

        System.out.println("\n=== TEST2 insert ===");
        Department department = new Department(null, "Human Resources");
        departmentDao.insert(department);
        System.out.println(department);

        System.out.println("\n=== TEST3 delete ===");
        departmentDao.deleteById(7);
        System.out.println("Delete completed!");


        System.out.println("\n=== TEST4 update");
        dept = departmentDao.findById(4);
        dept.setName("Books");
        departmentDao.update(dept);
        System.out.println("Update completed!");

        System.out.println("\n=== TEST5 delete");
        List<Department> list = departmentDao.findAll();
        list.forEach(System.out::println);
    }
}
