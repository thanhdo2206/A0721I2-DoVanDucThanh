package ss12.java_collection.bai_tap;

import java.util.Objects;

public class Product {
	private int id;
    private String nameProduct;
    private double price;
	
    public Product() {
    }

    
    public Product(int id) {
		this.id = id;
	}


	public Product(int id, String nameProduct, double price) {
        this.id = id;
        this.nameProduct =nameProduct;
        this.price = price;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "id=" + id + ", nameProduct=" + nameProduct + ", price=" + price ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nameProduct, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id;
				
	}
    
	
    
    
    
}
