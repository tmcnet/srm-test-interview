package com.srmasset.investorRisk.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Client Entity.
 * It is an abstraction of a Client.
 * 
 * @author Thiago Melo (falecom@thiagomelo.com.br)
 *
 */
@Entity
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String name;
	
	private Double creditLimit;

	private String risk;
	
	private Integer interestRate;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getRisk() {
		return risk;
	}

	public void setRisk(String risk) {
		this.risk = risk;
	}

	public Integer getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Integer interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creditLimit == null) ? 0 : creditLimit.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((interestRate == null) ? 0 : interestRate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((risk == null) ? 0 : risk.hashCode());
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
		Client other = (Client) obj;
		if (creditLimit == null) {
			if (other.creditLimit != null)
				return false;
		} else if (!creditLimit.equals(other.creditLimit))
			return false;
		if (id != other.id)
			return false;
		if (interestRate == null) {
			if (other.interestRate != null)
				return false;
		} else if (!interestRate.equals(other.interestRate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (risk == null) {
			if (other.risk != null)
				return false;
		} else if (!risk.equals(other.risk))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClientRisk [id=" + id + ", name=" + name + ", creditLimit=" + creditLimit + ", risk=" + risk
				+ ", interestRate=" + interestRate + "]";
	}
}
