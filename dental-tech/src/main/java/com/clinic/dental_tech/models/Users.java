package com.clinic.dental_tech.models;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iduser")
	private Long id_user;
    
    @Column
    private String first_name;
    
    @Column
    private String last_name;
    
    @Column
    private String email;
    
    @Column
    private String user_password;
    
    

    public Users() {}

	public Users(Long iduser, String first_name, String last_name, String email, String user_password) {
		super();
		this.id_user = iduser;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.user_password = user_password;
	}

	public Long getIduser() {
		return id_user;
	}

	public void setIduser(Long iduser) {
		this.id_user = iduser;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	@Override
	public String toString() {
		return "Users [iduser=" + id_user + ", first_name=" + first_name + ", last_name=" + last_name + ", email="
				+ email + ", user_password=" + user_password + "]";
	}
    
    
}
