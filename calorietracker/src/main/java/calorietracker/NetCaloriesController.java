package calorietracker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.NetCaloriesDao;
import com.entities.CaloriesRecord;
import com.entities.Chart;
import com.entities.User;

@Controller
public class NetCaloriesController {
	@Autowired
	Chart chart;
	
	@Autowired
	NetCaloriesDao ncDao;
	
	float bmr=0;
	float netCalories=0;
	
	@RequestMapping("createlogs")
	public String showLogs(Model m)
	{
		if(chart.getSex()=="M")
		{
			bmr= (float) (66.4730 + (13.7516*(float)chart.getWeight()) + (5.0033*(float)chart.getHeight()) -
					(6.77550*(float)chart.getAge()));
		}
		else
		{
			bmr= (float) (655.0955 + (9.5634*(float)chart.getWeight()) + (1.8496*(float)chart.getHeight()) -
					(4.6756*(float)chart.getAge()));
		}
		
		netCalories=(float)chart.getCaloriesin() - bmr - chart.getCaloriesout();
		
		System.out.println("from showLogs");
		System.out.println(netCalories+"  "+chart.getCaloriesin()+"  "+bmr+"  "+chart.getCaloriesout());
		
		m.addAttribute("username",chart.getUsername());
		m.addAttribute("date", chart.getDate());
		m.addAttribute("bmr", bmr);
		m.addAttribute("caloriesin", chart.getCaloriesin());
		m.addAttribute("caloriesout", chart.getCaloriesout());
		m.addAttribute("netcalories", netCalories);
		
		int noOfRecords=ncDao.checkData();
		if(noOfRecords>0)
		{
			
			return "foundRecord";
		}
		else
		{
			int result = ncDao.insertData(bmr, netCalories);
			System.out.println("record inserted in table:"+result);
			
			m.addAttribute("result", result);
			return "createlogs";
		}
		
	}
	@RequestMapping("/updateRecord")
	public String updateRecord(Model m)
	{
		int result=ncDao.updateData(netCalories);
		System.out.println("from updateRecord():"+result);
		
		m.addAttribute("username",chart.getUsername());
		m.addAttribute("date", chart.getDate());
		m.addAttribute("bmr", bmr);
		m.addAttribute("caloriesin", chart.getCaloriesin());
		m.addAttribute("caloriesout", chart.getCaloriesout());
		m.addAttribute("netcalories", netCalories);
		m.addAttribute("result", result);
		return "createlogs";
	}
	
	@RequestMapping("/seeLogs")
	public String seeLogs(Model m)
	{
		List<CaloriesRecord> caloriesRecord = ncDao.seeAllData();
		
		m.addAttribute("caloriesRecord", caloriesRecord);
		System.out.println(caloriesRecord);
		
		m.addAttribute("username",chart.getUsername());
		m.addAttribute("bmr", bmr);
		
		return "seeLogs";
	}
	
	

}
