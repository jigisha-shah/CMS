package com.jigisha.cms.model;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import com.jigisha.cms.model.BookCode;
public class BookCodeValidator implements ConstraintValidator<BookCode, String> {

	String[] prefix;
	
	public void initialize(BookCode b) {
		
		this.prefix=b.value();
	}
	
	public boolean isValid(String code, ConstraintValidatorContext context) {
		if(code==null)
			return true;
			 
		for(String s:prefix) {
			if(code.startsWith(s)) {
				return true;
			}
		}
		return false;
	}

}
