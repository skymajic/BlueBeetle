package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Message extends Model{
	
	@Id
	public Long id;
	@Column
	public String message; 

}
