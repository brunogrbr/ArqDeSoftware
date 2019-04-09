package br.usjt.hellospringboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Temperatura {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable=false, length=200)
	private String descricao;
	@Column(nullable=false, length=30)
	private int tempMin;
	@Column(nullable=false, length=30)
	private int tempMax;
	@Column(nullable=false, length=30)
	private int humAr;
	@Column(nullable=false, length=200)
	private String diaSemana;
	@Column(nullable=false, length=30)
	private Date data;
	@Column(nullable=false, length=30)
	private int lat;
	@Column(nullable=false, length=30)
	private int lon;
	@OneToMany
	@JoinColumn(name = "cidade_da_temperatura")
	private Cidade cidade;
	
	public Cidade getCidade() {
		return cidade;
	}
	
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	@OneToOne
	@JoinColumn(name = "dia_da_temperatura")
	private DiaDaSemana diaDaSemana;
	
	public DiaDaSemana getDiaDaSemana() {
		return diaDaSemana;
	}
	
	public void setDiaDaSemana(DiaDaSemana diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((diaSemana == null) ? 0 : diaSemana.hashCode());
		result = prime * result + humAr;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + lat;
		result = prime * result + lon;
		result = prime * result + tempMax;
		result = prime * result + tempMin;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temperatura other = (Temperatura) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (diaSemana == null) {
			if (other.diaSemana != null)
				return false;
		} else if (!diaSemana.equals(other.diaSemana))
			return false;
		if (humAr != other.humAr)
			return false;
		if (id != other.id)
			return false;
		if (lat != other.lat)
			return false;
		if (lon != other.lon)
			return false;
		if (tempMax != other.tempMax)
			return false;
		if (tempMin != other.tempMin)
			return false;
		return true;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getTempMin() {
		return tempMin;
	}
	public void setTempMin(int tempMin) {
		this.tempMin = tempMin;
	}
	public int getTempMax() {
		return tempMax;
	}
	public void setTempMax(int tempMax) {
		this.tempMax = tempMax;
	}
	public int getHumAr() {
		return humAr;
	}
	public void setHumAr(int humAr) {
		this.humAr = humAr;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getLat() {
		return lat;
	}
	public void setLat(int lat) {
		this.lat = lat;
	}
	public int getLon() {
		return lon;
	}
	@Override
	public String toString() {
		return "Temperatura [id=" + id + ", descricao=" + descricao + ", tempMin=" + tempMin + ", tempMax=" + tempMax
				+ ", humAr=" + humAr + ", diaSemana=" + diaSemana + ", data=" + data + ", lat=" + lat + ", lon=" + lon
				+ "]";
	}
	public void setLon(int lon) {
		this.lon = lon;
	}

}
