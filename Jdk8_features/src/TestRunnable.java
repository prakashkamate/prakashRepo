import methodreference.Show;

public class TestRunnable {
	
	
	
	public static void main(String[] args) {
		
		Show s=(msg)->{
			System.out.println(msg+" Show----Interface");
			return msg;
		};
		
		s.display("Display Method of");
		}
	
	

}
