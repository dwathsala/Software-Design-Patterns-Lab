class Book{
    private String title;
    private String author;
    private int bookId;

    public Book(String title, String author, int bookId){
        this.title = title;
        this.author = author;
        this.bookId = bookId;
    }

    //Getter
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getBookId(){
        return bookId;
    }



    //Setter
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }
}