import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public Book findBookByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    public Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    public void borrowBook(String ISBN, String memberId) {
        Book book = findBookByISBN(ISBN);
        if (book != null && !book.isBorrowed()) {
            book.borrowBook();
            System.out.println(memberId + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    public void returnBook(String ISBN) {
        Book book = findBookByISBN(ISBN);
        if (book != null && book.isBorrowed()) {
            book.returnBook();
            System.out.println(book.getTitle() + " has been returned.");
        } else {
            System.out.println("Book is not borrowed or does not exist.");
        }
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void listMembers() {
        for (Member member : members) {
            System.out.println(member);
        }
    }
}
