package com.jigisha.cms.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import com.jigisha.cms.model.BookCodeValidator;
import javax.validation.Constraint;
import javax.validation.Payload;

import com.sun.tools.javac.code.Attribute.RetentionPolicy;

@Constraint(validatedBy= BookCodeValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)

public @interface BookCode {

	
	public String[] value() default {"LUV", "SUV", "ISB"};
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
	
	public String message() default "should start with LUV SUV or ISB";
	
}