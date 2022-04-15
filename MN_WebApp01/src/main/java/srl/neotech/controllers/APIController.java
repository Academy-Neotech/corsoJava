package srl.neotech.controllers;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.Aereo;
import srl.neotech.model.SingleListaAerei;
import srl.neotech.requestresponse.RequestRegistrazione;
import srl.neotech.requestresponse.RequestSearchAereo;
import srl.neotech.requestresponse.ResponseSearchAereo;

@RestController
public class APIController {

	

	@ResponseBody
	@PostMapping(value = "/api/search",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseSearchAereo search(@RequestBody RequestSearchAereo request) {
		
		SingleListaAerei.getInstance().getListaAerei().add(request.getAereo());
		
		ResponseSearchAereo response=new ResponseSearchAereo();
		response.setAerei(SingleListaAerei.getInstance().getListaAerei());
		response.setCode("ok");
		response.setMsg("no problem!");
		return response;
	
	}
	
}
