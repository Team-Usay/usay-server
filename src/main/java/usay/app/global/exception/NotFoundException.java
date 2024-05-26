package usay.app.global.exception;

import usay.app.domain.dto.ErrorCode;

public class NotFoundException extends BusinessException {

	public NotFoundException(String message) {
		super(message, ErrorCode.NOT_FOUND);
	}

	public NotFoundException() {
		super(ErrorCode.NOT_FOUND);
	}
}