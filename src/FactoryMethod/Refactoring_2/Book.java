package FactoryMethod.Refactoring_2;

public class Book extends Item{
    private int edition;
    private String publisher = new String();

    public Book() {
    }

    public Book(int id, String title, int edition, String publisher) {
        super(id, title);
        this.edition = edition;
        this.publisher = publisher;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + super.getId() +
                ", title='" + super.getTitle() + '\'' +
                ", edition=" + edition +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
