package usay.app.global.exception;

import usay.app.domain.ErrorCode;

public class InvalidException extends BusinessException {

	public InvalidException(String message, ErrorCode errorCode) {
		super(message, errorCode);
	}

	public InvalidException(String message) {
		super(message, ErrorCode.INVALID);
	}

	public InvalidException(ErrorCode errorCode) {
		super(errorCode);
	}
}
