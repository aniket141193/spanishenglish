package com.spanish.english.form;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

//this collection will calculate collection using counters

@Entity
@Table(name = "MachineCollectionNew")
@Proxy(lazy = false)
public class MachineCollectionNew implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1681894698518681511L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "startDate")
	private Date startDate;

	@Column(name = "endDate")
	private Date endDate;

	private Long inputCounterCurrent;

	// get from machine
	private Long inputCounterLast;

	private Long outputCounterCurrent;

	private Long outputCounterLast;

	private Double theoreticalCollection;

	private Double realCollection;

	private Double fails;

	private Double netTotal;

	private Double diffInCash;

	private Double diffInPercentage;

	@ManyToOne
	private Machine machine;

	@ManyToOne
	private EstablishmentCollection establishmentCollection;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getInputCounterCurrent() {
		return inputCounterCurrent;
	}

	public void setInputCounterCurrent(Long inputCounterCurrent) {
		this.inputCounterCurrent = inputCounterCurrent;
	}

	public Long getInputCounterLast() {
		return inputCounterLast;
	}

	public void setInputCounterLast(Long inputCounterLast) {
		this.inputCounterLast = inputCounterLast;
	}

	public Long getOutputCounterCurrent() {
		return outputCounterCurrent;
	}

	public void setOutputCounterCurrent(Long outputCounterCurrent) {
		this.outputCounterCurrent = outputCounterCurrent;
	}

	public Long getOutputCounterLast() {
		return outputCounterLast;
	}

	public void setOutputCounterLast(Long outputCounterLast) {
		this.outputCounterLast = outputCounterLast;
	}

	public Double getTheoreticalCollection() {
		return theoreticalCollection;
	}

	public void setTheoreticalCollection(Double theoreticalCollection) {
		this.theoreticalCollection = theoreticalCollection;
	}

	public Double getRealCollection() {
		return realCollection;
	}

	public void setRealCollection(Double realCollection) {
		this.realCollection = realCollection;
	}

	public Double getFails() {
		return fails;
	}

	public void setFails(Double fails) {
		this.fails = fails;
	}

	public Double getNetTotal() {
		return netTotal;
	}

	public void setNetTotal(Double netTotal) {
		this.netTotal = netTotal;
	}

	public Double getDiffInCash() {
		return diffInCash;
	}

	public void setDiffInCash(Double diffInCash) {
		this.diffInCash = diffInCash;
	}

	public Double getDiffInPercentage() {
		return diffInPercentage;
	}

	public void setDiffInPercentage(Double diffInPercentage) {
		this.diffInPercentage = diffInPercentage;
	}

	public Machine getMachine() {
		return machine;
	}

	public void setMachine(Machine machine) {
		this.machine = machine;
	}

	public EstablishmentCollection getEstablishmentCollection() {
		return establishmentCollection;
	}

	public void setEstablishmentCollection(
			EstablishmentCollection establishmentCollection) {
		this.establishmentCollection = establishmentCollection;
	}

}
