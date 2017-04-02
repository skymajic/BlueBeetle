package controllers;

import java.util.List;

import models.Message;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

	public static class SampleForm {
		public String regret;
	}
	
	// ルートにアクセスした際のAction
    public static Result index() {
    	SampleForm sf = new SampleForm();
    	sf.regret = "write here.";
    	Form<SampleForm> form = new Form(SampleForm.class).fill(sf);
        return ok(index.render("Do you have any regret?",form));
    }
    
    
    
    // /resultに際のAction
    public static Result send() {
    	
    	Form<SampleForm> f = new Form(SampleForm.class).bindFromRequest();
    	if (!f.hasErrors()) {
    		// リザルト画面にフォームで受け取った値を返す。
    		SampleForm sf = f.get();
    		String response = sf.regret;
    		return ok(result.render(response,f));
    	} else {
    		return badRequest(index.render("ERROR",f));
    	}
    	
    }
    
}
