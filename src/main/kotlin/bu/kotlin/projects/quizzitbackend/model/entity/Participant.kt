package bu.kotlin.projects.quizzitbackend.model.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table(name = "participant")
@Data
@AllArgsConstructor
@NoArgsConstructor
data class Participant(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val participantId: Long,
    val userName: String,
    @OneToOne
    val userId: User
) {
    constructor() : this(1L, "", User()) {

    }
}