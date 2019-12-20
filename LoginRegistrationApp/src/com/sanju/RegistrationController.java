package com.sanju; 
import javax.validation.Valid;  
import org.springframework.stereotype.Controller; 
import org.springframework.validation.BindingResult; 
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
@RequestMapping("/registration")  
@Controller  
public class RegistrationController {
      
        @RequestMapping("/addingAccount")  
    public String bookingForm(Model model)  
    {  
          //create a reservation object   
        	Registration res=new Registration();  
          //provide reservation object to the model   
        model.addAttribute("registration", res);  
        return "RegistrationPage";  
    }  
    @RequestMapping("/submitForm")  
    // @ModelAttribute binds form data to the object  
    public String submitForm( @Valid @ModelAttribute("registration") Registration res, BindingResult br)  
    {  
        
    	 if(br.hasErrors())  
         {  
             return "RegistrationPage";  
         }  
    	 else 
    		 {
    		 return "AccountCreated";  
    		 }
    }  
    }  


