package com.models;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {
	@Id private int memberId;
	private String pseudo;
	private String email;
	private String memberPassword;
	//image type ?
	private int idTeam;
	
	public Member() {
		
	}

}
