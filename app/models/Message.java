package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Message extends Model{
	
	@Id
	public Long id;
	public String name;
	public String message; 
	
	public static Finder<Long, Message> find = new Finder<Long, Message>(Long.class, Message.class);
	
	
	/**
	 * ユーザー名取得
	 * @return ユーザー名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * メッセージ取得
	 * @return
	 */
	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString(){
		return ("[id:" + id + ", message:" + message + "]");
	}
	
}

