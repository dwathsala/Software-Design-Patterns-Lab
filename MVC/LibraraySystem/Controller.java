class LibraryController {
    private Book model;
    private LibraryView view;

    public LibraryController(Book model, LibraryView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayBookDetails(
            model.getTitle(), model.getAuthor(), model.getBookId()
        );
    }

    public void setBookTitle(String title) {
        model.setTitle(title);
    }

    public void setBookAuthor(String author) {
        model.setAuthor(author);
    }
}