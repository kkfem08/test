
package com.firstapi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstapi {
	@GetMapping("/welcome")
 public String welcome() {
	 return "welcome to my First Api";
 }
}
