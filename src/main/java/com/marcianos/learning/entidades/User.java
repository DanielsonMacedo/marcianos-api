package com.marcianos.learning.entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

//@RequiredArgsConstruct
@Data
@Builder
@AllArgsConstructor
public class User {

    private String name;
    private String email;

}
