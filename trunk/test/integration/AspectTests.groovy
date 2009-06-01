import grails.spring.*
import org.springframework.aop.SpringProxy

class AspectTests extends GroovyTestCase 
{
	
	void testBeforeAdvice()
	{
		def bb = new BeanBuilder()

        bb.beans {
            xmlns aop:"http://www.springframework.org/schema/aop"

            theService(TheService) 
            beforeAspect(MethodWatcher)

			aop.config("proxy-target-class":true) {
				aspect( id:"trackMethodBefore", ref:"beforeAspect" ) {
					before method:"watchMethodCall", pointcut: "execution(* TheServiceInterface.service(..))"
				}
			}
		}



        def appCtx = bb.createApplicationContext()
        def theService = appCtx.getBean("theService")

		MethodWatcher watcher = appCtx.getBean('beforeAspect')

		assertEquals 0, watcher.calls
		assertEquals 0, theService.serviceCalls
		
        theService.service(8)

		assertEquals 1, watcher.calls
		assertEquals 1, theService.serviceCalls

		shouldFail {
			theService.service(8)
		}

		assertEquals 2, watcher.calls
		assertEquals 1, theService.serviceCalls

		theService.service(8)
        
		assertEquals 3, watcher.calls
		assertEquals 2, theService.serviceCalls


		shouldFail {
			theService.service(8)
		}

		assertEquals 4, watcher.calls
		assertEquals 2, theService.serviceCalls
	}
	
	void testAfterAdvice()
	{
		def bb = new BeanBuilder()

        bb.beans {
            xmlns aop:"http://www.springframework.org/schema/aop"

            theService(TheService) 
            afterAspect(MethodWatcher)

            aop.config("proxy-target-class":true) {
                aspect( id:"trackMethodAfter", ref:"afterAspect" ) {
                    after method:"watchMethodCall", pointcut: "execution(* TheServiceInterface.service(..))"
                }
            }
        }


        def appCtx = bb.createApplicationContext()
        def theService = appCtx.getBean("theService")

		MethodWatcher watcher = appCtx.getBean('afterAspect')

		assertEquals 0, watcher.calls
		assertEquals 0, theService.serviceCalls
		
        theService.service(8)

		assertEquals 1, watcher.calls
		assertEquals 1, theService.serviceCalls

		shouldFail {
			theService.service(8)
		}

		assertEquals 2, watcher.calls
		assertEquals 2, theService.serviceCalls

		theService.service(8)
        
		assertEquals 3, watcher.calls
		assertEquals 3, theService.serviceCalls


		shouldFail {
			theService.service(8)
		}

		assertEquals 4, watcher.calls
		assertEquals 4, theService.serviceCalls
	}
	
	void testAroundAdvice()
	{
		def bb = new BeanBuilder()

        bb.beans {
            xmlns aop:"http://www.springframework.org/schema/aop"

            theService(TheService) 
            theAroundAspect(TheAspect)

            anotherService(apackage.AnotherService) 
            anotherAroundAspect(apackage.AnotherAspect)

            aop {
                config("proxy-target-class":true) {
                    aspect( id:"myAspect", ref:"theAroundAspect" ) {
                        around method:"invoke", pointcut: "execution(* TheServiceInterface.service(..))"
                    }
                    aspect( id:"myOtherAspect", ref:"anotherAroundAspect" ) {
                        around method:"invoke", pointcut: "execution(* *.AnotherServiceInterface.service(..))"
                    }
                }
            }
        }


        def appCtx = bb.createApplicationContext()

        def theService = appCtx.getBean("theService")
		TheAspect theAspect = appCtx.getBean('theAroundAspect')

		assertEquals 0, theAspect.calls
		assertEquals 0, theService.serviceCalls
		
        def result = theService.service(8)

		assertEquals 'Hello world from a service the updated value', result

		assertEquals 1, theAspect.calls
		assertEquals 1, theService.serviceCalls
		
        result = theService.service(8)

		assertEquals 'Hello world from a service the updated value', result

		assertEquals 2, theAspect.calls
		assertEquals 2, theService.serviceCalls
		
		
        def anotherService = appCtx.getBean("anotherService")
		apackage.AnotherAspect anotherAspect = appCtx.getBean('anotherAroundAspect')

		assertEquals 0, anotherAspect.calls
		assertEquals 0, anotherService.serviceCalls
		
        result = anotherService.service(8)

		assertEquals 'Hello world from another service! another updated value', result

		assertEquals 1, anotherAspect.calls
		assertEquals 1, anotherService.serviceCalls
		
        result = anotherService.service(8)

		assertEquals 'Hello world from another service! another updated value', result

		assertEquals 2, anotherAspect.calls
		assertEquals 2, anotherService.serviceCalls
		

	}
	
	
}

class MethodWatcher
{
	def calls = 0
	
	def watchMethodCall()
	{
		calls++
		
		if(calls % 2 == 0)
		{
			throw new RuntimeException()
		}
	}
}
