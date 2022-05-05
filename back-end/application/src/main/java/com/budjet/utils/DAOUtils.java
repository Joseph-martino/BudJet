package com.budjet.utils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOUtils {
	
	public static void closeStatement(PreparedStatement preparedStatement, ResultSet resultSet) {
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

	public static void closeStatement(PreparedStatement preparedStatement) {

		try {
			if (preparedStatement != null && !preparedStatement.isClosed()) {
				preparedStatement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
