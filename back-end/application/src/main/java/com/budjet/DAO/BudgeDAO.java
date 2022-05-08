package com.budjet.DAO;

import java.sql.Connection;
import java.util.List;

import com.budjet.models.Budget;

public class BudgeDAO extends DAO<Budget>{
	
	public BudgeDAO(Connection connexion) {
		super(connexion);
	}

	@Override
	public Budget getById(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Budget> getAll() {
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
