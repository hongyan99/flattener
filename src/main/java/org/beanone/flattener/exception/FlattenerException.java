package org.beanone.flattener.exception;

public class FlattenerException extends RuntimeException {
	private static final long serialVersionUID = -3021683698128839372L;

	public FlattenerException(Exception e) {
		super(e);
	}
}
