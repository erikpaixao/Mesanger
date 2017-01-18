package br.e3.usuario;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.e3.util.GenericService;
import br.e3.util.ServicePath;

@RestController
@RequestMapping(path = ServicePath.USUARIO_PATH)
public class UsuarioService extends GenericService<UsuarioEntity, Long>{

}
