
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TheAspect implements MethodInterceptor {

    public Object invoke(MethodInvocation method) throws Throwable 
	{
        log.debug("Before Invoking Method");
        println("Before Invoking Method");

        Object val = method.proceed();

        log.debug("After Invoking Method");
        println("After Invoking Method");

        return val + "updated value";
    }

    public Object invoke(MethodInvocation method, Integer i) throws Throwable 
	{
        log.debug("Before Invoking Method with ${i}");
        println("Before Invoking Method with ${i}");

        Object val = method.proceed();

        log.debug("After Invoking Method with ${i}");
        println("After Invoking Method with ${i}");

        return val + "updated value";
    }

}