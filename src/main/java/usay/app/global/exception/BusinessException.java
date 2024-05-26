package usay.app.global.exception;

import lombok.Getter;
import usay.app.domain.dto.ErrorCode;

@Getter
public abstract class BusinessException extends RuntimeException {
	private final ErrorCode errorCode;

	protected BusinessException(String message, ErrorCode errorDetail) {
		super(message);
		this.errorCode = errorDetail;
	}

	public BusinessException(ErrorCode errorDetail) {
		this.errorCode = errorDetail;
	}
}
