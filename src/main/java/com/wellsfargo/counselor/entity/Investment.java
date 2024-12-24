package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long investmentId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double amount;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    protected Investment() {
    }

    public Investment(String name, double amount, Portfolio portfolio) {
        this.name = name;
        this.amount = amount;
        this.portfolio = portfolio;
    }

    public long getInvestmentId() { return investmentId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getAmount() { return amount; }

    public void setAmount(double amount) { this.amount = amount; }

    public Portfolio getPortfolio() { return portfolio; }

    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}
