package br.com.pojos.suporte;
// Generated 09/06/2016 19:01:50 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AmbId generated by hbm2java
 */
@Embeddable
public class AmbId implements java.io.Serializable {

	private int idAmb;
	private int idTipoTabela;

	public AmbId() {
	}

	public AmbId(int idAmb, int idTipoTabela) {
		this.idAmb = idAmb;
		this.idTipoTabela = idTipoTabela;
	}

	@Column(name = "id_amb", nullable = false)
	public int getIdAmb() {
		return this.idAmb;
	}

	public void setIdAmb(int idAmb) {
		this.idAmb = idAmb;
	}

	@Column(name = "id_tipo_tabela", nullable = false)
	public int getIdTipoTabela() {
		return this.idTipoTabela;
	}

	public void setIdTipoTabela(int idTipoTabela) {
		this.idTipoTabela = idTipoTabela;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AmbId))
			return false;
		AmbId castOther = (AmbId) other;

		return (this.getIdAmb() == castOther.getIdAmb()) && (this.getIdTipoTabela() == castOther.getIdTipoTabela());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdAmb();
		result = 37 * result + this.getIdTipoTabela();
		return result;
	}

}
