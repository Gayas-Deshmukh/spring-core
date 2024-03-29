package com.spring.mvc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.com.model.Contact;
import com.spring.com.model.User;

@Controller
public class HomeController 
{
	@ModelAttribute
	public void commonModel(Model model)
	{
		// This will get Called everytime when controller get called & it will set the value into the model
		// this will be useful when we want the same data in the multiple views.
		// so instead of setting those data into separate method we can create a common method & set it.
		// so before calling other method controller will this method & set the data into model
		System.out.println("Common model gets called");
		
		model.addAttribute("Course", "Spring MVC");
		model.addAttribute("Athor", "Durgesh");
	}
	
/*****************************************************************************************/

	@RequestMapping(path = {"/", "/home"})
	public String getHome(Model model)
	{
		System.out.println("This is home");
		
		// Transfer data from controller to View Using Model
		
		model.addAttribute("name", "Gayas");
		
		ArrayList<String> frinds = new ArrayList<String>();
		
		frinds.add("Nitin");
		frinds.add("Dinesh");
		frinds.add("Amol");
		
		model.addAttribute("fds", frinds);
		
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView getHelp()
	{
		System.out.println("This is help");
		
		// Transfer data from Controller to the View Using ModelAndView
		
		ModelAndView modelAndView = new ModelAndView();
		
		// Setting data
		modelAndView.addObject("name", "Gayas Deshmukh");
		modelAndView.addObject("city", "Nashik");
		
		// setting view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
	@RequestMapping("/jstl")
	public String useOfJSPJSTLTagsAndExpression(Model model)
	{
		model.addAttribute("course", "FullStack");
		
		ArrayList<String> courses = new ArrayList<>();
		
		courses.add("Java");
		courses.add("J2EE");
		courses.add("SQL");
		courses.add("Spring");
		
		model.addAttribute("courses", courses);
		
		return "jstl";
	}
	
	@RequestMapping("/registration")
	public String userRegistration()
	{
		return "userForm";
	}
	
/*****************************************************************************************/

	/*
	 *  User of @RequestParam annotation
	 *  1. it works exactly similar to "HttpServletRequest request"
	 *  2. we can define 4 parameters on this annotations. the params like name, value, required, defaultValue
	 *  3. by default @RequestParam annotation "name" has marked as required=true but we can make it false as per our requirements.
	 *  4. if it has marked as required=true then form must have a field with that name otherwise it will throw exception.
	 *  5. we can also set default value of the param.
	 *  6. The Param value will get automatically casted to respective type i.e String Integer
	 */
/*	@RequestMapping(path = "/userDetails", method = RequestMethod.POST)
	public String registerUser1(
			@RequestParam(name = "name", required = false, defaultValue = "Rohit") String userName, 
			@RequestParam("email") String userEmail,
			@RequestParam("city") String userCity, 
			@RequestParam("pincode") Integer cityPincode,
			Model model) 
	{
		System.out.println(userName);
		System.out.println(userEmail);
		System.out.println(userCity);
		System.out.println(cityPincode);

		model.addAttribute("Name", userName);
		return "success";
	}
*/	
	
	/*
	 * User @ModelAttribute annotation
	 * 1. We can use this annotation to map whole map with object instead of using RequestParam annotation.
	 * 2. The Object to which the form will get mapped should contains same properties name that form field has.
	 * 3. we can use this annotation on method to set data into model which is required into multiple views.
	 */
	@RequestMapping( path = "/userDetails", method = RequestMethod.POST)
	public String registerUser2(@ModelAttribute(name = "userForm") User user, Model model)
	{
		System.out.println(user);
		// We can save to database as well, for that we can use Spring ORM
		model.addAttribute("user", user);
		return "success";
	}
	
/*****************************************************************************************/
	
	/*
	 *  Redirection 
	 *  - There are two ways of redirection
	 *  1. using redirect: prefix e.g redirect:/home
	 *  2. using RedirectView
	 */
	
	//1.  Using redirect: prefix
	/*
	@RequestMapping("/from")
	public String redirectFrom()
	{
		System.out.println("From");
		return "redirect:/to";
	}
	
	@RequestMapping("/to")
	public String redirectTo()
	{
		System.out.println("To");
		return "redirect:/home";
	}
	*/
	
	// 2. using RedirectView
	@RequestMapping("/from")
	public RedirectView redirectFrom()
	{
		System.out.println("From");
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("to");
		return redirectView;
	}
	
	@RequestMapping("/to")
	public RedirectView redirectTo()
	{
		System.out.println("To");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("home");
		return redirectView;
	}
	
/*****************************************************************************************/
    // Complex Form
	@RequestMapping(path = "/contact")
	public String contactDetails()
	{
		return "contact_form";
	}
	
	@RequestMapping(path = "/contact-details")
	public String getContactDetails(@ModelAttribute() Contact contact, Model model, BindingResult result)
	{
		if (result.hasErrors())
		{
			return "redirect:/contact_form";
		}
		
		System.out.println(contact);
		System.out.println(contact.getAddress());
		
		return "contact_success";
	}

/*****************************************************************************************/
	
	 // File Upload
	
		@RequestMapping(path = "/file-upload")
		public String uploadFile()
		{
			return "fileUpload";
		}
		
		@RequestMapping(path = "/get-file", method = RequestMethod.POST)
		public String fileAccess(@RequestParam(name="profile") CommonsMultipartFile file, HttpSession session, Model model)
		{
			System.out.println("File Size : " +  file.getSize());
			System.out.println("File Name : " +  file.getOriginalFilename());
			System.out.println("File Content Type : " +  file.getContentType());

			// File data
			byte [] fileData = file.getBytes();
			
			// Retrivining file path using session		
			String realPath = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" +
			File.separator + "images" + File.separator + file.getOriginalFilename() ;
			
			System.out.println("File Path : " + realPath);

			//saving file on server
			
			try 
			{
				FileOutputStream outPutStream	= new FileOutputStream(realPath);
				
				outPutStream.write(fileData);	
				
				System.out.println("File Uploaded SuccessFully...");
				
				model.addAttribute("fileName", file.getOriginalFilename());
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
				System.out.println("Error while Uploading File");
			}
				
			return "uploaded_file";
		}
		
/*****************************************************************************************/
		
		// PathVariable annotation
		@RequestMapping("user/{id}/{name}")
		public String gethome(@PathVariable("id") int userId, @PathVariable("name") String userName)
		{
			System.out.println("Id : " + userId);
			System.out.println("Name : " + userName);
			
			// Trying to Generate Exception
			// userName.charAt(10);        // -> http://localhost:8080/springmvc/user/3/sddd -> throw Generic Exception
			 Integer.parseInt(userName);   //-> http://localhost:8080/springmvc/user/3/sddd -> throw Number Format Exception
			
			return "home";
		}
		
/*****************************************************************************************/
		
		// RequestParam annotation
		// http://localhost:8080/springmvc/book?id=5&&name=java
		@RequestMapping(path="/book", method = RequestMethod.GET)
		public String gethome(@RequestParam("id") String userId)
		{
			System.out.println("Id : " + userId);
			return "home";
		}
		
/*****************************************************************************************/
		// Exception handler
		/* 1. Whenever there is any exception occurred in this controller then below Exception handler will handle those exception
		 *    based on type of exception.
		 * 2. We can also pass httpStatus when we are deal with Rest API
		 * Test @RequestMapping("user/{id}/{name}")
		 */
/*		
		//Specific Exception Handler
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
*/

}
