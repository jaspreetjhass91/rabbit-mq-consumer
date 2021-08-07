package com.mq.poc.rabbit.exception;

public class RabbitConsumerException extends RuntimeException {

	private static final long serialVersionUID = -3000610762701601637L;

	public RabbitConsumerException(final String cause) {
		super(cause);
	}

}
