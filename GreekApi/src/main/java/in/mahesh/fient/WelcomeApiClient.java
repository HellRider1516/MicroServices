package in.mahesh.fient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WELCOMEAPI")
public interface WelcomeApiClient {
	
	@GetMapping("/welcome")
	public String invokeMsg();

}
