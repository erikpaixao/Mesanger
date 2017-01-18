package br.e3.usuariopermissao;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.e3.util.BaseEntity;

@Entity
@Table(name = "tb_user_permission")
public class UsuarioPermissaoEntity extends BaseEntity<UsuarioPermissaoKey> {

	private static final long serialVersionUID = 201602010251L;

}