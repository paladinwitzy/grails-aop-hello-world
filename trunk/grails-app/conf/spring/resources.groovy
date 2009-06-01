
beans = {
	xmlns aop:"http://www.springframework.org/schema/aop"

	theAspect(TheAspect)
	anotherAspect(apackage.AnotherAspect)

	aop.config("proxy-target-class":true) { 
		aspect(id:'theAspectDef', ref:"theAspect") { 
			around method:"invoke", pointcut:"execution(* TheServiceInterface.service(..))" 
		} 
		aspect(id:'anotherAspectDef', ref:"anotherAspect") { 
			around method:"invoke", pointcut:"execution(* *.AnotherServiceInterface.service(..))" 
		} 
	}
}
