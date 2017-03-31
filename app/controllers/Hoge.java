package controllers;

import controllers.Application.SampleForm;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;







class Calc {
	int total = 0;
	int add(){
		for (int i=0; i< 10; i++) {
			total += i;
		}
		return total;
	}
}

public class Hoge extends Controller{
   
	// /hogeにアクセスした際のAction
	public static Result hoge() {
		
		
		Calc calc = new Calc();
		String fuga = "合計値は" + calc.add() + "です。";
		return ok(hoge.render(fuga));
	}
	
}
