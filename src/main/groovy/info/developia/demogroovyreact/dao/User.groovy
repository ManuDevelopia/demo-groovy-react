package info.developia.demogroovyreact.dao

import com.fasterxml.jackson.annotation.JsonIgnore
import groovy.transform.builder.Builder

import javax.persistence.*

@Entity
@Builder
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id
    String username
    @JsonIgnore
    String password
    String email
    @OneToMany(mappedBy = "user")
    Set<Game> games
}
