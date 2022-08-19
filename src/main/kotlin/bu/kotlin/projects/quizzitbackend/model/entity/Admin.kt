package bu.kotlin.projects.quizzitbackend.model.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table(name="admin")
@Data
@AllArgsConstructor
@NoArgsConstructor
data class Admin(
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    val adminId: Long? = null,
    val userName: String? = null,
    @OneToOne
    val userId: User? = null

)
