import java.util.Scanner;

public class Car {
	// Attributes
		private int id = 0, price = 0;
		private String name = null, color = null;
		
		// constructor setting values default
		public Car(int id, int price, String name, String color) {
			this.id = id;
			this.price = price;
			this.name = name;
			this.color = color;
		}
		
		// method getter
		public int getID() {
			return id;
		}
		public int getPrice() {
			return price;
		}
		public String getName() {
			return name;
		}
		public String getColor() {
			return color;
		}
		
		// method setter
		public void setID(int id) {
			this.id = id;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		
		// phuong thuc add car
		public Car addCar() {
			Car newCar = new Car(0, 0, null, null);
			Scanner scan = new Scanner(System.in);
			newCar.id = scan.nextInt();
			newCar.price = scan.nextInt();
			newCar.name = scan.next();
			newCar.color = scan.next();
			return newCar;
		}
		
		// sap xep tim kiem car - theo cach quicksort
		private void swap(Car arr, Car arr2) {
			Car newCar = new Car(0, 0, null, null);
			newCar = arr;
			arr = arr2; 
			arr2 = newCar;
		}
		public void sortCarr(Car [] arr, int left, int right) {
		    int i, j;
		    Car x;
		    if(left >= right) return;
		    x = arr[(left+right)/2];
		    i = left; j = right;
		    while(i <= j) {
		        while(arr[i].price < x.price) i++;
		        while(arr[j].price > x.price) j--;
		            if(i <= j)
		            {
		            	swap(arr[i], arr[j]);
		                i++;    j--;
		            }
		    }
		    sortCarr(arr, left, j);
		    sortCarr(arr, i, right);
		}
}
