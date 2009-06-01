public class TheService implements TheServiceInterface {

	def serviceCalls = 0
	
	def service(Integer i) {
		serviceCalls++
		log.debug "TheService.service(${i})"
		return "Hello world from a service"
	}

}