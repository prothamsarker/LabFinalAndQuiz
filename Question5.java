class Book {
    private int id;
    private String name;
    private double price;

    public Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() { 
        return price; 
    }

    public void show() {
        System.out.println("ID: " + id + " | Name: " + name + " | Price: " + price);
    }
}

public class BookManager {
    public static void main(String[] args) {
        Book[] list = new Book[5];

        list[0] = new Book(101, "Java Basics", 450);
        list[1] = new Book(102, "Advanced Java", 750);
        list[2] = new Book(103, "Data Structures", 600);
        list[3] = new Book(104, "Algorithms", 500);
        list[4] = new Book(105, "Database Systems", 550);

        System.out.println("--- Books priced above 500 ---");
        double totalPrice = 0;

        for (Book b : list) {
            if (b.getPrice() > 500) {
                b.show();
            }
            totalPrice += b.getPrice();
        }

        double avg = totalPrice / list.length;
        System.out.println("\nAverage Price: " + avg);
    }
}
