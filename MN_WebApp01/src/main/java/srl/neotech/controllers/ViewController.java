package srl.neotech.controllers;


import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import srl.neotech.model.Aereo;
import srl.neotech.model.SingleListaAerei;
import srl.neotech.requestresponse.ListaAereiResponse;
import srl.neotech.requestresponse.ProvaGetRequest;
import srl.neotech.requestresponse.RequestRegistrazione;

@Controller
public class ViewController {

	
	@RequestMapping(value="/genera-aerei", method = RequestMethod.GET)
	public String generaAerei(Model model) {
		
		for (int i=0;i<100;i++) {
			Aereo aereo=new Aereo();
			aereo.setId(UUID.randomUUID().toString());
			aereo.setNome("Boing");
			aereo.setNumPasseggeri(200);
			SingleListaAerei.getInstance().getListaAerei().add(aereo);
		}
		model.addAttribute("numeroAereiGenerati", SingleListaAerei.getInstance().getListaAerei().size());
		return "genera-aerei";
	}
	
	
	@RequestMapping(value="/lista-aerei", method = RequestMethod.GET)
	public String listaAerei(Model model) {
		ListaAereiResponse response=new ListaAereiResponse();
		response.setListaAereiRestituiti(SingleListaAerei.getInstance().getListaAerei());
		model.addAttribute("responseAerei", response);
		return "lista-aerei";
	}
	
	
	
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String test(Model model) {
		 model.addAttribute("registrazione", new RequestRegistrazione()); 
		return "test_view";
	}
	
	
	@RequestMapping(value="/provaget", method = RequestMethod.GET)
	public String provaGet(Model model) {
		ProvaGetRequest datiRequest=new ProvaGetRequest();
		model.addAttribute("mapping_dati", datiRequest);
		return "provaget_view";
	}
	
	
	
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("mioTesto", "ProvaMassimiliano");
		return "hello_view";
	}
		
	@RequestMapping(value="/ajax", method = RequestMethod.GET)
	public String ajax() {
		return "ajax_view";
	}
	
	
	@RequestMapping(value="/registrazione_dati", method = RequestMethod.POST)
	public String registrazioneDati(@ModelAttribute("registrazione") RequestRegistrazione dati_in_input, Model model) {
         System.out.println(dati_in_input.getUsername());
         System.out.println(dati_in_input.getPassword());
         model.addAttribute("utente", dati_in_input.getUsername());
         return "registrazione_ok_view";
	}
	
	
	@RequestMapping(value="/inviodati_get", method = RequestMethod.POST)
	public String ricezioneDati(@ModelAttribute("mapping_dati") ProvaGetRequest dati_in_input, Model model) {
         System.out.println(dati_in_input.getUsername());
         System.out.println(dati_in_input.getEmail());
         
         ArrayList<Aereo> listaAerei=new ArrayList<Aereo>();
         for(int i=0;i<10;i++) {
        	 Aereo aereo=new Aereo();
        	 aereo.setId(UUID.randomUUID().toString());
        	 aereo.setNome("Boing 747");
        	 aereo.setNumPasseggeri(ThreadLocalRandom.current().nextInt(1, 100 + 1));
        	 aereo.setNumStelline(ThreadLocalRandom.current().nextInt(1, 4 + 1));
        	 if(i==0) aereo.setUrl_immagine("https://images-eu.ssl-images-amazon.com/images/I/71y+8f0a7YL._AC_UL160_SR160,160_.jpg");
        	 if(i==1) aereo.setUrl_immagine("https://images-eu.ssl-images-amazon.com/images/I/81pQTGSlaSL._AC_UL160_SR160,160_.jpg");
        	 if(i==2) aereo.setUrl_immagine("https://images-eu.ssl-images-amazon.com/images/I/515QflVvi1L._AC_UL160_SR160,160_.jpg");
        	 if(i==3) aereo.setUrl_immagine("https://images-eu.ssl-images-amazon.com/images/I/71A0emybJXL._AC_UL160_SR160,160_.jpg");
        	 listaAerei.add(aereo);	 
         }
         

         
         Aereo aereoDaCancellare=new Aereo();
         aereoDaCancellare.setId("ID"+1);                        
         listaAerei.remove(aereoDaCancellare);
        		 
         model.addAttribute("listaAerei",listaAerei);
         model.addAttribute("utente", dati_in_input.getUsername());
         
         
         
         return "registrazione_ok_view";
	}
}
