package com.devs4j.users.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "username")
	private String usernanme;
	
	@Column(name = "password")
	private String password;
	
	@OneToOne
	@JoinColumn(name ="profile_id",
	referencedColumnName ="id")
	private Profile profile;

	public Integer getId() {
		return id;
	}

	public String getUsernanme() {
		return usernanme;
	}

	public String getPassword() {
		return password;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setUsernanme(String usernanme) {
		this.usernanme = usernanme;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}

