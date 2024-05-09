package in.mahesh.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.mahesh.fient.WelcomeApiClient;

@RestController
public class GreetMsg {
	
	@Autowired
	private WelcomeApiClient client;
	
	@GetMapping("/greet")
	public String greetMsg() {
		String msg1 = client.invokeMsg();
		String msg2="Good Moring ,";
		return msg2+msg1;
	}

}
