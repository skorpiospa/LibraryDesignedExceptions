import java.util.Arrays;
import java.util.Objects;

public class Library {

    private String name;
    private Catalogue[] books;
    private Member[] members;
    private Lend [] lends;

    public Library(String name, Catalogue[] books, Member[] members, Lend[] lends) {
        this.name = name;
        this.books = books;
        this.members = members;
        this.lends = lends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Catalogue[] getBooks() {
        return books;
    }

    public void setBooks(Catalogue[] books) {
        this.books = books;
    }

    public Member[] getMembers() {
        return members;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    public Lend[] getLends() {
        return lends;
    }

    public void setLends(Lend[] lends) {
        this.lends = lends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) && Arrays.equals(books, library.books) && Arrays.equals(members, library.members) && Arrays.equals(lends, library.lends);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(books);
        result = 31 * result + Arrays.hashCode(members);
        result = 31 * result + Arrays.hashCode(lends);
        return result;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + Arrays.toString(books) +
                ", members=" + Arrays.toString(members) +
                ", lends=" + Arrays.toString(lends) +
                '}';
    }
}
