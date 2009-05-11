public class TheService implements TheServiceInterface {

	def service(Integer i) {
		log.debug "TheService.service(${i})"
		println "TheService.service(${i})"
		return "Hello world from a service"
	}

}