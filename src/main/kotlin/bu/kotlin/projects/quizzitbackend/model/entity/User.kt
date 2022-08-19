package bu.kotlin.projects.quizzitbackend.model.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table(name = "app_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val userId: Long? = null,
    val userName: String? = null,
    val firstName: String? = null,
    val lastName: String? = null,
    val password: String? = null,
    val isAdmin: Boolean? = null
)

