package pack.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private DataSource ds;
	
	@Autowired
	public BoardDao(DataSource dataSource) {
		try {
			ds = dataSource;
			
		} catch (Exception e) {
			System.out.println("연결 실패 : " +  e);
			
		}
	}
	
	public List<BoardDto> list(){  //전체 자료 읽기
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		
		try {
			conn = ds.getConnection();  // DB와 연결
			
			String sql = "select * from springboard order by num desc";  //sql문 작성
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDto boardDto = new BoardDto();
				boardDto.setNum(rs.getInt("num"));
				boardDto.setAuthor(rs.getString("author"));
				boardDto.setTitle(rs.getString("title"));
				boardDto.setContent(rs.getString("content"));
				boardDto.setBwrite(rs.getString("bwrite"));
				boardDto.setReadcnt(rs.getInt("readcnt"));
				
			}
			
		} catch (Exception e) {
			System.out.println("list err :" + e);
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
}
