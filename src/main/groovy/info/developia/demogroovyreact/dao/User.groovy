package info.developia.demogroovyreact.dao

import groovy.transform.builder.Builder

import javax.persistence.*

@Entity
@Builder
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id
    String username
    String password
    String email
    @OneToMany(mappedBy = "user")
    Set<Game> games
}
