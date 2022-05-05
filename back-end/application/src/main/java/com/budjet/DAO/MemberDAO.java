package com.budjet.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.budjet.models.Member;
import com.budjet.utils.DAOUtils;

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
			DAOUtils.closeStatement(preparedStatement, resultSet);
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
			DAOUtils.closeStatement(preparedStatement, resultSet);
		}

		return false;
	}
	
	/**
	 * 
	 * @param pseudo
	 * @param email
	 * @param password
	 * @param teamId
	 * @return returns id or -1
	 */
	public int createMember(String pseudo, String email, String password, int teamId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int id = -1;
		try {
			String query = "INSERT INTO member VALUES(?, ?, ?, null, ?)";
			preparedStatement = getConnexion().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, pseudo);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, password);
			preparedStatement.setInt(4, teamId);
			preparedStatement.executeUpdate();
			resultSet = preparedStatement.getGeneratedKeys();
			if(resultSet.next()) {
				id = resultSet.getInt(1);
			}	
		} catch(Exception e) {
			e.printStackTrace();
		}	
		return id;
	}

	public boolean checkIfEmailExist(String mail) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			String query = "SELECT COUNT(*) OCC FROM member WHERE email = ?";
			preparedStatement = getConnexion().prepareStatement(query);
			preparedStatement.setString(1, mail);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next() && resultSet.getInt(1) == 0) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DAOUtils.closeStatement(preparedStatement, resultSet);
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

}
