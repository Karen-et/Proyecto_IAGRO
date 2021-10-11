package samples;

import java.time.LocalDate;

@Entity
public class Investigador //extends Usuario
{
	 @Column(lenght=60)
	 private String contrato;
	 @Column(lenght=60)
	 private String profesion;
	 private LocalDate vtoContrato;
	 @OneToMany
     private LinkedList <String> listaTareas;
	 @OneToMany
	 protected LinkedList <Formulario> formulariosInvestigador;
	
	 public String getContrato() {
		return contrato;
	}
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public LocalDate getVtoContrato() {
		return vtoContrato;
	}
	public void setVtoContrato(LocalDate vtoContrato) {
		this.vtoContrato = vtoContrato;
	}
	@Override
	public String toString() {
		return "Investigador [contrato=" + contrato + ", profesion=" + profesion + ", vtoContrato=" + vtoContrato + "]";
	}
	 
}
