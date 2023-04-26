package regexdemo;
import java.util.regex.Matcher;// an engine that performs match operations 
//on a character sequence by interpreting a Pattern.
import java.util.regex.Pattern;// an API to define a pattern for searching or manipulating strings. 
public class Regex2 {

	public static void main(String[] args) {
		//1st way
		Pattern p = Pattern.compile("..s");//(dot) represents any 
		Matcher m = p.matcher("zhs");
		boolean b1 = m.matches();
		
		//2nd way
		boolean b2 =Pattern.compile(".s").matcher("vs").matches();
		
		//3rd way
		boolean b3 = Pattern.matches("..s","mns");
		
		System.out.println(b1+" "+b2+" "+b3);

	}

}
