package ss12.java_collection.bai_tap;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ProductTest {
	static final int add = 1;
	static final int edit = 2;
	static final int delete = 3;
	static final int printList = 4;
	static final int search = 5;
	static final int sort = 6;
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		ProductManager proManager = new ProductManager();
		// menu
		boolean flag = true;
		do {
			System.out.println("\nMenu.");
			System.out.println("1. Thêm sản phẩm");
			System.out.println("2. Sửa thông tin sản phẩm theo id");
			System.out.println("3. Xóa sản phẩm theo id");
			System.out.println("4. Hiển thị sanh sach sản phẩm");
			System.out.println("5. Tìm kiếm sản phẩm theo tên");
			System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
			System.out.println("0. Exit");
			
			System.out.print("Enter your choice: ");
			choice = Integer.parseInt(sc.nextLine());
			System.out.println("-----------------------------------");

			switch (choice) {
			case add: {
				proManager.add();
				System.out.println("Add success");
				break;
			}
			case edit:{
				System.out.print("Id : ");
				int id = Integer.parseInt(sc.nextLine());
				System.out.print("Name product : ");
				String nameProduct = sc.nextLine();
				System.out.print("Price : ");
				double price = Double.parseDouble(sc.nextLine());

				Product product = new Product(id, nameProduct, price);
				
				boolean editOk = proManager.edit(product);
				if(editOk) System.out.println("Edit success");
				else System.out.println("Edit fail");
				break;
			}

			case delete: {
				System.out.print("Enter id product want delete : ");
				int id = Integer.parseInt(sc.nextLine());
				Product product = new Product(id);
				boolean deleteOk = proManager.delete(product);
				if(deleteOk) System.out.println("Delete success");
				else System.out.println("Delete fail");
				break;

			}
			
			case printList: {
				proManager.printList();
				break;
			}

			case search: {
				System.out.print("Enter name product want search : ");
				String namePro = sc.nextLine();
				List<Product> newList =  proManager.searchByName(namePro);
				for(Product product : newList) {
		    		System.out.println(product.toString());
		    	}
				
				break;
			}

			case sort:{
            	proManager.sort();
            	break;
            }

			

			default:
				System.out.println("Exited");
				flag = false;
			}

			System.out.println("-----------------------------------");

		} while (flag);

	}
}
