package in.mahesh.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class WelcomeDemo {

	@Value("${msg}")
	@Autowired
	private String msg;
	
	@GetMapping("/welcome")
	public String wlcomeMsg(){
		return msg;
	}

}
