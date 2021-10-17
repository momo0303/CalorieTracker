package calorietracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CaloriesIn {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public int getCaloriesIn(String foodname, int portion)
	{
		String query="select calories from food_calories where name=?";
		
		int calories = this.getJdbcTemplate().queryForObject(query,Integer.class,foodname);
		//System.out.println(calories);
		
		return calories*portion;
	}

}
