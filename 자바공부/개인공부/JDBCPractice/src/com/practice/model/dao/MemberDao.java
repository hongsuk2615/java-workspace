package com.practice.model.dao;

import java.sql.Connection;
import java.util.ArrayList;

import com.practice.common.JDBCTemplate;
import com.practice.model.vo.Member;





public class MemberDao {
	
		public int insertMember(Connection conn, Member m) {
			JDBCTemplate.getConnection();
			
			
		}
		
		public ArrayList<Member> selectAll(Connection conn){
			
		}
}
