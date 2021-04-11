package com.demotdd;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


@RequiredArgsConstructor
@Getter
@EqualsAndHashCode(of = "name")
@ToString

@AllArgsConstructor
@Entity
public class Car implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String type;


}



