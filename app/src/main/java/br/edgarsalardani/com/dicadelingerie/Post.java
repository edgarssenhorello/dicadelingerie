package br.edgarsalardani.com.dicadelingerie;


public class Post {

    private String Titulo;
    private String Category ;
    private String Description ;
    private int Thumbnail ;

    public Post() {
    }


    public Post(String title, String category, String description, int thumbnail) {
        Titulo = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
    }


    public String getTitle() {
        return Titulo;
    }
    public String getCategory() {
        return Category;
    }
    public String getDescription() { return Description; }
    public int getThumbnail() {
        return Thumbnail;
    }
    public void setTitle(String title) {
        Titulo = title;
    }
    public void setCategory(String category) {
        Category = category;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
