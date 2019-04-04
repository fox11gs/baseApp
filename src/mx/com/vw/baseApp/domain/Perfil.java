package mx.com.vw.baseApp.domain;

import java.util.List;

public class Perfil {
	
	private Integer id;
	private String nombrePerfil;
	private List<Permiso> permisos;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombrePerfil() {
		return nombrePerfil;
	}
	public void setNombrePerfil(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}
	public List<Permiso> getPermisos() {
		return permisos;
	}
	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}
}
