package com.RestaurantChooser.model;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 * A tag is a label added to a restaurant by a user to aid in future searches.
 */

@Entity
@Table(name="tags")
public class Tag {
    private String id;
    private String content;
    private String restaurantId;
    private String userId;

    @Override
    public boolean equals(Object o) {
        return (this.id.equals(((Tag)o).getId()));
    }

    @Override
    public String toString() {
        return "Tag = {id: "+id+", content: "+content+", restaurantId: "+restaurantId+", userId: "+userId+"}";
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
