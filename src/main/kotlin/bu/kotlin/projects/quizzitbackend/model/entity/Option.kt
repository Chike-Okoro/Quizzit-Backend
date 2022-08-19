package bu.kotlin.projects.quizzitbackend.model.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table(name="option")
@Data
@AllArgsConstructor
@NoArgsConstructor
data class Option(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val optionId: Long,
    val title: String,
    val correct: Boolean,
    @ManyToOne
    val questionId: Question
) {
    constructor() : this(1L, "", false, Question()) {

    }
}
