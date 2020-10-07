package com.sri.bootexe.springbootexe.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name="env_detail_table")
@Data
public class EnvironmentEntity {
	
	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
 	@GenericGenerator (name="sri",strategy = "increment")
	@GeneratedValue(generator = "sri")
 	@Column(name = "id")
    private int  id;
	@Column(name = "envdetail")
	private String envdetail;
	@Column(name = "url")
	private String url;
	@Column(name = "accessible")
	private String accessible;
	public EnvironmentEntity() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	public EnvironmentEntity(String envdetail, String url, String accessible) {
		this.envdetail = envdetail;
		this.url = url;
		this.accessible = accessible;
	}
	
	
	
	

}
