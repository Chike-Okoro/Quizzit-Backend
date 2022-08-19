package bu.kotlin.projects.quizzitbackend.model.request

import javax.validation.constraints.NotEmpty


data class UserCreateRequest(
    @get: NotEmpty(message = "firstName is required")
    val firstName: String,

    @get: NotEmpty(message = "lastName is required")
    val lastName: String,

    @get: NotEmpty(message = "userName is required")
    val userName: String,

    @get: NotEmpty(message = "password is required")
    val password: String,

    @get: NotEmpty(message = "userId is required")
    val userId: Long

)
