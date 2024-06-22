package log4j;



import org.apache.logging.log4j.*;

public class Test4J {

private static Logger log=LogManager.getLogger(Test4J.class.getName());
public static void main(String[] args) {
	log.debug("I am debugging");
	if(2<0)
	{
	log.debug("Object is present");
	}
	else
	{
		log.info("object is present");
		log.error("objec is not present");
		log.fatal("this is fatle");
	}
}

}
