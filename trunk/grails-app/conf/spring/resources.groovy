
beans = {
	xmlns aop:"http://www.springframework.org/schema/aop"

	theAspect(TheAspect)
	anotherAspect(apackage.AnotherAspect)

	// aop { 
	// 	config { 
	// 		aspect(ref:"theAspect") { 
	// 			pointcut id:"thePointcut", expression:"execution(* *.TheServiceInterface.service(Integer)) && args(i)" 
	// 			around 'pointcut-ref':"thePointcut", method:"invoke", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    

	// aop { 
	// 	config("proxy-target-class":true) { 
	// 		aspect(id:"theAspectId", ref:"theAspect" ) { 
	// 			around method:"invoke", pointcut: "execution(* *.TheServiceInterface.service(Integer)) && args(i)", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    

	// aop { 
	// 	config { 
	// 		aspect(ref:"anotherAspect") { 
	// 			pointcut id:"thePointcut", expression:"execution(* *.AnotherServiceInterface.service(Integer)) && args(i)" 
	// 			around 'pointcut-ref':"thePointcut", method:"invoke", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    
	
	aop { 
		config("proxy-target-class":true) { 
			aspect(id:"anotherAspectId", ref:"anotherAspect" ) { 
				around method:"invoke", pointcut: "execution(* *.AnotherServiceInterface.service(Integer)) && args(i)", 'arg-names':"i"
			} 
		} 
	}    


	// aop { 
	// 	config("proxy-target-class":true) { 
	// 		aspect(id:"theAspectId", ref:"theAspect" ) { 
	// 			around method:"invoke", pointcut:"execution(* TheService.service(Integer)) && args(i)", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    
	 
	// aop { 
	// 	config { 
	// 		aspect(ref:"theAspect") { 
	// 			pointcut id:"thePointcut", expression:"execution(* TheService.service(Integer)) && args(i)" 
	// 			around 'pointcut-ref':"thePointcut", method:"invoke", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    
	
	// aop { 
	// 	config { 
	// 		aspect(ref:"theAspect") { 
	// 			pointcut id:"thePointcut", expression:"execution(* TheServiceInterface.service(Integer)) && args(i)" 
	// 			around 'pointcut-ref':"thePointcut", method:"invoke", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    
	
	// aop { 
	// 	config("proxy-target-class":true) { 
	// 		aspect(id:"theAspectId", ref:"theAspect" ) { 
	// 			around method:"invoke", pointcut: "execution(* TheServiceInterface.service(Integer)) && args(i)", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    
	 
	// aop { 
	// 	config { 
	// 		aspect(ref:"theAspect") { 
	// 			pointcut id:"thePointcut", expression:"execution(* TheService.service(..)) && args(i)" 
	// 			around 'pointcut-ref':"thePointcut", method:"invoke", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    
	
	// aop { 
	// 	config("proxy-target-class":true) { 
	// 		aspect(id:"theAspectId", ref:"theAspect" ) { 
	// 			around method:"invoke", pointcut: "execution(* TheService.service(..)) && args(i)", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    
	 
	// aop { 
	// 	config { 
	// 		aspect(ref:"theAspect") { 
	// 			pointcut id:"thePointcut", expression:"execution(* TheServiceInterface.service(..)) && args(i)" 
	// 			around 'pointcut-ref':"thePointcut", method:"invoke", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    
	
	// aop { 
	// 	config("proxy-target-class":true) { 
	// 		aspect(id:"theAspectId", ref:"theAspect" ) { 
	// 			around method:"invoke", pointcut: "execution(* TheServiceInterface.service(..)) && args(i)", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    
	 
	// aop { 
	// 	config("proxy-target-class":true) { 
	// 		aspect(id:"anotherAspectId", ref:"anotherAspect" ) { 
	// 			around method:"invoke", pointcut:"execution(* apackage.AnotherService.service(Integer)) && args(i)", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    
	 
	// aop { 
	// 	config { 
	// 		aspect(ref:"anotherAspect") { 
	// 			pointcut id:"thePointcut", expression:"execution(* apackage.AnotherService.service(Integer)) && args(i)" 
	// 			around 'pointcut-ref':"thePointcut", method:"invoke", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    
	
	// aop { 
	// 	config { 
	// 		aspect(ref:"anotherAspect") { 
	// 			pointcut id:"thePointcut", expression:"execution(* apackage.AnotherServiceInterface.service(Integer)) && args(i)" 
	// 			around 'pointcut-ref':"thePointcut", method:"invoke", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    
	
	// aop { 
	// 	config("proxy-target-class":true) { 
	// 		aspect(id:"anotherAspectId", ref:"anotherAspect" ) { 
	// 			around method:"invoke", pointcut: "execution(* apackage.AnotherServiceInterface.service(Integer)) && args(i)", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    
	 
	// aop { 
	// 	config { 
	// 		aspect(ref:"anotherAspect") { 
	// 			pointcut id:"thePointcut", expression:"execution(* apackage.AnotherService.service(..)) && args(i)" 
	// 			around 'pointcut-ref':"thePointcut", method:"invoke", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    
	
	// aop { 
	// 	config("proxy-target-class":true) { 
	// 		aspect(id:"anotherAspectId", ref:"anotherAspect" ) { 
	// 			around method:"invoke", pointcut: "execution(* apackage.AnotherService.service(..)) && args(i)", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    
	 
	// aop { 
	// 	config { 
	// 		aspect(ref:"anotherAspect") { 
	// 			pointcut id:"thePointcut", expression:"execution(* apackage.AnotherServiceInterface.service(..)) && args(i)" 
	// 			around 'pointcut-ref':"thePointcut", method:"invoke", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    
	
	// aop { 
	// 	config("proxy-target-class":true) { 
	// 		aspect(id:"anotherAspectId", ref:"anotherAspect" ) { 
	// 			around method:"invoke", pointcut: "execution(* apackage.AnotherServiceInterface.service(..)) && args(i)", 'arg-names':"i"
	// 		} 
	// 	} 
	// }    
	 
}


// examples/docs:
// 
// http://forum.springsource.org/showpost.php?p=213252&postcount=9
// 		? http://static.springframework.org/spring/docs/2.5.x/reference/aop.html#aop-ataspectj-advice-params
// 		? http://forum.springsource.org/showthread.php?t=30238
// 		? http://www.experts-exchange.com/Programming/Languages/Java/Q_21269825.html
// 		? http://jira.springframework.org/browse/SPR-3174
// 		? http://static.springframework.org/spring/docs/2.0.x/reference/xsd-config.html
// 		? http://www.springframework.org/schema/aop/spring-aop.xsd
// 		? http://forum.springsource.org/showthread.php?p=209424
// 		? http://www.javabeat.net/tips/85-how-to-write-interception-around-advice-in-sp.html
// 		? http://www.javalobby.org/java/forums/t44746.html
// 		? http://www.packtpub.com/article/design-with-spring-aop
// 		? http://static.springframework.org/spring/docs/2.5.x/reference/index.html
// 		? http://static.springframework.org/spring/docs/2.5.x/reference/aop.html#aop-schema
// 		? http://static.springframework.org/spring/docs/2.5.x/reference/aop-api.html
// 		? http://grails.org/doc/1.1/guide/14.%20Grails%20and%20Spring.html
// 		? http://www.zabada.com/technology/aop-example.html
// 		? http://www.infoq.com/articles/Orchestration-Oleg-Zhurakousky
// 		? http://www.jroller.com/kenwdelong/entry/circuit_breaker_in_java
// 		? http://static.springframework.org/spring/docs/2.0.x/api/org/springframework/aop/aspectj/AbstractAspectJAdvice.html
// 		? http://forum.springsource.org/showthread.php?t=62460


