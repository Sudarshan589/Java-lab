abstract class LibraryItem {
    String title;
    String itemId;
    boolean issued;

    LibraryItem() {
        this("Unknown", "0000");
    }

    LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
        this.issued = false;
    }

    abstract void issue();

    abstract void returnItem();

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemId);
        System.out.println("Issued: " + issued);
    }
}

class Book extends LibraryItem {
    String author;

    Book() {
        this("Java Basics", "B101", "James Gosling");
    }

    Book(String title, String itemId, String author) {
        super(title, itemId);
        this.author = author;
    }

    @Override
    void issue() {
        if (!issued) {
            issued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    @Override
    void returnItem() {
        if (issued) {
            issued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    void displayBook() {
        display();
        System.out.println("Author: " + author);
    }
}

class Magazine extends LibraryItem {
    int issueNumber;

    Magazine() {
        this("Tech Monthly", "M201", 12);
    }

    Magazine(String title, String itemId, int issueNumber) {
        super(title, itemId);
        this.issueNumber = issueNumber;
    }

    @Override
    void issue() {
        if (!issued) {
            issued = true;
            System.out.println("Magazine issued successfully.");
        } else {
            System.out.println("Magazine is already issued.");
        }
    }

    @Override
    void returnItem() {
        if (issued) {
            issued = false;
            System.out.println("Magazine returned successfully.");
        } else {
            System.out.println("Magazine was not issued.");
        }
    }

    void displayMagazine() {
        display();
        System.out.println("Issue Number: " + issueNumber);
    }
}

public class LibraryItemDemo {
    public static void main(String[] args) {
        Book book = new Book();
        Magazine magazine = new Magazine();

        book.displayBook();
        book.issue();
        book.returnItem();

        System.out.println();

        magazine.displayMagazine();
        magazine.issue();
        magazine.returnItem();
    }
}