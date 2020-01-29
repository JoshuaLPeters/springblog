package com.summonerswar.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String body;

    // ALLOWS HIBERNATE TO CREATE -- NEED EMPTY
    public Post(){
    }

    public Post(long id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }

    // GETTERS
    public long getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getBody(){
        return this.body;
    }

    // SETTERS
    public void setId(Long id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setBody(String body){
        this.body = body;
    }

}
