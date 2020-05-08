package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void AddProductsInStock(int quantity) {
		this.quantity += quantity;
	}

	public void RemoveProductsInStock(int quantity) {
		if (quantity < this.quantity) {
			this.quantity -= quantity;
		} else {
			System.out.println("Não foi possível fazer a operação");
		}
	}

	public String toString() {
		return  name + ", $ " + 
				String.format("%.2f", price) + ", " + 
				quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
