package apackage

public class AnotherService implements AnotherServiceInterface {

	public void service(Integer i) {
		log.debug "AnotherService.service(${i})"
		println "AnotherService.service(${i})"
	}

}