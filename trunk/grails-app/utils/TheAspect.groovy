
import org.apache.commons.logging.LogFactory
import org.aspectj.lang.ProceedingJoinPoint

public class TheAspect {

	def log = LogFactory.getLog(TheAspect)

	def calls = 0

    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable 
	{
		calls++
		
        log.debug("TheAspect: Before Invoking Method");

        Object val = joinPoint.proceed();

        log.debug("TheAspect: After Invoking Method");

        return val + " the updated value";
    }

}