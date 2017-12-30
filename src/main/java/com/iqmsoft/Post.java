package com.iqmsoft;

import java.io.Serializable;

public class Post implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String postText;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostText() {
        return this.postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", postText='" + postText + '\'' +
                '}';
    }
}
