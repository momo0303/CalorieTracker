package calorietracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.UserDao;
import com.entities.User;

@Controller                //must do <context:component-scan base-package="calorietracker" />  in configuration file
public class UserController {
	@Autowired
	UserDao userdao;
    @RequestMapping("/login")
	public String login()
	{
		System.out.println("calling from login() method...");
		return "login";            //will call login.jsp
	}
    
    @RequestMapping("/register")
    public String register()
    {
    	System.out.println("from register() method...");
    	return "register";       //will call register.jsp
    }
    
    @RequestMapping("/registerform")
    public String registerUser(@ModelAttribute User user, Model m)
    {
    	System.out.println(user);
    	int r = userdao.insert(user);
    	
    	m.addAttribute("insertMsg", "User Registered Successfully...");
    	System.out.println("user stored success:"+r);
    	System.out.println("from registerUser() method...");
		return "validatesuccess";
    }
    
    
    @RequestMapping(path="/validate", method = RequestMethod.POST)
    public String validateUser(@RequestParam("username") String userName, @RequestParam("password") String password, Model m)
    {
    	int r = userdao.validate(userName, password);
    	if(r==0)
    	{
    		m.addAttribute("validateMsg","Invalid Username or Password. Please try again...");
    		return "login";
    	}
    	System.out.println("from validateUser() method...");
    	m.addAttribute("username", userName);
		return "validatesuccess";
		
    }
    
	
}
