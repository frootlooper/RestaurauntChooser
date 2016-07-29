package com.RestaurantChooser.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Comment left on a restaurant by a user.
 */

@Entity
@Table(name="comments")
public class Comment {
    private String id;
    private String content;
    private String restaurantId;
    private String userId;

    @Override
    public boolean equals(Object o) {
        return id.equals(((Comment)o).getId());
    }

    @Override
    public String toString() {
        return "String = {id: "+id+", content: "+content+", restaurantId: "+restaurantId+", userId: "+userId+"}";
    }

    @Id
    @GeneratedValue(generator="uuid")
    @GenericGenerator(name="uuid", strategy="uuid2")
    @Column(name="id", unique=true)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
