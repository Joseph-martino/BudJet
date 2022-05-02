package com.budjet.models;

import java.util.Date;

public class Spending {
	private int idSpending;
	private float amount;
	private int idMember;
	private int idTeam;
	private Date spendingDate;
	
	public Spending() {
		
	}

	public int getIdSpending() {
		return idSpending;
	}

	public void setIdSpending(int idSpending) {
		this.idSpending = idSpending;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
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

	public Date getSpendingDate() {
		return spendingDate;
	}

	public void setSpendingDate(Date spendingDate) {
		this.spendingDate = spendingDate;
	}

	@Override
	public String toString() {
		return "Spending [idSpending=" + idSpending + ", amount=" + amount + ", idMember=" + idMember + ", idTeam="
				+ idTeam + ", spendingDate=" + spendingDate + "]";
	}

	
}
