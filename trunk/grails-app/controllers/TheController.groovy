class TheController
{
	def theService
	def anotherService
	
	def index = {
		
		log.debug "start TheController.index"
		println "start TheController.index"
		
		int i = 0

		println theService.service(++i) 
		println anotherService.service(++i) 

		log.debug "end TheController.index"
		println "end TheController.index"
		
		render text:'Hello world'
	}
}
