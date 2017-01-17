package br.e3.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.e3.beans.Mesada;
import br.e3.util.GenericService;
import br.e3.util.ServicePath;

@RestController
@RequestMapping(path = ServicePath.MESADA_PATH)
public class MesadaService extends GenericService<Mesada, Long>{

}
