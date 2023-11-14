package org.microcommerce.ws.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class productController {
	
	@GetMapping("")
	public String getMessageHello() {
		return "hello you are here in Micro WS application !!!!";
	}

}
