package Pojos;

import java.sql.Date;

//empid | name | addr | salary | deptid | join_date 
public class Employee {
	private int empId;
	private String name;
	private String addr;
	private double salary;
	private String deptid;
	private Date join_date;

	// POJO specs : required in hibernate : def arg-less constructor
	public Employee() {
		// not required in JDBC
		// but required in hibernate
	}
	// getters and setters

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 *            the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the addr
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * @param addr
	 *            the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the deptid
	 */
	public String getDeptid() {
		return deptid;
	}

	/**
	 * @param deptid
	 *            the deptid to set
	 */
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	/**
	 * @return the join_date
	 */
	public Date getJoin_date() {
		return join_date;
	}

	/**
	 * @param join_date
	 *            the join_date to set
	 */
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}

	/**
	 * @param empId
	 * @param name
	 * @param salary
	 * @param join_date
	 */
	public Employee(int empId, String name, double salary, Date join_date) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.join_date = join_date;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", addr=" + addr + ", salary=" + salary + ", deptid="
				+ deptid + ", join_date=" + join_date + "]";
	}

}
