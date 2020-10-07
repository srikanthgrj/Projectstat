package com.sri.bootexe.springbootexe.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;


@Entity
@Table(name="detail_table")
@Data
public class SpringbootEntity implements Serializable{
	 	@Id
	    //@GeneratedValue(strategy = GenerationType.AUTO)
	 	@GenericGenerator (name="sri",strategy = "increment")
		@GeneratedValue(generator = "sri")
	 	@Column(name = "id")
	    private int id;
	 	@Column(name = "fromname")
	    private String fromname;
	 	@Column(name = "fullmessage")
	    private String fullmessage;
	 	@Column(name = "projectname")
	 	private String projectname;
	 	@Column(name = "tmname")
		private String tmname;
	 	@Column(name = "teamcontactmail")
		private String teamcontactmail;
	 	@Column(name = "decomissines")
		private String decomissines;
	 	@Column(name = "version")
		private String version;
	 	@Column(name = "lastreleased")
		private String lastreleased;
	 	@Column(name = "nextreleased")
		private String nextreleased;
	 	@Column(name = "developeddate")
		private String developeddate;
	 	
		public SpringbootEntity() {
			System.out.println("created "+this.getClass().getSimpleName());
		}

		public SpringbootEntity(String fromname, String fullmessage, String projectname, String tmname,
				String teamcontactmail, String decomissines, String version, String lastreleased, String nextreleased,
				String developeddate) {
			this.fromname = fromname;
			this.fullmessage = fullmessage;
			this.projectname = projectname;
			this.tmname = tmname;
			this.teamcontactmail = teamcontactmail;
			this.decomissines = decomissines;
			this.version = version;
			this.lastreleased = lastreleased;
			this.nextreleased = nextreleased;
			this.developeddate = developeddate;
		}
		
		
		
		
		
		
	    
	    

}
