package apackage

public class AnotherService implements AnotherServiceInterface {

	def service(Integer i) {
		log.debug "AnotherService.service(${i})"
		println "AnotherService.service(${i})"
		return "Hello world from another service!"
	}

}