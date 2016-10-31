/**
 * 
 */
package com.Greetings;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author RK
 *
 */

@RestController 
public class GreetingsController {

	private enum Relation {
		Friend,Boyfriend,Girlfriend,Father,Mother,Husband,Wife,Enemy;
}
	@RequestMapping(value="/greeting", method=RequestMethod.POST, consumes="application/json")
	public String getmessage(@RequestBody String getpayload) throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		//mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Greetings greeting = mapper.readValue(getpayload, Greetings.class);
		Relation relation = Relation.valueOf(greeting.getRelation());
		String inputmessage = greeting.getMessage();
		String messagetemplate;
		if (inputmessage.isEmpty()){
			switch(relation){
			case Friend:
					messagetemplate = "Love you friend";
				    greeting.setMessage(messagetemplate);			    
				break;
			case Boyfriend:
				messagetemplate = "Love you boyfriend";
			    greeting.setMessage(messagetemplate);			    
			break;
			case Girlfriend: 
				messagetemplate = "Love you girlfriend";
			    greeting.setMessage(messagetemplate);			    
			break;
			case Father: 
				messagetemplate = "Love you daddy";
			    greeting.setMessage(messagetemplate);			    
			break;
			case Mother:
				messagetemplate = "Love you mommy";
			    greeting.setMessage(messagetemplate);			    
			break;
			case Husband:
				messagetemplate = "Love you husband";
			    greeting.setMessage(messagetemplate);			    
			break;
			case Wife: 
				messagetemplate = "Love you wife";
			    greeting.setMessage(messagetemplate);			    
			break;
			case Enemy: 
				messagetemplate ="Miss you enemy" + 
						"-" + greeting.getFname();
			    greeting.setMessage(messagetemplate);			    
			break;
			default:
				break;	
				
		} }else {	
			greeting.setMessage(inputmessage);	
		}			  
		return  mapper.writeValueAsString(greeting);	
	}
	
	@RequestMapping(value="/{fname}/{Relation}/{About Relation}", method=RequestMethod.GET, consumes="application/json")
	public Greetings getdetails(@RequestParam(value="fname") String fname, @RequestParam(value="Relation") String relation, @RequestParam(value="About Relation") String message){		
		Greetings greet = new Greetings(fname, relation, message);
		return greet;			
	}
}
