/**
 * 
 */
package com.raidentrance.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author raidentrance
 *
 */
@RestController
public class SampleController {
	
	@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}

}
