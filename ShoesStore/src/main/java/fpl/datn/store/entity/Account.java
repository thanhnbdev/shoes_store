package fpl.datn.store.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


@Data
@Table(name = "user")
@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String firstname;
	
	@Column
	private String lastname;
	
	@Column
	private Byte[] image;
	
	@Column
	private String email;
	
	@Column
	private String phone;
	
	@Column
	private Date created;
	
	@Column
	private String role;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "account" ,fetch = FetchType.EAGER)
	List<Authority> authorities;
	
	public Account() {
	
	}

	public Account(Integer id, String username, String password, String firstname, String lastname, Byte[] image,
			String email, String phone, Date created, String role) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.image = image;
		this.email = email;
		this.phone = phone;
		this.created = created;
		this.role = role;
	}
	
	public List<Authority> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}
	
}
