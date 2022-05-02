package com.budjet.DAO;

import java.sql.Connection;
import java.util.List;

public abstract class DAO<T> {
	private Connection connexion;
	
	protected DAO(Connection connexion) {
		this.connexion = connexion;
	}
	
	protected Connection getConnexion() {
		return this.connexion;
	}
	
	public abstract T getById(Object object);
	public abstract List<T> getAll();
	public abstract boolean insert();
	public abstract boolean update();
	public abstract boolean delete();
	
	

}
