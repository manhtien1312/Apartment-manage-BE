package com.example.apartmentmanagementbe.manageraccount;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@CrossOrigin
@RestController
public class ManagerAccountController {

	public ManagerAccountDAO dao = new ManagerAccountDAO();
	
	@PostMapping("/manager-account")
	public ManagerAccount loginRequest(@RequestBody ManagerAccount acc)
		throws JsonMappingException, JsonProcessingException, SQLException{
		ManagerAccount accResponse = dao.getAccount(acc.getUsername(), acc.getPassword());
		return accResponse;
	}
	
	
}
