package bu.kotlin.projects.quizzitbackend.model.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table(name = "quiz_population")
@Data
@AllArgsConstructor
@NoArgsConstructor
data class QuizPopulation(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val quizPopulationId: Long,
    @ManyToOne
    val participantId: Participant,
    @ManyToOne
    val quizRoomId: QuizRoom

) {
    constructor() : this(1L, Participant(), QuizRoom()) {

    }
}
