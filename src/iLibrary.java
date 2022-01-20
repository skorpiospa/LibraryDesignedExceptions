import Exceptions.BookNotFoundException;
import Exceptions.MemberNotFoundException;

public interface iLibrary {

    public Book getBook (String askIsbn) throws BookNotFoundException;

    public Member getMember (String nif) throws MemberNotFoundException;

    public boolean getBookLend (String nif, String askIsbn) throws BookNotFoundException, MemberNotFoundException;
}
