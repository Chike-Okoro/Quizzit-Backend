package bu.kotlin.projects.quizzitbackend.repository

import bu.kotlin.projects.quizzitbackend.model.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Long>