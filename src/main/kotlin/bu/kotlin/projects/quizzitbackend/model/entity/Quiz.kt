package bu.kotlin.projects.quizzitbackend.model.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table(name="quiz")
@Data
@AllArgsConstructor
@NoArgsConstructor
data class Quiz(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val quizId: Long,
    val timeLimit: Int,
    val passMark: Float,
    @ManyToOne
    val quizRoomId: QuizRoom
) {
    constructor() : this(1L, 60, 50.0F, QuizRoom()) {

    }
}
