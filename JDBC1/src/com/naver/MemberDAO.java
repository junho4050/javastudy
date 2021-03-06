package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	
	public void insert(MemberDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO member VALUES (?, ?, ?, ?)";
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",USER_NAME, PASSWORD);
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, dto.getMid());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getJob());
			pstmt.setDate(4, dto.getBirth());
			
			pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	public void update(MemberDTO dto) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE member SET name = ?,job = ?,birth = ? "+"WHERE mid =?";
		
		try {
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			pstmt = con.prepareStatement(sql);

			
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getJob());
			pstmt.setDate(3, dto.getBirth());			
			pstmt.setString(4, dto.getMid());
			
			

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	public void delete(MemberDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM member WHERE MID = ?";

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", USER_NAME, PASSWORD);
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, dto.getMid());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public MemberDTO selectByMid(String mid) {
		MemberDTO dto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		String sql = "SELECT * FROM member WHERE mid = ?" ;
		 try {
			 
			 con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			 pstmt = con.prepareStatement(sql);
			 
			 pstmt.setString(1, mid);
			 
			 rs = pstmt.executeQuery();
			 
			 if (rs.next()) {
				 Date birth = rs.getDate("birth");
				String name = rs.getString("name");
				String job = rs.getString("job");
				 
				 dto = new MemberDTO(mid, name, job, birth);
			}
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
		
		}
     

	public List<MemberDTO> select() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM member";
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			pstmt = con.prepareStatement(sql);
						
						
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String mid = rs.getString("mid");
				String name = rs.getString("name");
				String job = rs.getString("job");
				Date birth = rs.getDate("birth");
				
				MemberDTO dto = new MemberDTO(mid, name, job, birth);
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return list;

	}

	

}
