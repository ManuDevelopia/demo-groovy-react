package info.developia.demogroovyreact.repository

import info.developia.demogroovyreact.dao.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository extends JpaRepository<User, Long> {

}