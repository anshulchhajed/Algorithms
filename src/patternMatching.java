import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatching {

	public static void main(String[] args) {
		
	
	 String targetName = "asdfdsdfsd234@#@";
     Pattern regex = Pattern.compile("[!@#$%^&*()_+=:;\"'<,>.?/|\\{}]");
     Matcher matcher = regex.matcher(targetName);
     if (matcher.find()){
    System.out.println("found");     
     }
	}
}
    