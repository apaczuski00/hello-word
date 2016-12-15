package com.example.usluga1.service;
import java.util.List;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.usluga1.Controler;
import com.example.usluga1.domain.Testowa;
import com.example.usluga1.domain.TestowaRepository;



@Component
public class Service {
	
	@Autowired
	TestowaRepository userRepository;
	
	Log log = LogFactory.getLog(Service.class);
	
	public String funkcjsaTest(){
		Testowa test= userRepository.findById(0L);
		
		test.toString();
//		JsonObject json = Json.createObjectBuilder().add("name","adam").add("surname","paczuski").build();
//		json.toString();
		log.info("\n-------------------------info--------------------------------");
		log.info("\n-----"+test.toString()+"-----");
		return test.toString();
		
	}
	
}
