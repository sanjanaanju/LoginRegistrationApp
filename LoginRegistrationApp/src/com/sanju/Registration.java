package com.sanju;
import javax.validation.constraints.Size;
import com.sanju.customvalidation.Password;   
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
public class Registration {
	@NotNull
	@Size(min=1,message="required")
	private String userName; 
	@Size(min=8,message="required min 8 Character")
	@Password
	private String password; 
	@Pattern(regexp="[^@]+@[^@]+\\.[a-zA-Z]{2,6}",message="required correct format Example abc@gmail.com")
	
	private String email;
	      
	   
		public Registration()  
	    {         
	    }  
	    public String getuserName() {  
	        return userName;  
	    }  
	    public void setuserName(String userName) {  
	        this.userName = userName;  
	    }  
	    public String getpassword() {  
	        return password;  
	    }  
	    public void setpassword(String password) {  
	        this.password = password;  
	    }   
	    public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	}

