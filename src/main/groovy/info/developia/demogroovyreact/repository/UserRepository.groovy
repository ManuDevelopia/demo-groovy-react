package info.developia.demogroovyreact.repository

import info.developia.demogroovyreact.dao.User
import org.springframework.data.repository.CrudRepository

interface UserRepository extends CrudRepository<User,Long>{

}
