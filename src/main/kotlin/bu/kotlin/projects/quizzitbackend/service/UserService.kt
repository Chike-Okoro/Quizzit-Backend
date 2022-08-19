package bu.kotlin.projects.quizzitbackend.service


import bu.kotlin.projects.quizzitbackend.model.entity.User
import bu.kotlin.projects.quizzitbackend.repository.UserRepository
import bu.kotlin.projects.quizzitbackend.utility.constant.UserNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service


@Service
class UserService(private val userRepository: UserRepository) {
    fun getAllUsers(): List<User> = userRepository.findAll()

    fun getUsersById(userId: Long): User = userRepository.findById(userId).orElseThrow{
        UserNotFoundException(HttpStatus.NOT_FOUND, "No matching user was found")}


    fun createUser(user: User): User = userRepository.save(user)

    fun updateUserById(userId: Long, user: User): User{
        return if(userRepository.existsById(userId)){
            userRepository.save(
                User(
                    userId = user.userId,
                    firstName = user.firstName,
                    lastName = user.lastName,
                    userName = user.userName,
                    password = user.password
                )
            )
        } else throw UserNotFoundException(HttpStatus.NOT_FOUND, "No matching user was found")
    }

    fun deleteUsersById(userId: Long){
        return if(userRepository.existsById(userId)){
            userRepository.deleteById(userId)
        } else throw UserNotFoundException(HttpStatus.NOT_FOUND, "No matching user was found")
    }


}