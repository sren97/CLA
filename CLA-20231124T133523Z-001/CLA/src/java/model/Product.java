/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;
/**
 *
 * @author PC
 */
public class Product {
    private String id;
    private String name;
    private String description;
    private Integer price;
    private String category;

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public Integer getPrice() {return price;}
    public void setPrice(Integer price) {this.price = price;}
    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;} 
}
