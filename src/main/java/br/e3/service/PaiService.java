package br.e3.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.e3.beans.Pai;
import br.e3.util.GenericService;
import br.e3.util.ServicePath;

@RestController
@RequestMapping(path = ServicePath.PAI_PATH)
public class PaiService extends GenericService<Pai, Long>{

}
