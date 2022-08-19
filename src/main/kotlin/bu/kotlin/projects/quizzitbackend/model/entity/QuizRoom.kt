package bu.kotlin.projects.quizzitbackend.model.entity

import bu.kotlin.projects.quizzitbackend.model.entity.Admin
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table(name="quiz_room")
@Data
@AllArgsConstructor
@NoArgsConstructor
data class QuizRoom(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val quizRoomId: Long,
    val name: String,
    @Column(unique = true)
    val code: String,
    val dateCreated: String,
    val description: String,
    @ManyToOne
    val adminId: Admin
) {
    constructor() : this(1L,"","","", "", Admin()) {

    }
}
