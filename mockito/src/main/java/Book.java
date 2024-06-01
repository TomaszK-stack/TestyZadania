class Book {
    private String title;
    private Person author;

    public Book(String title, Person author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Person getAuthor() {
        return author;
    }
}