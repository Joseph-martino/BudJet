package com.budjet.models;

public class Team {
	private int idTeam;
	private int teamName;
	
	public Team() {
		
	}

	public int getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(int idTeam) {
		this.idTeam = idTeam;
	}

	public int getTeamName() {
		return teamName;
	}

	public void setTeamName(int teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Team [idTeam=" + idTeam + ", teamName=" + teamName + "]";
	}
	
	

}
