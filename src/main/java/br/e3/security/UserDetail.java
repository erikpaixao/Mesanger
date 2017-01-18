package br.e3.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import br.e3.permissao.PermissaoEntity;
import br.e3.usuario.UsuarioEntity;
import br.e3.usuario.UsuarioRepository;


@Component
public class UserDetail implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UsuarioEntity usuario = this.usuarioRepository.findByEmail(email);

		if (usuario == null) {
			throw new UsernameNotFoundException("Usuario with email \"" + email + "\" was not found");
		}

		LoginDetailBean login = new LoginDetailBean(usuario.getNome(), usuario.getEmail(), usuario.getPassword());

		
		for (PermissaoEntity permission : usuario.getPermissoes()) {
			login.addRole(permission.getRole());
		}

		return login;
	}

}
