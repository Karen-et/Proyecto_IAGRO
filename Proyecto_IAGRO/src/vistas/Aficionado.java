package samples;

@Entity
public class Aficionado {

	@Column(lenght=60)
	private String direccion;
	@Column(lenght=60)
    private String celular;
	@OneToMany
    private LinkedList <String> listaTareas;
	@OneToMany
    protected LinkedList <Formulario> formulariosAficionado;
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	@Override
	public String toString() {
		return "Aficionado [direccion=" + direccion + ", celular=" + celular + "]";
	}
}
