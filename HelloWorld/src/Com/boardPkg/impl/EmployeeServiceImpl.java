package Com.boardPkg.impl;

import java.util.List;

import Com.boardPkg.model.Employee;
import Com.boardPkg.model.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	EmpDAO dao = new EmpDAO();

	@Override
	public List<Employee> getEmpList() {

		List<Employee> list = dao.getEmpList();
		return list;
	}

	@Override
	public Employee getEmployee(int empNo) {

		return null;
	}

	@Override
	public void insertEmployee(Employee emp) {
		dao.insertEmp(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {

	}

	@Override
	public void deleteEmployee(int empNo) {

	}

}
