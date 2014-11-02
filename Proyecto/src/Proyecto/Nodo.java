package Proyecto;


public class Nodo {
	private Nodo siguiente;
	private Nodo anterior;
	private Integer dias;
	private Integer Precio;
	private String nombre;
	private String Estado;
	private String Tipo;
	
	public Nodo(String Nombre, Integer dia, Integer precio, String estado, String tipo, Nodo ant,Nodo sig){
		siguiente = sig;
		anterior = ant;
		nombre = Nombre;
		dias = dia;
		Estado = estado;
		Tipo = tipo;
		Precio = precio;
	}
	
	public Nodo getSiguiente(){
		return siguiente;
	}
	
	public void setSiguiente(Nodo siguiente){
		this.siguiente = siguiente;
	}
	
	public Nodo getAnterior(){
		return anterior;
	}
	
	public void setAnterior(Nodo anterior){
		this.anterior = anterior;
	}
	
	public String getDato(){
		return nombre;
	}
	public Integer getPrecio(){
		return Precio;
	}
	
	public void setNombre(String Nombre){
		this.nombre = Nombre;
	}
	public void setFecha(Integer dia){
		this.dias = dia;
	}
	public void setEstado(String estado){
		this.Estado = estado;
	}
	public void setTipo(String tipo){
		this.Tipo = tipo;
	}
	public void setPrecio(Integer precio){
		this.Precio = precio;
	}
}
