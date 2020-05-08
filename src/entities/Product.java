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
			System.out.println("N�o foi poss�vel fazer a opera��o");
		}
	}

	public String toString() {
		return  name + ", $ " + 
				String.format("%.2f", price) + ", " + 
				quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
