package br.com.pojos.suporte;
// Generated 09/06/2016 19:01:50 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * SxmlUsuario generated by hbm2java
 */
@Entity
@Table(name = "SXML_USUARIO",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class SxmlUsuario implements java.io.Serializable {

	private int idUsuario;
	private Prestador prestador;
	private String email;
	private String senha;
	private String grupo;
	private String token;
	private Date expiracao;
	private Date timestamp;
	private Date dthrUltimaTentativa;
	private Short tentativas;
	private Date dthrTrocaSenha;

	public SxmlUsuario() {
	}

	public SxmlUsuario(int idUsuario, Prestador prestador, String email, String senha, String grupo, Date timestamp) {
		this.idUsuario = idUsuario;
		this.prestador = prestador;
		this.email = email;
		this.senha = senha;
		this.grupo = grupo;
		this.timestamp = timestamp;
	}

	public SxmlUsuario(int idUsuario, Prestador prestador, String email, String senha, String grupo, String token,
			Date expiracao, Date timestamp, Date dthrUltimaTentativa, Short tentativas, Date dthrTrocaSenha) {
		this.idUsuario = idUsuario;
		this.prestador = prestador;
		this.email = email;
		this.senha = senha;
		this.grupo = grupo;
		this.token = token;
		this.expiracao = expiracao;
		this.timestamp = timestamp;
		this.dthrUltimaTentativa = dthrUltimaTentativa;
		this.tentativas = tentativas;
		this.dthrTrocaSenha = dthrTrocaSenha;
	}

	@Id

	@Column(name = "id_usuario", unique = true, nullable = false)
	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_prestador", nullable = false)
	public Prestador getPrestador() {
		return this.prestador;
	}

	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}

	@Column(name = "email", unique = true, nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "senha", nullable = false, length = 100)
	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Column(name = "grupo", nullable = false, length = 10)
	public String getGrupo() {
		return this.grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Column(name = "token", length = 100)
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expiracao", length = 23)
	public Date getExpiracao() {
		return this.expiracao;
	}

	public void setExpiracao(Date expiracao) {
		this.expiracao = expiracao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestamp", nullable = false, length = 23)
	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dthr_ultima_tentativa", length = 23)
	public Date getDthrUltimaTentativa() {
		return this.dthrUltimaTentativa;
	}

	public void setDthrUltimaTentativa(Date dthrUltimaTentativa) {
		this.dthrUltimaTentativa = dthrUltimaTentativa;
	}

	@Column(name = "tentativas")
	public Short getTentativas() {
		return this.tentativas;
	}

	public void setTentativas(Short tentativas) {
		this.tentativas = tentativas;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dthr_troca_senha", length = 23)
	public Date getDthrTrocaSenha() {
		return this.dthrTrocaSenha;
	}

	public void setDthrTrocaSenha(Date dthrTrocaSenha) {
		this.dthrTrocaSenha = dthrTrocaSenha;
	}

}
