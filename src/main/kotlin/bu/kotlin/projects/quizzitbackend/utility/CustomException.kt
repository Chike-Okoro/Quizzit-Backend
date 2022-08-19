package bu.kotlin.projects.quizzitbackend.utility

data class UnableToLocateRecordException(override val message: String? = null): Exception(message)
data class BadRequest(override val message: String? = null): Exception(message)
data class FailedToCreate(override val message: String? = null): Exception(message)
data class FailedToUpdate(override val message: String? = null): Exception(message)
data class InvalidPathException(override val message: String? = null): Exception(message)
