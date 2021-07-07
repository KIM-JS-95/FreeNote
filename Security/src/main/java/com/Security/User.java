package com.Security;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idx;

    private String id;
    private String password;

    public User(String id, String password) {
        this.id=id;
        this.password=password;
    }

    public static User createUser(String id, String password){
        return new User(id,password);
    }
}
