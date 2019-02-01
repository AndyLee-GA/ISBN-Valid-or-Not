import java.lang.*;
public class ISBNClient {
	public static void main(String args[]) {
		ISBN s = new ISBN("013394302","X");
		
	System.out.println(	"the id is " + s.isValid());
	System.out.println(s.toString());
	}	
}
