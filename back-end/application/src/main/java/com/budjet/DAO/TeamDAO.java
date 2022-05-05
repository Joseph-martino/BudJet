package com.budjet.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.budjet.models.Team;
import com.budjet.utils.DAOUtils;

public class TeamDAO extends DAO<Team> {

	public TeamDAO(Connection connexion) {
		super(connexion);
	}
	
	public int createTeam(String teamName) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int id = -1;
		try {
			String teamQuery = "INSERT INTO team VALUES(?)";
			preparedStatement = getConnexion().prepareStatement(teamQuery, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, teamName);
			preparedStatement.executeUpdate();
			resultSet = preparedStatement.getGeneratedKeys();
			if (resultSet.next()) {
				id = resultSet.getInt(1);
			}	
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DAOUtils.closeStatement(preparedStatement, resultSet);
		}
		return id;
	}

	public int getTeamIdByName(String teamName) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int id = -1;

		try {
			String query = "SELECT id_team FROM team WHERE team_name = ?";
			preparedStatement = getConnexion().prepareStatement(query);
			preparedStatement.setString(1, teamName);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				id = resultSet.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DAOUtils.closeStatement(preparedStatement, resultSet);
		}
		return id;
	}

	@Override
	public Team getById(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Team> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert() {
		// TODO Auto-generated method stub
		return false;
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
