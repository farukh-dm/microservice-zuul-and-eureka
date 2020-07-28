"# microservice-zuul-and-eureka" 

  Zuul & Eureka:
  
  https://cloud.spring.io/spring-cloud-netflix/multi/multi__router_and_filter_zuul.html#netflix-zuul-reverse-proxy
  https://medium.com/@iroshan.du/spring-boot-micro-services-with-eureka-and-zuul-proxy-with-fegin-client-68a3ad78453b
  https://www.baeldung.com/zuul-load-balancing
  
  zuul:
    routes:
      users:
        path: /myusers/**
        serviceId: users_service   
        
	- HTTP calls to /myusers get forwarded to the users_service service        
	- The location of the back end can be specified as either a serviceId (for a service from discovery) 
	or a url (for a physical location), as shown in the following example:      
	- The service is load balance with Ribbon internally using serviceId.

	Example:
	create Zuul server/application as Eureka Client too, so that it can fetch information from discovery server about other services.
	So when you request for a service with serviceId (registered/applicatio name), Zuul application will have information about all the
	instances of that service & would internally be load balanced using Ribbon.

	- serviceId (users_service) == spring.application.name
          
          
