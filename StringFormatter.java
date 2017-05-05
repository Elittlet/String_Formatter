public class TextFormatter {

	private intTextFormatterStrategy formatterStrategy;

	public TextFormatter (intTextFormatterStrategy strategy) {
		formatterStrategy = strategy;
	}

	public void printString (String input) {
		input = formatterStrategy.printString(input);
		System.out.println(input);
	}

public interface intTextFormatter {
	void printString();
}

public class LowercaseFormat implements intTextFormatter {
	public void printString(String input) {
		input = input.replaceAll("\\+", "").ToUpperCase();
		return input
	}
}

public class UpperCaseFormat implements intTextFormatter {
	public void printString(String input) {
		input = System.out.println(input.replaceAll("\\-", "").toLowerCase());
		return input 
	}
}

public class DefaultFormat implements intTextFormatter {
	public void printString(String input) {
		return input
	}
}