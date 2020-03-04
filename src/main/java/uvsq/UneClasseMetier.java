package uvsq;

import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UneClasseMetier implements Inter {

	private static final Logger logger = LoggerFactory.getLogger(UneClasseMetier.class);
	
	public UneClasseMetier() {
		
		
		
	}
	
	
	public void uneMethodeMetier() {
		
		System.out.println(LocalDateTime.now() + ": Debut de uneMethodeMetier");
		
		
		System.out.println(LocalDateTime.now() + ": Fin de uneMethodeMetier");
	}
	
	
	public void uneMethodeMetierSlf4j() {
		
	logger.debug( ": Debut de uneMethodeMetier");
		//logger.debug(LocalDateTime.now() + ": Fin de uneMethodeMetier");
		
		
	}
	
	
	
}
