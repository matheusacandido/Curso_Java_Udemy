package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Enter the product name:");
		product.name = sc.nextLine();
		System.out.println("Enter the product price: ");
		product.price = sc.nextDouble();
		System.out.println("Enter the product quantity: ");
		product.quantity = sc.nextInt();

		// System.out.println(product.name + ";" + product.price + ";" +
		// product.quantity);

//		System.out.println("Product data: " + product.toString()); a linha de baixo pode ser escrita dessa forma tbm
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.AddProductsInStock(quantity);
		
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.RemoveProductsInStock(quantity);
		
		System.out.println("Updated data: " + product);
		
		
		
		sc.close();

	}

}
