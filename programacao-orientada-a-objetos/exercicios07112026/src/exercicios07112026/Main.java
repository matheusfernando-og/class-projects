package exercicios07112026;

public class Main {

	public static void linebreak() {
		System.out.println("");
	}
	public static void main(String[] args) {
		UnidadeResgate ambulancia1 = new Ambulancia("Ambulância 1");
		UnidadeResgate drone1 = new DroneResgate("Drone 1", "Quadrante D3");
		UnidadeResgate[] unidades = {ambulancia1, drone1};
		
		for (int i = 0; i < unidades.length; i++) {
			unidades[i].atenderChamado("Quadrante A5");
		}
		
		linebreak();
		
		Rastreavel drone2 = new DroneResgate("Drone 2", "Quadrante C7");
		
		System.out.println(drone2.informarLocalizacao());
		
		linebreak();
		
		Rastreavel sinal1 = new SinalizadorPortatil("Quadrante G9");
		
		Rastreavel[] unidadesRast = {drone2, sinal1};
		
		for (int i = 0; i < unidadesRast.length; i++) {
			System.out.println(unidadesRast[i].informarLocalizacao());
		}
		
	}
}
