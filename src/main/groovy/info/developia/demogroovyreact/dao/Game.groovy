package info.developia.demogroovyreact.dao

import com.fasterxml.jackson.annotation.JsonIgnore
import groovy.transform.ToString
import groovy.transform.builder.Builder

import javax.persistence.*

@Entity
@Builder
@ToString(includeNames = true, includePackage = false)
class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id
    String name
    @ManyToOne
    User user

}