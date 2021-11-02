package ss12.java_collection.bai_tap;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ProductManager {
	private static List<Product> productList;
	Scanner sc = new Scanner(System.in);
    static {
        productList = new ArrayList<>();
    }
    
    public void add() {
    	Product p1 = new Product(1, "Giay", 230000);
        Product p2 = new Product(2, "Ao", 220000);
        Product p3 = new Product(3, "Quan", 210000);
        Product p4 = new Product(4, "Giay", 200000);
        Product p5 = new Product(5, "Sach", 210000);
        Product p6 = new Product(6, "Vo", 190000);
        
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        productList.add(p6);
    }
    
    public boolean edit(Product pro) {
    	for(Product proItem : productList) {
    		if(proItem.getId() == pro.getId()) {
    			proItem.setNameProduct(pro.getNameProduct());
    			proItem.setPrice(pro.getPrice());
    			return true;
    		}
    	}
    	return false;
    }
    
    public boolean delete (Product pro) {
    	return productList.remove(pro);
    }
    
    public void printList() {
    	for(Product product : productList) {
    		System.out.println(product.toString());
    	}
    }
    
    public List<Product> searchByName(String namePro) {
        List<Product> list = new ArrayList<>();
        for (Product product: productList) {
            if (product.getNameProduct().contains(namePro)) {
                list.add(product);
            }
        }

        return list;
    }
    
    public void sort() {
    	Collections.sort(productList, new SortProductByPrice());
    	for(Product product : productList) {
    		System.out.println(product.toString());
    	}
    }
    
    
}
