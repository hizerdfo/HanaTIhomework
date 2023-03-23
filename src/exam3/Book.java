package exam3;
import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book> {

    private Date publishDate;
    private String comment;
    private String title;

    public Book(Date publishDate, String comment, String title){
        this.publishDate = publishDate;
        this.comment = comment;
        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
           return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return Objects.equals(publishDate, other.publishDate) && Objects.equals(title,other.title);
    }

    @Override
    public int compareTo(Book book){
        return this.publishDate.compareTo(book.publishDate);
    }

    @Override
    public int hashCode(){
        return Objects.hash(title, publishDate);
    }
    //cloneable ...
    @Override
    public Book clone() throws CloneNotSupportedException {
        Book cloned = (Book) super.clone();
        cloned.publishDate = (Date) this.publishDate.clone();
        return cloned;
    }
    //clone mathod
    public Book copy(){
        Book result = new Book(publishDate, comment, title);
        result.publishDate = (Date) this.publishDate.clone();
        result.comment = this.comment;
        result.title = this.title;
        return result;
    }

}
