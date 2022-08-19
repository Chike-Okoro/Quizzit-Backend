package bu.kotlin.projects.quizzitbackend.model.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table(name="question")
@Data
@AllArgsConstructor
@NoArgsConstructor
data class Question(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val questionId: Long,
    val title: String,
    @ManyToOne
    val quizRoomId: QuizRoom
) {
    constructor() : this(1L, "", QuizRoom()) {

    }
}
