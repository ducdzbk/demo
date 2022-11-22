package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name = "Users")
@Data
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String phoneNumber; 
	@Column
	private String fullName;
	@Column
	private String email;
	@Column
	private String adress;
	@Column
	private String password;
	@Column
	private Long roleId;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private  Date updateAt;
	@Column
	private Long delete;
}
