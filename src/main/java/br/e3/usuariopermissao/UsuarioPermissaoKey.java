package br.e3.usuariopermissao;


import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.e3.util.BaseKey;

@Embeddable
public class UsuarioPermissaoKey extends BaseKey {

	private static final long serialVersionUID = 201602010536L;

	@Column(name = "permission_id", length = 11, nullable = false)
	private Long permissionId;

	@Column(name = "user_id", length = 11, nullable = false)
	private Long userId;

	public UsuarioPermissaoKey() {
		super();
	}

	public UsuarioPermissaoKey(Long permissionId, Long userId) {
		super();
		this.permissionId = permissionId;
		this.userId = userId;
	}

	public Long getPermissionId() {
		return this.permissionId;
	}

	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((this.permissionId == null) ? 0 : this.permissionId.hashCode());
		result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!super.equals(obj)) {
			return false;
		}

		if (this.getClass() != obj.getClass()) {
			return false;
		}

		UsuarioPermissaoKey other = (UsuarioPermissaoKey) obj;

		if (this.permissionId == null) {
			if (other.permissionId != null) {
				return false;
			}
		} else if (!this.permissionId.equals(other.permissionId)) {
			return false;
		}

		if (this.userId == null) {
			if (other.userId != null) {
				return false;
			}
		} else if (!this.userId.equals(other.userId)) {
			return false;
		}

		return true;
	}

}
