package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.DAO;

public class ExamDAO {
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 1. 등록
	public void insertExm(ExamVO vo) {
		sql = "INSERT INTO exam (exam_id, e_name) VALUES (?, ?)";
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.geteId());
			pstmt.setString(2, vo.geteName());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 입력됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 2. 수정
	public void updateExm(ExamVO vo) {
		sql = "UPDATE exam SET" + vo.geteName() + "WHERE" + vo.geteId();
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 수정됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	// 3. 삭제
	public void deleteExm(ExamVO vo) {
		sql = "DELETE FROM exam WHERE exam_id = ?";
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.geteId());
			pstmt.executeUpdate();
			System.out.println("삭제 되었습니다.");
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

	// 4. 전체목록
	public List getExmList() {
		conn = DAO.getConnection();
		sql = "SELECT * FROM exam";
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ExamVO vo = new ExamVO();
				vo.seteId(rs.getInt("exam_id"));
				vo.seteName(rs.getString("e_name"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
