package usay.app.domain;

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
	MEMBER_NOT_FOUND("SAY40410", "Member Not Found"),
	MEMBER_DETAIL_NOT_FOUND("SAY40411", "Some of Member Detail Not Found"),
	AI_MODEL_NOT_FOUND("SAY40420", "AI Model Not Found"),
	AI_MODEL_VERSION_NOT_FOUND("SAY40421", "AI Model Version Not Found"),
	CHAT_NOT_FOUND("SAY40430", "Chat Not Found"),
	CHAT_DETAIL_NOT_FOUND("SAY40431", "Some of Chat Detail Not Found"),
	ROOM_NOT_FOUND("SAY40440", "Room Not Found"),

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
