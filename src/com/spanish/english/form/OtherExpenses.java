package com.spanish.english.form;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OtherExpenses")
public class OtherExpenses implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9191646398971077642L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@ManyToOne
	private Admin admin;

	@ManyToOne
	private Establishment establishment;

	@ManyToOne
	private Operator operator;

	@Column(name = "admin_value")
	private Double adminValue;

	@Column(name = "establishment_value")
	private Double establishmentValue;

	@Column(name = "operator_value")
	private Double operatorValue;

	public OtherExpenses() {

	}

	public OtherExpenses(Admin admin, Operator operator,
			Establishment establishment, Double adminValue,
			Double operatorValue, Double establishmentValue) {
		if (admin != null)
			this.admin = admin;
		if (operator != null)
			this.operator = operator;
		if (establishment != null)
			this.establishment = establishment;

		this.operatorValue = operatorValue;
		this.adminValue = adminValue;
		this.establishmentValue = establishmentValue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Establishment getEstablishment() {
		return establishment;
	}

	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public Double getAdminValue() {
		return adminValue;
	}

	public void setAdminValue(Double adminValue) {
		this.adminValue = adminValue;
	}

	public Double getEstablishmentValue() {
		return establishmentValue;
	}

	public void setEstablishmentValue(Double establishmentValue) {
		this.establishmentValue = establishmentValue;
	}

	public Double getOperatorValue() {
		return operatorValue;
	}

	public void setOperatorValue(Double operatorValue) {
		this.operatorValue = operatorValue;
	}

}
