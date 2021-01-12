package it.test.casadiscograficajpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cd")
public class Cd {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long idCd;
	@Column(name = "titolo")
	private String titolo;
	@Column(name = "genere")
	private String genere;
	@Column(name = "tracce")
	private int tracce;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "autore_id")
	private Autore autore;
	
	public Cd() {

	}


	public Cd(String titolo, String genere, int tracce) {
		super();
		this.titolo = titolo;
		this.genere = genere;
		this.tracce = tracce;
	}



	public Long getIdCd() {
		return idCd;
	}

	public void setIdCd(Long idCd) {
		this.idCd = idCd;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getTracce() {
		return tracce;
	}

	public void setTracce(int tracce) {
		this.tracce = tracce;
	}

	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}
	
	@Override
	public String toString() {
		return "CD [id=" + idCd + ", titolo=" + titolo + ", genere=" + genere + ", tracce=" + tracce + ", autore="
				+ autore + "]";
	}
	
}
