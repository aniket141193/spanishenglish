package com.spanish.english.form;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "InputMoneyBillValidator")
@Proxy(lazy=false)
public class InputMoneyBillValidator implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3970615080444209855L;
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@ManyToOne
	private Coins coins;
	
	@ManyToOne
	private Notes notes;
	
	@ManyToOne
	private Tokens tokens;
	
	@ManyToOne
	private Bills bills;
	
	@ManyToOne
	private BillValidatorType billValidatorType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Coins getCoins() {
		return coins;
	}

	public void setCoins(Coins coins) {
		this.coins = coins;
	}

	public Notes getNotes() {
		return notes;
	}

	public void setNotes(Notes notes) {
		this.notes = notes;
	}

	public Tokens getTokens() {
		return tokens;
	}

	public void setTokens(Tokens tokens) {
		this.tokens = tokens;
	}

	public Bills getBills() {
		return bills;
	}

	public void setBills(Bills bills) {
		this.bills = bills;
	}

	public BillValidatorType getBillValidatorType() {
		return billValidatorType;
	}

	public void setBillValidatorType(BillValidatorType billValidatorType) {
		this.billValidatorType = billValidatorType;
	}
}
