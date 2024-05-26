package usay.app.domain.dto;

import lombok.Getter;

@Getter
public enum ErrorCode {

	// 400 Bad Request
	INVALID("SAY400", "Invalid Request"),
	INVALID_INPUT_VALUE("SAY000", "Invalid Input Value"),
	INVALID_AI_MODEL("SAY001", "Invalid AI Model"),
	INVALID_AI_MODEL_VERSION("SAY002", "Invalid AI Model Version"),

	// 404 Not Found
	NOT_FOUND("SAY404", "Not Found"),
	NOT_FOUND_AI_MODEL("SAY400", "AI Model Not Found"),

	// 500 Internal Server Error
	INTERNAL_SERVER_ERROR("SAY500", "Server Error");
	// 401 Unauthorized
	private final String code;
	private final String message;

	ErrorCode(String code, String message) {
		this.code = code;
		this.message = message;
	}
}
