package br.com.blockone;

public class TestInvoiceItem {
	public static void main(String[] args) {
		InvoiceItem ii1 = new InvoiceItem("1", "Sandal", 3, 5.86);
		System.out.println("Total value " + ii1.getTotal());
		
		InvoiceItem ii2 = new InvoiceItem("2", "Water Bottle", 5, 3.55);
		System.out.println("Total value " + ii2.getTotal());
	}
}