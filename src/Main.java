public class Main {
    public static void main(String[] args) {
        Author sandi = new Author("Sandi", "Metz");

        sandi.addBook("Practical Object-Oriented Design in Ruby");
        sandi.addBook("99 Bottles of OOP");
        sandi.sortName();
        sandi.fullName();


        for (String book: sandi.publishedBooks()) {
            System.out.println(book);
        }
    }
}
