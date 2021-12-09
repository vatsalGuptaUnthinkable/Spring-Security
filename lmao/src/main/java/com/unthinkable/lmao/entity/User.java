package com.unthinkable.lmao.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name = "User_tbl")
public class User {
    @Id
    @SequenceGenerator(
            name ="user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    private long userId;
    private String username;
    private String password;
}
