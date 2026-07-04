package Encapsulation;// Constructor zəncirləməsi ilə kitab sinfi

public class Book {

    public static class BookInfo{
        String title;
        String author;
        double price;

        public BookInfo() {
            this("Naməlum","Naməlum",0.0);
        }

        public BookInfo(String title){
            this(title,"Naməlum",0.0);
        }

        public BookInfo(String title, String author, double price) {
            this.title=title;
            this.author=author;
            this.price=price;
        }

        public void displayInfo(){
            System.out.println("Kitab: " + title + ",   Yazıçı: " + author + ",   Qiymət: " + price + " AZN");
        }
    }
    public static void main(String[] args) {
        BookInfo book1 = new BookInfo();
        BookInfo book2 = new BookInfo("Sabahattin Ali");
        BookInfo book3 = new BookInfo("Stefan Zweig","Chess",9.80);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
