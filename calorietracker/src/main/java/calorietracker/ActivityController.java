package calorietracker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.ActivityDao;
import com.entities.Chart;

@Controller
public class ActivityController {
	@Autowired
	ActivityDao activityDao;
	@Autowired
	Chart chart;
	
	@RequestMapping("activity")
	public String activitySet(Model m)
	{
		List<String> activities=activityDao.fetchActivity();
		m.addAttribute("activities", activities);
		System.out.println("hey momo1"+activities);
		
		return "activity";
	}
	
	@RequestMapping("activityform")
	public String specificMotion(@RequestParam("activity") String activity, Model m)
	{
		List<String> specificMotion = activityDao.fetchSpecificMotion(activity);
		m.addAttribute("specificMotion",specificMotion);
		
		m.addAttribute("activity", activity);
		System.out.println("hey momo33"+specificMotion);
		
		return "specificmotion";
	}
	@RequestMapping("specificmotionform")
	public String specificationMotionSet(@RequestParam("specificMotion") String specificMotion, @RequestParam("duration") int duration)
	{
		float metValue = activityDao.getMetValue(specificMotion);
		System.out.println("metvalue:"+metValue+"  duration"+duration);
	     chart.calculateCaloriesOut(metValue, duration);
		return "activityredirect";
	}
	

}
