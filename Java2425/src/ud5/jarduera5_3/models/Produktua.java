package ud5.jarduera5_3.models;

public class Produktua {
	
	// ATRIBUTTES //
	
	private int id;
	private String nombre;
	private String proveedor;
	private float precio;
	private int existencias;
	
	
	
	// CONSTRUCTORS //
	
	public Produktua() {
		
	}
	
	public Produktua(int id, String nombre, String proveedor, float precio, int existencias) {
		
		this.id = id;
		this.nombre = nombre;
		this.proveedor = proveedor;
		this.precio = precio;
		this.existencias = existencias;
		
	}

	
	
	// GETTERS //
	
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getProveedor() {
		return proveedor;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public int getExistencias() {
		return existencias;
	}
	
	
	
	// SETTERS //
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}

	
	
	// TO STRING //
	
	@Override
	public String toString() {
		return "Produktua [id=" + id + ", nombre=" + nombre + ", proveedor=" + proveedor + ", precio=" + precio
				+ ", existencias=" + existencias + "]";
	}
	
	
	
}
