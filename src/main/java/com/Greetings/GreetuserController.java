/**
 * 
 */
package com.Greetings;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author RK
 *
 */
public class GreetuserController {

	@RequestMapping(value="/greet", method=RequestMethod.GET, consumes="application/json")
	public String getmessage(@RequestBody String getpayload) throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		
		return getpayload;
}
}
