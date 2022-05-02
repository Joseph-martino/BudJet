package com.budjet.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.budjet.models.Member;

public class MemberDAO extends DAO<Member> {

	public MemberDAO(Connection connexion) {
		super(connexion);
		
	}

	@Override
	public Member getById(Object object) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Member member = null;
		int id;

		if (!(object instanceof Integer)) {
			return null;
		}

		id = (int) object;

		try {
			String query = "SELECT id_member, pseudo FROM member WHERE id_member = ?";
			preparedStatement = getConnexion().prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				member = new Member(resultSet.getInt(1), resultSet.getString(2));
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			closeStatement(resultSet, preparedStatement);
		}
		return member;

	}

	@Override
	public List<Member> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert() {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeStatement(resultSet, preparedStatement);
		}

		return false;
	}

	public boolean register(String teamName, String pseudo, String email, String password) {

		PreparedStatement preparedStatement = null;

		try {

			String teamQuery = "INSERT INTO team VALUES(?)";
			PreparedStatement teamPreparedStatement = getConnexion().prepareStatement(teamQuery, Statement.RETURN_GENERATED_KEYS);
			teamPreparedStatement.setString(1, teamName);
			teamPreparedStatement.executeUpdate();
			ResultSet teamIdAsResultSet = teamPreparedStatement.getGeneratedKeys();
			if(!teamIdAsResultSet.next()){
				return false;
			}

			String query = "INSERT INTO member VALUES(?, ?, ?, null, ?)";
			preparedStatement = getConnexion().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, pseudo);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, password);
			preparedStatement.setInt(4, teamIdAsResultSet.getInt(1));
			
			preparedStatement.executeUpdate();

			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			closeStatement(preparedStatement);
		}

	}
	
	public boolean checkIfEmailExist(String mail) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			String query = "SELECT COUNT(*) OCC FROM member WHERE email = ?"; 
			preparedStatement = getConnexion().prepareStatement(query);
			preparedStatement.setString(1, mail);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next() && resultSet.getInt(1) == 0) {
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	private void closeStatement(ResultSet resultSet, PreparedStatement preparedStatement) {
		try {
			if (resultSet != null && !resultSet.isClosed()) {
				resultSet.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (preparedStatement != null && !preparedStatement.isClosed()) {
				preparedStatement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void closeStatement(PreparedStatement preparedStatement) {

		try {
			if (preparedStatement != null && !preparedStatement.isClosed()) {
				preparedStatement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
