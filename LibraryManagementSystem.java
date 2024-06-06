public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Add some books
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890"));
        library.addBook(new Book("1984", "George Orwell", "0987654321"));

        // Add some members
        library.addMember(new Member("Alice", "M001"));
        library.addMember(new Member("Bob", "M002"));

        // List books and members
        System.out.println("Books available in the library:");
        library.listBooks();

        System.out.println("\nMembers of the library:");
        library.listMembers();

        // Borrow and return books
        library.borrowBook("1234567890", "M001");
        library.borrowBook("1234567890", "M002");

        System.out.println("\nBooks available in the library after borrowing:");
        library.listBooks();

        library.returnBook("1234567890");

        System.out.println("\nBooks available in the library after returning:");
        library.listBooks();
    }
}
