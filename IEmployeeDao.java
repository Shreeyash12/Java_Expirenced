package dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import Pojos.Employee;

public interface IEmployeeDao {
	// Display details(id,name,salary,join_date) of all emps from a specific dept,
	// joined between strt date n end date
	List<Employee> getSelectedEmpDetails(String dept, Date beginDate, Date endDate) throws SQLException;
}
