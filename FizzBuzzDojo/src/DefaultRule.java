
public class DefaultRule implements Rule {

	@Override
	public void say(Integer value, StringBuilder response) {
		if (response.toString().length() == 0) {
			response.append(value.toString());
		}

	}

}
