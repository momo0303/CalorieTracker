package calorietracker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.UserDao;
import com.entities.User;

@Controller 
public class ActionController {
	@Autowired
	UserDao userdao;
	
	@RequestMapping("updateUser")
	public String updateUser()
	{
		
		return "update";
	}
	
	@RequestMapping("updateform")
	public String update(@ModelAttribute User user, Model m)
	{
		//System.out.println(weight+" " +height+" "+age);
		
		int r = userdao.update(user);
		if(r==0)
		{
			m.addAttribute("msgFail", "Wrong username or password. Please try again...");
			return "update";
		}
		else
			m.addAttribute("msgUpdateSuccess", "User Updated Successfully....");
		System.out.println("no of record updated:"+r);
		System.out.println("calling from update() method...");
		return "validatesuccess";
		
	}
	
	@RequestMapping("deleteUser")
	public String deleteteUser()
	{
		
		return "delete";
	}
	
	@RequestMapping("deleteform")
	public String delete(@RequestParam("userName") String userName, Model m)
	{
		//System.out.println(weight+" " +height+" "+age);
		
		int r = userdao.delete(userName);
		if(r==0)
		{
			m.addAttribute("msgDeleteFail", "Invalid Username. Please try again...");
			return "delete";
		}
		else
			m.addAttribute("msgDeleteSuccess", "User deleted Successfully....");
		System.out.println("no of record deleted:"+r);
		System.out.println("calling from delete() method...");
		return "validatesuccess";
		
	}
	@RequestMapping("/view")
	public String viewUser(Model m)
	{
		List<User> users = userdao.viewUsers();
		m.addAttribute("users", users);
		System.out.println(users);
		return "view";
		
	}
	

}
