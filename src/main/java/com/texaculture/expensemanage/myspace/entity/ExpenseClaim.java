package com.texaculture.expensemanage.myspace.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExpenseClaim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String claimType;

    private BigDecimal claimAmount;

    private LocalDate dateOfExpense;

    private String claimMonth;

    private Integer claimYear;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClaimType() {
		return claimType;
	}

	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}

	public BigDecimal getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(BigDecimal claimAmount) {
		this.claimAmount = claimAmount;
	}

	public LocalDate getDateOfExpense() {
		return dateOfExpense;
	}

	public void setDateOfExpense(LocalDate dateOfExpense) {
		this.dateOfExpense = dateOfExpense;
	}

	public String getClaimMonth() {
		return claimMonth;
	}

	public void setClaimMonth(String claimMonth) {
		this.claimMonth = claimMonth;
	}

	public Integer getClaimYear() {
		return claimYear;
	}

	public void setClaimYear(Integer claimYear) {
		this.claimYear = claimYear;
	}

	public ExpenseClaim(Long id, String claimType, BigDecimal claimAmount, LocalDate dateOfExpense, String claimMonth,
			Integer claimYear) {
		super();
		this.id = id;
		this.claimType = claimType;
		this.claimAmount = claimAmount;
		this.dateOfExpense = dateOfExpense;
		this.claimMonth = claimMonth;
		this.claimYear = claimYear;
	}

	public ExpenseClaim() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ExpenseClaim [id=" + id + ", claimType=" + claimType + ", claimAmount=" + claimAmount
				+ ", dateOfExpense=" + dateOfExpense + ", claimMonth=" + claimMonth + ", claimYear=" + claimYear + "]";
	}

    // constructors, getters, and setters
    
}
