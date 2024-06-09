package usay.app.global.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

	@Value("${model.server.url}")
	private String modelServerUrl;

	@Bean
	public WebClient webClient() {
		return WebClient.builder()
				.baseUrl(modelServerUrl)
				.build();
	}
}
