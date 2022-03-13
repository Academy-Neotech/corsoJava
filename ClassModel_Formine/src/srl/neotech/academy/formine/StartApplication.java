package srl.neotech.academy.formine;

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IForminaAnimale nemo=new ForminaPesciolino();
		nemo.aggiungiCoda(7);
		nemo.creaForma();
		
		IForminaEdificio castello=new ForminaCastello();
		castello.aggiungiFinestre(3);
		castello.creaForma();
	}

}
