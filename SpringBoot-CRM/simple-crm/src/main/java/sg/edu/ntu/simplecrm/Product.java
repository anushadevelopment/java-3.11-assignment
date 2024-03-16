package sg.edu.ntu.simplecrm;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
    //@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private final String id;
    private String name;
    private String description;
    private double price;

    
    
    public Product() {
        this.id = UUID.randomUUID().toString(); 
    }

    // public String getId() {
    //     return id;
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public String getDescription() {
    //     return description;
    // }

    // public void setDescription(String description) {
    //     this.description = description;
    // }

    // public double getPrice() {
    //     return price;
    // }

    // public void setPrice(double price) {
    //     this.price = price;
    // }

    
}
