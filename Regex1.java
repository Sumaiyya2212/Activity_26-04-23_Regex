package regexdemo;

import java.util.regex.Pattern;

//character classes
//[abc] = only these 3 characters a,b or c(single)
//[^abc] = any char except a,b or c
//[a-zA-Z] = either upper/lower case or both(single)
public class Regex1 {

	public static void main(String[] args) {
		boolean b = Pattern.matches("[abc]", "r");
		boolean b1 = Pattern.matches("[^abc]", "s");
		boolean b2 = Pattern.matches("[a-zA-Z]", "A");
		System.out.println(b+" "+b1+" "+b2 );
	}

}
