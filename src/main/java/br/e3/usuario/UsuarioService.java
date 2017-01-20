package br.e3.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.e3.util.GenericService;
import br.e3.util.ServicePath;

@RestController
@RequestMapping(path = ServicePath.USUARIO_PATH)
public class UsuarioService extends GenericService<UsuarioEntity, Long>{

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UsuarioEntity insert(@RequestBody UsuarioEntity user) {
		user.setPassword(this.passwordEncoder.encode(user.getPassword()));

		return super.insert(user);
	}

	@Override
	public void update(@RequestBody UsuarioEntity user) {
		user.setPassword(this.passwordEncoder.encode(user.getPassword()));

		super.update(user);
	}

}
