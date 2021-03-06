package br.e3.permissao;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.e3.util.GenericService;
import br.e3.util.ServicePath;

@RestController
@RequestMapping(path = ServicePath.PERMISSAO_PATH)
public class PermissaoService extends GenericService<PermissaoEntity, Long> {

}
