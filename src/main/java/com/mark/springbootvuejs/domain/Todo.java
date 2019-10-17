package com.mark.springbootvuejs.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue
    private Long id;
    
    @NonNull
    private String title;
    
    private boolean completed = false;
}
