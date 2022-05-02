package com.budjet.models;

import java.util.Date;

public class Budget {
	private int idBudget;
	private float amount;
	private Date budgetDate;
	private int idMember;
	private int idTeam;
	
	public Budget() {
		
	}

	public int getIdBudget() {
		return idBudget;
	}

	public void setIdBudget(int idBudget) {
		this.idBudget = idBudget;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getBudgetDate() {
		return budgetDate;
	}

	public void setBudgetDate(Date budgetDate) {
		this.budgetDate = budgetDate;
	}

	public int getIdMember() {
		return idMember;
	}

	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}

	public int getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(int idTeam) {
		this.idTeam = idTeam;
	}

	@Override
	public String toString() {
		return "Budget [idBudget=" + idBudget + ", amount=" + amount + ", budgetDate=" + budgetDate + ", idMember="
				+ idMember + ", idTeam=" + idTeam + "]";
	}
	
	

}
