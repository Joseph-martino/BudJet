package com.budjet.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.budjet.DAO.DAOFactory;
import com.budjet.DAO.MemberDAO;
import com.budjet.DAO.MsSqlConnect;
import com.budjet.DAO.TeamDAO;

public class AuthenticationService {

	private MemberDAO memberDAO;
	private TeamDAO teamDAO;
	
	public AuthenticationService() {
		memberDAO = DAOFactory.createMemberDAO();
		teamDAO = DAOFactory.createTeamDAO();
		
	}

	/**
	 * 
	 * @param teamName
	 * @param pseudo
	 * @param email
	 * @param password
	 * @return returns memberId or -1
	 */
	public int register(String teamName, String pseudo, String email, String password) {
		if(memberDAO.checkIfEmailExist(email)) {
			return -1;
		}
		
		int teamId = teamDAO.getTeamIdByName(teamName);
		if(teamId < 1) {
			teamId = teamDAO.createTeam(teamName);	
		}
		
		return memberDAO.createMember(pseudo, email, password, teamId);
	}


	public void login() {

	}
	
	

}
