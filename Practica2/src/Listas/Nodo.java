package Listas;

public class Nodo {
private int dato;
private Nodo Siguiente;

public Nodo(){
	dato = 0;
	Siguiente = null;
	
}

public void SiguienteNodo(Nodo Parametro){
	Siguiente = Parametro;
}

public void ObtenerParametro(int temp){
	dato = temp;
}
public void Visualizar(){
	System.out.println(dato);
}
public Nodo getNodo(){
	return Siguiente;
}
}
