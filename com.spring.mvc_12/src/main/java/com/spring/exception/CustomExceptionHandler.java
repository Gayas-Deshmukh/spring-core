package com.spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

// Used to handle All exceptions that occur in the different Controllers classes
@ControllerAdvice
public class CustomExceptionHandler 
{
	@ResponseStatus(value = HttpStatus.BAD_GATEWAY)
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Model model)
	{
		model.addAttribute("exp", "Null Pointer Exception");
		return "exception_handler";
	}
	
	@ResponseStatus(value = HttpStatus.BAD_GATEWAY)
	@ExceptionHandler(value = NumberFormatException.class)
	public String handleNumberFormateException(Model model)
	{
		model.addAttribute("exp", "Number Format Exception");
		return "exception_handler";
	}
	
	//Generic Exception Handler
	@ResponseStatus(value = HttpStatus.BAD_GATEWAY)
//	@ExceptionHandler(value = {NullPointerException.class, ArrayIndexOutOfBoundsException.class}) // we can create one handler to handle multiple exceptions
	@ExceptionHandler(value = Exception.class)
	public String handleGenericException(Model model)
	{
		model.addAttribute("exp", "Generic Exception");
		return "exception_handler";
	}

}
