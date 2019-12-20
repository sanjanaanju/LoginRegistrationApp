package com.sanju;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@RequestMapping("/login")
@Controller
public class LoginController {
	 
    @RequestMapping("/loginAs")  
    public String bookingForm(Model model)  
    {  
          //create a reservation object   
        	Login res=new Login();  
          //provide reservation object to the model   
        model.addAttribute("login", res);  
        return "login";  
    }  
   
	@RequestMapping("/loginForm")  
     public ModelAndView login(HttpServletRequest request,
		   HttpServletResponse response, @ModelAttribute("login") Registration res) {
	  String userName=request.getParameter("userName");  
      String password=request.getParameter("password");
      String message;
      if(userName != null && 
    		  !userName.equals("") 
    		  && userName.equals("SANJU") && 
    		  password != null && 
    		  !password.equals("") && 
    		  password.equals("123")){
    	  message = "Welcome " +userName + ".";
	      return new ModelAndView("welcome", 
	    		  "message", message);  
    	  	    	  
      }else{
    	  message = "Wrong username or password.";
    	  return new ModelAndView("errorPage", "message", message);

}
   }
}