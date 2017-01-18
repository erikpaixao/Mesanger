package br.e3.modificador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.e3.util.GenericService;
import br.e3.util.ServicePath;

@RestController
@RequestMapping(path = ServicePath.MODIFICADOR_PATH)
public class ModificadorService extends GenericService<ModificadorEntity, Long> {

}
