package ir.maktabsharif.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

    private String name;
    private String author;
    private Double price;

}
