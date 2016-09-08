/*
 * Copyright 2016 JSpare.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.jspare.core.exception;

import org.jspare.core.exception.InfraRuntimeException;

/**
 * The Class SerializationException.
 *
 * @author pflima
 * @since 05/10/2015
 */
public class SerializationException extends InfraRuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new serialization exception.
	 *
	 * @param message
	 *            the message
	 */
	public SerializationException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new serialization exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public SerializationException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new serialization exception.
	 *
	 * @param cause
	 *            the cause
	 */
	public SerializationException(Throwable cause) {
		super(cause);
	}
}