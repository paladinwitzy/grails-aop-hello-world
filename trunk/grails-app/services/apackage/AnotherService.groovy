package apackage

public class AnotherService implements AnotherServiceInterface {

	def serviceCalls = 0

	def service(Integer i) {
		
		serviceCalls++
		
		log.debug "AnotherService.service(${i})"
		return "Hello world from another service!"
	}

}