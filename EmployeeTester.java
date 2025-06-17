package TesterEmployeeMain;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import Pojos.Employee;
import dao.EmployeeDaoImpl;

public class EmployeeTester {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		// create emp dao instance
		boolean exit = false;
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		System.out.println("1. Get Emp Details 10. Exit");
		switch (sc.nextInt()) {
		case 1:
			// get emp details
			System.out.println("Enter dept begin");
			String detid = sc.next();
			Date startDate = Date.valueOf(sc.next());
			Date endDate = Date.valueOf(sc.next());
			List<Employee> emp = dao.getSelectedEmpDetails(detid, startDate, endDate);
			emp.forEach(System.out::println);
			break;

		case 10:
			exit = true;
			// destroy (shut down):
			dao.cleanUp();
			break;
		}

	}

}
