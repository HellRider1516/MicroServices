package in.mahesh.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class CircuitBreakerRest {
	
	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "dataFromDataBase" , name = "mahesh")
	public String dataFromRedis() {
		System.out.println("Data is fetch from redis.......");
		int i=10/0;
		return "Data fetch from Redis..";
	}
	
	
	public String dataFromDataBase(Throwable t) {
		System.out.println("Data is fetch from DataBase.......");
		return "Data fetch from DataBase..";
	}

}
