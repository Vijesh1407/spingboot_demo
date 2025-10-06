package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "advertisement")
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "heading")
    private String heading;

    @Column(name = "category")
    private String category;

    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;  // Match Thymeleaf variable

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getHeading() { return heading; }
    public void setHeading(String heading) { this.heading = heading; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}
