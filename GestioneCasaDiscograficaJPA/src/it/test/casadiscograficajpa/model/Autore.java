package it.test.casadiscograficajpa.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "autore")
public class Autore {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long idAutore;
	@Column(name = "nome")
	private String nome;
	@Column(name = "cognome")
	private String cognome;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "casadiscografica_id")
	private CasaDiscografica casaDiscografica;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "autore")
	private Set<Cd> cds = new HashSet<>();
	
	public Autore() {

	}

	public Autore(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}

	public Long getIdAutore() {
		return idAutore;
	}

	public void setIdAutore(Long idAutore) {
		this.idAutore = idAutore;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public CasaDiscografica getCasaDiscografica() {
		return casaDiscografica;
	}

	public void setCasaDiscografica(CasaDiscografica casaDiscografica) {
		this.casaDiscografica = casaDiscografica;
	}

	public Set<Cd> getCds() {
		return cds;
	}

	public void setCds(Set<Cd> cds) {
		this.cds = cds;
	}
	
	@Override
	public String toString() {
		return "Autore [id=" + idAutore + ", nome=" + nome + ", cognome=" + cognome + ", casadiscografica=" + casaDiscografica + "]";
	}
}

	