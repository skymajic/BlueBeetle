package controllers;

import java.util.List;

import controllers.Application.SampleForm;
import models.Message;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;




public class Encourage extends Controller{
   
	
	// /encourageにアクセスした際のAction
	public static Result encourage() {		
		Form<Message> f = new Form(Message.class);
		return ok(encourage.render("Someone may become happy.",f));
	}
	
	// フォームヘルパーのactionのcreateにアクセスした際のAction
	public static Result create() {
		Form<Message> f = new Form(Message.class).bindFromRequest();
		if (!f.hasErrors()) {
			Message data = f.get();
			data.save();
			return redirect("/");
		} else {
			return ok(encourage.render("ERROT", f));
		}
	}	
	
	
	
	// /encouragedにアクセスした際のAction
	public static Result encouraged() {
	
		String name = "";
		String message = "";
		List<Message> datas = Message.find.all();
		for (Message data : datas) {
			name = data.getName();
			message = data.getMessage();
		}
		return ok(encouraged.render(name, message));
	}
	
}
