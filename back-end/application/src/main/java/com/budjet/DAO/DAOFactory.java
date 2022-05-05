package com.budjet.DAO;

import java.sql.Connection;

public class DAOFactory {
	private static final Connection connexion = MsSqlConnect.getConnection();
	
	public static MemberDAO createMemberDAO() {
		return new MemberDAO(connexion);
	}
	
	public static TeamDAO createTeamDAO() {
		return new TeamDAO(connexion);
	}

}
