package info.developia.demogroovyreact.dao

import groovy.transform.ToString
import groovy.transform.builder.Builder

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Builder
@ToString(includeNames = true, includePackage = false)
class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id
    String name

}