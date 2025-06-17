package dao;

import static DatabaseUtils.DButils.openConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Pojos.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {
	// state: instance vars
	private Connection connection;
	private PreparedStatement pst;

	public EmployeeDaoImpl() throws SQLException {
		// get fix db connection from DBUtils
		connection = openConnection();
		pst = connection.prepareStatement(
				"select empid,salary,join_date from my_emp where deptid=? and join_date between ? and ?");
		System.out.println("emp dao created...");

	}

	@Override
	public List<Employee> getSelectedEmpDetails(String dept, Date beginDate, Date endDate) throws SQLException {
		List<Employee> demo = new ArrayList();
		pst.setString(1, dept);
		pst.setDate(2, beginDate);
		pst.setDate(3, endDate);
		ResultSet rst = pst.executeQuery();
		while (rst.next()) {
			demo.add(new Employee(rst.getInt(1), rst.getString(2), rst.getDouble(3), rst.getDate(4)));
		}
		return demo;
	}

	// add a method to clean db resources
	public void cleanUp() throws SQLException {
		if (pst != null) {
			pst.close();
		} else if (connection != null) {
			System.out.println("employee dao cleaned up");
		}
	}

}
