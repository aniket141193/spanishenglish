package com.spanish.english.form;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "EstablishmentCollection")
@Proxy(lazy = false)
public class EstablishmentCollection implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7371584615766414815L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "collectionDate")
	private Date collectionDate;

	private Double playersGift;

	private Double otherExpenses;

	private Double establishmentShare;

	private Double operatorShare;

	private Double adminShare;

	@ManyToOne
	private Establishment establishment;

	@ManyToOne
	private Operator operator;

	@ManyToOne
	private Admin admin;

	@OneToMany(targetEntity = MachineCollectionNew.class, mappedBy = "establishmentCollection")
	private Set<MachineCollectionNew> machineCollectionNew;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCollectionDate() {
		return collectionDate;
	}

	public void setCollectionDate(Date collectionDate) {
		this.collectionDate = collectionDate;
	}

	public Double getPlayersGift() {
		return playersGift;
	}

	public void setPlayersGift(Double playersGift) {
		this.playersGift = playersGift;
	}

	public Double getOtherExpenses() {
		return otherExpenses;
	}

	public void setOtherExpenses(Double otherExpenses) {
		this.otherExpenses = otherExpenses;
	}

	public Double getEstablishmentShare() {
		return establishmentShare;
	}

	public void setEstablishmentShare(Double establishmentShare) {
		this.establishmentShare = establishmentShare;
	}

	public Double getOperatorShare() {
		return operatorShare;
	}

	public void setOperatorShare(Double operatorShare) {
		this.operatorShare = operatorShare;
	}

	public Double getAdminShare() {
		return adminShare;
	}

	public void setAdminShare(Double adminShare) {
		this.adminShare = adminShare;
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

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Set<MachineCollectionNew> getMachineCollectionNew() {
		return machineCollectionNew;
	}

	public void setMachineCollectionNew(
			Set<MachineCollectionNew> machineCollectionNew) {
		this.machineCollectionNew = machineCollectionNew;
	}

}
