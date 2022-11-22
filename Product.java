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
@Table(name = "Product ")
@Data
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private Long categoryId;
	@Column
	private String title;
	@Column
	private Long price;
	@Column
	private Long discout;
	@Column
	private String thumbnailId;
	@Column
	private String description;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateAt;
	@Column
	private Long delete;
}
