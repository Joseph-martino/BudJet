package com.budjet.models;

public class Member {
	private int memberId;
	private String pseudo;
	private String email;
	private String memberPassword;
	//Private String image;
	private int idTeam;
	
	public Member() {
		
	}
	
	public Member(int id, String pseudo) {
		this.idTeam = id;
		this.pseudo = pseudo;
	}

}
