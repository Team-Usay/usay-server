package usay.app.domain.common.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usay.app.domain.ApiResponse;

@RequestMapping("/health")
@RestController
public class HealthApi {
	@GetMapping
	public ApiResponse<Void> health() {
		return ApiResponse.success();
	}
}
