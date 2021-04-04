package com.ashish.Swagger.model;
public class Author
{
    private long authorId;
    private String authorname;
    public Author()
    {
        System.out.println("--------->>>>Default Constructor<<<<<-------");
    }
    public Author(long id,String name)
    {
        authorId=id;
        authorname=name;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }
}
