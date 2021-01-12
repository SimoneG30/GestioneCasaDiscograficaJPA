package it.test.casadiscograficajpa.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "casadiscografica")
public class CasaDiscografica {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private Long idCasaDiscografica;
		@Column(name = "ragionesociale")
		private String ragioneSociale;
		@Column(name = "partitaiva")		
		private String partitaIva;
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "autore")
		private Set<Autore> autori = new HashSet<>();
		
		public CasaDiscografica() {
			
		}

		public CasaDiscografica(String ragioneSociale, String partitaIva) {
			super();
			this.ragioneSociale = ragioneSociale;
			this.partitaIva = partitaIva;
		}
		
		public Long getIdCasaDiscografica() {
			return idCasaDiscografica;
		}

		public void setIdCasaDiscografica(Long idCasaDiscografica) {
			this.idCasaDiscografica = idCasaDiscografica;
		}

		public String getRagioneSociale() {
			return ragioneSociale;
		}

		public void setRagioneSociale(String ragioneSociale) {
			this.ragioneSociale = ragioneSociale;
		}

		public String getPartitaIva() {
			return partitaIva;
		}

		public void setPartitaIva(String partitaIva) {
			this.partitaIva = partitaIva;
		}

		public Set<Autore> getListaAutori() {
			return autori;
		}

		public void setListaAutori(Set<Autore> autori) {
			this.autori = autori;
		}

		@Override
		public String toString() {
			return "CasaDiscografica [idcasadiscografica=" + idCasaDiscografica + ", ragionesociale=" + ragioneSociale + ", partitaiva=" + partitaIva + "]";
		}
	}
