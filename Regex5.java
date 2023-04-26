package regexdemo;
import java.util.regex.Pattern;
//meta character -\d => [0-9],\s => white Space character,\w=>[a-zA-Z_0-0]
public class Regex5 {

	public static void main(String[] args) {
          boolean f1 = Pattern.matches("[\\w]{6,}","Sumaiyya12");
          boolean phone = Pattern.matches("[6789]\\d{9}","6234567890");
          boolean email = Pattern.matches("[a-z0-9+_.-]+@[a-z]+\\.[a-z]{3}", "sumaiyya2212@gmail.com");
          System.out.println(f1+" "+phone+" "+email);

	}

}
