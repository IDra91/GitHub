package Listas;

public class Main {

	public static void main(String[] args) {
		Nodo temporal = new Nodo();
		temporal.ObtenerParametro(1);
		temporal.Visualizar();
		
		Nodo segundo = new Nodo();
		segundo.ObtenerParametro(2);
		
		temporal.SiguienteNodo(segundo);
	
		temporal.getNodo().Visualizar();;
	
		Nodo tercero = new Nodo();
		tercero.ObtenerParametro(3);
		
		temporal.getNodo().SiguienteNodo(tercero);
	}

}
