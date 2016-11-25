/**
 * 
 */
package com.greeting;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author RK
 *
 */

@RestController 
public class GreetingController {

	private enum Relation {
		Friend,Boyfriend,Girlfriend,Father,Mother,Husband,Wife,Enemy;
	}
	
	@RequestMapping(value="/greeting", method=RequestMethod.POST, consumes="application/json")
	public String getmessage(@RequestBody String getpayload) throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		//mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Greeting greeting = new Greeting();
		greeting = mapper.readValue(getpayload, Greeting.class);
		Relation relation = Relation.valueOf(greeting.getRelation());
		String inputmessage = greeting.getMessageSummary();
		String messagetemplate;
		System.out.println(inputmessage.isEmpty());
		System.out.println("Hello"+inputmessage+"Darling");
		System.out.println("".equals(inputmessage));
		
		if (inputmessage.isEmpty() || "".equals(inputmessage)){
			switch(relation){
			case Friend:
					messagetemplate = "Love you friend";
				    greeting.setMessageSummary(messagetemplate);			    
				break;
			case Boyfriend:
				messagetemplate = "Love you boyfriend";
			    greeting.setMessageSummary(messagetemplate);			    
			    break;
			case Girlfriend: 
				messagetemplate = "Love you girlfriend";
			    greeting.setMessageSummary(messagetemplate);			    
			break;
			case Father: 
				messagetemplate = "Love you daddy";
			    greeting.setMessageSummary(messagetemplate);			    
			break;
			case Mother:
				messagetemplate = "Love you mommy";
			    greeting.setMessageSummary(messagetemplate);			    
			break;
			case Husband:
				messagetemplate = "Love you husband";
			    greeting.setMessageSummary(messagetemplate);			    
			break;
			case Wife: 
				messagetemplate = "Love you wife";
			    greeting.setMessageSummary(messagetemplate);			    
			break;
			case Enemy: 
				messagetemplate ="Miss you enemy" + 
						"-" + greeting.getFname();
			    greeting.setMessageSummary(messagetemplate);			    
			break;
			default:
				break;	
				
		} }else {	
			greeting.setMessageSummary(inputmessage);	
		}			  
		System.out.println(greeting.getMessageSummary());
		String temp = mapper.writeValueAsString(greeting);
		//return  mapper.writeValueAsString(greeting);
		System.out.println(temp);
		return temp;

	}
	
}
