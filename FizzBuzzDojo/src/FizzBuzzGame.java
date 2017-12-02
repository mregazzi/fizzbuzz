import java.util.List;

public class FizzBuzzGame {
	
	private final List<Rule> rules;
	
	public FizzBuzzGame(List<Rule> rules) {
		this.rules = rules;		
	}
	
	public String say(Integer value) {
		StringBuilder response = new StringBuilder();
		
		for (Rule rule : rules) {
			rule.say(value, response);
		}
		
		return response.toString();
			
	}

	

}
