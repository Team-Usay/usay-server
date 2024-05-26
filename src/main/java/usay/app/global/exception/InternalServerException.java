package usay.app.global.exception;

import lombok.Getter;
import usay.app.domain.dto.ErrorCode;

@Getter
public class InternalServerException extends BusinessException {

	public InternalServerException(String message, ErrorCode errorCode) {
		super(message, errorCode);
	}

	public InternalServerException(String message) {
		super(message, ErrorCode.INTERNAL_SERVER_ERROR);
	}

	public InternalServerException(ErrorCode errorCode) {
		super(errorCode);
	}
}