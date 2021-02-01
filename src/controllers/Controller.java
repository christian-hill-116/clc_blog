package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import beans.User;
@ManagedBean
public class Controller {
	
	public String onSubmit() {
		
		//get the user value from the input form
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		//user object data in the console log
		System.out.println("You clicked the submit button");
		System.out.println("The first name is " + user.getUserName());
		System.out.println("The last name is " + user.getPassword());
		
		
		//put user object into the POST request
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		//show the next page
		return "index.xhtml";
		
	}

}
