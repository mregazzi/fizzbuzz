
public class WordRule implements Rule {

	private Integer divisor;
	private String answer;
	
	public WordRule(Integer divisor, String answer) {
		this.divisor = divisor;
		this.answer = answer;
		
	}
	
	@Override
	public void say(Integer value, StringBuilder response) {
		if (value % divisor == 0) {
			response.append(answer);
		}
	}
}
