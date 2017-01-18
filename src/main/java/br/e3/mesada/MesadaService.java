package br.e3.mesada;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.e3.util.GenericService;
import br.e3.util.ServicePath;

@RestController
@RequestMapping(path = ServicePath.MESADA_PATH)
public class MesadaService extends GenericService<MesadaEntity, Long>{

}
