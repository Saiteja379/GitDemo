package seltest;
import org.apache.logging.log4j.*;
public class log4jtest {
	
	private static Logger log= LogManager.getLogger(log4jtest.class.getName());
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Debug");
		log.error("Error");
	}

}
