package srl.neotech.academy.automobile;

import java.util.Iterator;

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automobile fordCMax=new Automobile();
		
		fordCMax.setColore("Blu");
		fordCMax.setMarca("Ford");

		fordCMax.getMotore().setCilindrata(122);
		System.out.println(fordCMax.getMotore().getAlimentazione());
		System.out.println(fordCMax.getMotore().getCilindro().getVolume());

		
	}
	

}
