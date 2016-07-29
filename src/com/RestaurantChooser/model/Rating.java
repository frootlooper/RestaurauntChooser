package com.RestaurantChooser.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="ratings")
public class Rating {
    private String id;
    private int rating;
    private String restaurantId;
    private String userId;

    @Override
    public boolean equals(Object o) {
        return id.equals(((Rating)o).getId());
    }

    @Override
    public String toString() {
        return "Rating = {id: "+id+", rating: "+rating+", restaurantId: "+restaurantId+", userId: "+userId+"}";
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
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