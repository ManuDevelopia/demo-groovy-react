package info.developia.demogroovyreact.repository

import info.developia.demogroovyreact.dao.Game
import org.springframework.data.repository.CrudRepository

interface GameRepository extends CrudRepository<Game, Long> {

}