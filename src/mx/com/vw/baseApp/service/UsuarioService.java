package mx.com.vw.baseApp.service;

import java.util.List;

import mx.com.vw.baseApp.domain.Perfil;
import mx.com.vw.baseApp.domain.Usuario;

public interface UsuarioService {
	
	public Usuario getUsuario(Integer id);
	
	public List<Usuario> getUsuariosByPerfil(Perfil perfil);

}
