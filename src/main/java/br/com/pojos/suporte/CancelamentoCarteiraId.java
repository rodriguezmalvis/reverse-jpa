package br.com.pojos.suporte;
// Generated 09/06/2016 19:01:50 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CancelamentoCarteiraId generated by hbm2java
 */
@Embeddable
public class CancelamentoCarteiraId implements java.io.Serializable {

	private long numeroCarteira;
	private byte dv;

	public CancelamentoCarteiraId() {
	}

	public CancelamentoCarteiraId(long numeroCarteira, byte dv) {
		this.numeroCarteira = numeroCarteira;
		this.dv = dv;
	}

	@Column(name = "numero_carteira", nullable = false, precision = 17, scale = 0)
	public long getNumeroCarteira() {
		return this.numeroCarteira;
	}

	public void setNumeroCarteira(long numeroCarteira) {
		this.numeroCarteira = numeroCarteira;
	}

	@Column(name = "dv", nullable = false)
	public byte getDv() {
		return this.dv;
	}

	public void setDv(byte dv) {
		this.dv = dv;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CancelamentoCarteiraId))
			return false;
		CancelamentoCarteiraId castOther = (CancelamentoCarteiraId) other;

		return (this.getNumeroCarteira() == castOther.getNumeroCarteira()) && (this.getDv() == castOther.getDv());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getNumeroCarteira();
		result = 37 * result + this.getDv();
		return result;
	}

}
