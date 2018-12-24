/* 
 * Copyright
 * 
 */
package io.mosip.preregistration.application.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * This DTO class is used to define the Preregistration Id and Status code
 * 
 * @author Jagadishwari S
 * @since 1.0.0
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class PreRegistartionStatusDTO implements Serializable {


	private static final long serialVersionUID = -1088172470058130997L;

	private String PreRegistartionId;

	private String StatusCode;

}
