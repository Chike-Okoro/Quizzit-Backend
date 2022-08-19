package bu.kotlin.projects.quizzitbackend.controller


import bu.kotlin.projects.quizzitbackend.model.entity.User
import bu.kotlin.projects.quizzitbackend.service.UserService
import org.springframework.web.bind.annotation.*


@RestController
class UserController(private val userService: UserService) {
    @GetMapping("/users")
    fun getAllUsers(): List<User> = userService.getAllUsers()

    @GetMapping("/users/{id}")
    fun getUsersById(@PathVariable("id") userId: Long): User = userService.getUsersById(userId)

    @PostMapping("/users")
    fun createUser(@RequestBody user: User): User = userService.createUser(user)

    @PutMapping("/users/{id}")
    fun updateUserById(@PathVariable("id") userId: Long, @RequestBody user: User): User =
        userService.updateUserById(userId, user)

    @DeleteMapping("/users/{id}")
    fun deleteUsersById(@PathVariable("id") userId: Long): Unit =
        userService.deleteUsersById(userId)

}