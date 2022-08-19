package bu.kotlin.projects.quizzitbackend.utility.constant

import org.springframework.http.HttpStatus

class UserNotFoundException(status: HttpStatus, message: String): Exception(message) {
}