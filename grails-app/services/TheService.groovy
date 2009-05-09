public class TheService implements TheServiceInterface {

	public void service(Integer i) {
		log.debug "TheService.service(${i})"
		println "TheService.service(${i})"
	}

}