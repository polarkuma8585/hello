package Com.boardPkg.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Com.boardPkg.common.DAO;
import Com.boardPkg.model.Employee;

public class EmpDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public void insertEmp(Employee emp) {
		conn = DAO.getConnect();
		String sql = "insert into employees(employee_id," + " first_name, last_name, email, job_id,"
				+ " hire_date, salary)\r\n" + "values (?,?,?,?,?,?,?)";
		int rCnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(++rCnt, emp.getEmployeeId()); // 첫번째 parameter
			pstmt.setString(++rCnt, emp.getFirstName()); // 두번째
			pstmt.setString(++rCnt, emp.getLastName());
			pstmt.setString(++rCnt, emp.getEmail());
			pstmt.setString(++rCnt, emp.getJobId());
			pstmt.setString(++rCnt, emp.getHireDate());
			pstmt.setInt(++rCnt, emp.getSalary());
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 입력되었습니다.");

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public List<Employee> getEmpList() {
		List<Employee> list = new ArrayList<>();
		Connection conn = DAO.getConnect();
		String sql = "select * from employees";
		Employee emp = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setEmail(rs.getString("email"));
				emp.setJobId(rs.getNString("job_id"));

				list.add(emp);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}
		return list;
	}
}
