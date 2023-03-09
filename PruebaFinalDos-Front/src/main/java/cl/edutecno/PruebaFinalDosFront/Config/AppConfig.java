package cl.edutecno.PruebaFinalDosFront.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	//va siempre en proyecto, para que responda con una vista cada vez que llame a restTemplate
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
		
	}
}
