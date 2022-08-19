package bu.kotlin.projects.quizzitbackend.model.request

import javax.validation.constraints.NotEmpty


data class UserLoginRequest(
    @get: NotEmpty(message = "userName is required")
    val userName: String,

    @get: NotEmpty(message = "password is required")
    val password: String

)
