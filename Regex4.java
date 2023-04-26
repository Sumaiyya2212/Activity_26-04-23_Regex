package regexdemo;
import java.util.regex.Pattern;
//meta characters - \d => [0-9],\s=> white Space character, \w => [a-zA-Z_0-9]
public class Regex4 {

	public static void main(String[] args) {
       boolean f1 = Pattern.matches("[\\w]{6,}","Sumaiyya2212");
       boolean phone = Pattern.matches("[6789]\\d{9}","6234567890");
       
       System.out.println(f1+" "+phone);
	}

}
