package calorietracker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.FoodDao;
import com.entities.Chart;
import com.entities.FoodIn;

@Controller
public class CaloriesController {
	int totalCaloriesIn=0;
	@Autowired
	FoodDao fooddao;
	@Autowired
	CaloriesIn cloriesin;
	@Autowired
	Chart chart;
	
	FoodIn fi=new FoodIn();
	@RequestMapping("usernameform")
	public String usernameSet(@RequestParam("username") String username) {
		System.out.println("aaaaaaaaaaaaaaaaa"+username);
		chart.setUsername(username);
		return "date";
	}
	@RequestMapping("dateform")
	public String dateSet(@RequestParam("date") String date)
	{
		System.out.println("bbbbbbbbbb"+date);
		chart.setDate(date);
		return "selectredirect";
	}
	
	@RequestMapping("select")
	public String caloriesIn( Model m) {
		//System.out.println("aaaaaaaaaaaaaaaaa"+username);
		//if(username!=null)
		    // chart.setUsername(username);
		
		List<String> foodChoice = fooddao.foodChoice();
		m.addAttribute("foodChoice", foodChoice);
		System.out.println("hey momo1"+foodChoice);
		return "afterselect";
	}
	
	@RequestMapping("foodgroup")
	public String caloriesIn2(@RequestParam("mealtime") String mealtime,
			@RequestParam("foodgroup") String foodgroup1, Model m) {
		fi.setDate(chart.getDate());
		fi.setMealtime(mealtime);
		fi.setFoodgroup(foodgroup1);
		chart.setDate(chart.getDate());
		System.out.println("from caloriesin2() method"+fi);
		
		List<String> foodName = fooddao.foodName(fi);
		m.addAttribute("foodName",foodName);
		m.addAttribute("mealtime",mealtime);
		m.addAttribute("foodgroup", foodgroup1);
		
		System.out.println("hey momo33"+foodName);
		
		return "foodgroup";
		
	}
	
	@RequestMapping("addmore")
	public String caloriesIn3(@RequestParam("foodname") String foodname,
			@RequestParam("portion") int portion, Model m)
	{
		fi.setFoodname(foodname);
		fi.setPortion(portion);
		
		System.out.println("hey momo44"+fi);
		
		totalCaloriesIn=cloriesin.getCaloriesIn(foodname,portion)+totalCaloriesIn;
		chart.setCaloriesin(totalCaloriesIn);
		
		System.out.println("come here baby"+totalCaloriesIn);
		
		return "addmore";
		
	}
	

}
