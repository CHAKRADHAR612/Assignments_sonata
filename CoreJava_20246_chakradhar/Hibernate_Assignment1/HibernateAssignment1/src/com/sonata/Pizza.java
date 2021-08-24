package com.sonata;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pizza {
	@Id
	private int pizzaId;
	private String pizzaName;
	public int getPizzaId() {
		return pizzaId;
	}
	public void setPizzaId(int pizzaId) {
		this.pizzaId = pizzaId;
	}
	public String getPizzaName() {
		return pizzaName;
	}
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
}
