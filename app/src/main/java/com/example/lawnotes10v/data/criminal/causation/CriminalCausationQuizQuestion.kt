package com.example.lawnotes10v.data.criminal.causation

data class CriminalCausationQuizQuestion(
    val question: String,
    val options: MutableList<String>, // Mutable to shuffle later
    val correctAnswer: String,
    val explanation: String
)

object QuizRepository {
    val quizQuestions = mutableListOf(
        CriminalCausationQuizQuestion(
            question = "What is factual causation?",
            options = mutableListOf(
                "When the result is caused by the victim’s actions",
                "When the defendant's actions caused the result in fact",
                "When there is no connection between the actions and the result",
                "When multiple factors caused the result"
            ),
            correctAnswer = "When the defendant's actions caused the result in fact",
            explanation = "Factual causation asks whether the defendant's actions caused the result in fact, using the 'but-for' test."
        ),

        CriminalCausationQuizQuestion(
            question = "What test is used to determine factual causation?",
            options = mutableListOf(
                "The foreseeability test",
                "The but-for test",
                "The reasonable person test",
                "The proximity test"
            ),
            correctAnswer = "The but-for test",
            explanation = "The but-for test is used to determine if the result would not have occurred without the defendant's actions."
        ),

        CriminalCausationQuizQuestion(
            question = "What does the term 'novus actus interveniens' mean?",
            options = mutableListOf(
                "A new intervening act",
                "An omission by the defendant",
                "A natural consequence",
                "A foreseeable event"
            ),
            correctAnswer = "A new intervening act",
            explanation = "'Novus actus interveniens' refers to a new act or event that breaks the chain of causation."
        ),

        CriminalCausationQuizQuestion(
            question = "Which case illustrates the 'but-for' test?",
            options = mutableListOf(
                "R v Blaue",
                "R v White",
                "R v Pagett",
                "R v Cheshire"
            ),
            correctAnswer = "R v White",
            explanation = "In R v White, the defendant's mother died from a heart attack before drinking poison, showing the result was not caused by the defendant's actions."
        ),

        CriminalCausationQuizQuestion(
            question = "What does the egg-shell skull rule state?",
            options = mutableListOf(
                "The defendant is not liable for unusual consequences",
                "The defendant must take the victim as they find them",
                "The defendant is only liable for foreseeable harm",
                "The defendant is only liable if the victim contributes to the harm"
            ),
            correctAnswer = "The defendant must take the victim as they find them",
            explanation = "The egg-shell skull rule means that the defendant is responsible even if the victim has a pre-existing condition or weakness."
        ),

        CriminalCausationQuizQuestion(
            question = "What breaks the chain of causation?",
            options = mutableListOf(
                "The defendant's voluntary act",
                "A novus actus interveniens",
                "The victim’s pre-existing condition",
                "The defendant's negligence"
            ),
            correctAnswer = "A novus actus interveniens",
            explanation = "A novus actus interveniens is a new act or event that breaks the chain of causation, making the defendant no longer responsible."
        ),

        CriminalCausationQuizQuestion(
            question = "Which case involves a refusal of medical treatment?",
            options = mutableListOf(
                "R v Blaue",
                "R v White",
                "R v Pagett",
                "R v Cheshire"
            ),
            correctAnswer = "R v Blaue",
            explanation = "In R v Blaue, the victim refused a blood transfusion due to religious beliefs, but the defendant was still held responsible for her death."
        ),

        CriminalCausationQuizQuestion(
            question = "What is legal causation?",
            options = mutableListOf(
                "Whether the defendant’s actions were a minor cause",
                "Whether the defendant’s actions were a substantial and operating cause",
                "Whether the defendant foresaw the harm",
                "Whether the defendant acted intentionally"
            ),
            correctAnswer = "Whether the defendant’s actions were a substantial and operating cause",
            explanation = "Legal causation asks whether the defendant's actions were a significant and continuing cause of the result."
        ),

        CriminalCausationQuizQuestion(
            question = "What is an omission in criminal law?",
            options = mutableListOf(
                "A physical act",
                "Failure to act when there is a duty",
                "An intentional crime",
                "A form of defense"
            ),
            correctAnswer = "Failure to act when there is a duty",
            explanation = "An omission is the failure to act when there is a legal duty to do so."
        ),

        CriminalCausationQuizQuestion(
            question = "What happens if a victim's own actions break the chain of causation?",
            options = mutableListOf(
                "The defendant is still liable",
                "The defendant is no longer liable",
                "The victim is liable",
                "The defendant is partially liable"
            ),
            correctAnswer = "The defendant is no longer liable",
            explanation = "If the victim’s own actions are considered unforeseeable and break the chain of causation, the defendant is no longer liable."
        ),
        CriminalCausationQuizQuestion(
            question = "What is the primary purpose of the but-for test?",
            options = mutableListOf(
                "To determine whether the victim's actions were reasonable",
                "To establish legal causation",
                "To determine factual causation",
                "To assess the defendant’s mental state"
            ),
            correctAnswer = "To determine factual causation",
            explanation = "The but-for test helps determine whether the defendant's actions were the factual cause of the harm."
        ),

        CriminalCausationQuizQuestion(
            question = "Which of the following situations could break the chain of causation?",
            options = mutableListOf(
                "The victim has a pre-existing condition",
                "The victim refuses medical treatment",
                "The defendant’s act was the sole cause of harm",
                "An unforeseeable act by a third party"
            ),
            correctAnswer = "An unforeseeable act by a third party",
            explanation = "An unforeseeable act by a third party can break the chain of causation, making the defendant no longer responsible."
        ),

        CriminalCausationQuizQuestion(
            question = "In which case was the thin skull rule applied?",
            options = mutableListOf(
                "R v White",
                "R v Cheshire",
                "R v Blaue",
                "R v Pagett"
            ),
            correctAnswer = "R v Blaue",
            explanation = "The thin skull rule was applied in R v Blaue, where the defendant had to take the victim as they found them, even with religious beliefs."
        ),

        CriminalCausationQuizQuestion(
            question = "What happens if there are multiple causes of a result?",
            options = mutableListOf(
                "The defendant is not liable if others contributed",
                "The defendant is still liable if their act was a substantial cause",
                "The defendant is only liable if they caused the result entirely",
                "All parties are equally liable"
            ),
            correctAnswer = "The defendant is still liable if their act was a substantial cause",
            explanation = "If the defendant’s actions were a significant cause of the harm, they are still liable even if other factors contributed."
        ),

        CriminalCausationQuizQuestion(
            question = "What is the key factor in determining whether medical treatment breaks the chain of causation?",
            options = mutableListOf(
                "The treatment was reasonably foreseeable",
                "The treatment was independent of the defendant's act",
                "The victim refused treatment",
                "The defendant foresaw the harm"
            ),
            correctAnswer = "The treatment was independent of the defendant's act",
            explanation = "Medical treatment breaks the chain of causation only if it is so independent of the defendant’s act that the original cause is insignificant."
        ),
        CriminalCausationQuizQuestion(
            question = "In R v Jordan, what was the key reason the chain of causation was broken?",
            options = mutableListOf(
                "The defendant’s actions were not a significant cause",
                "The medical treatment was palpably wrong",
                "The victim’s actions were unreasonable",
                "The defendant foresaw the outcome"
            ),
            correctAnswer = "The medical treatment was palpably wrong",
            explanation = "In R v Jordan, the medical treatment was so incorrect that it broke the chain of causation."
        ),

        CriminalCausationQuizQuestion(
            question = "What is required for a novus actus interveniens to break the chain of causation?",
            options = mutableListOf(
                "It must be reasonably foreseeable",
                "It must be an independent and sufficient cause of the result",
                "It must be a direct result of the defendant's actions",
                "It must have been caused by the victim"
            ),
            correctAnswer = "It must be an independent and sufficient cause of the result",
            explanation = "A novus actus interveniens breaks the chain of causation if it is independent and the main cause of the harm."
        ),

        CriminalCausationQuizQuestion(
            question = "In R v Cheshire, why did the poor medical treatment not break the chain of causation?",
            options = mutableListOf(
                "The defendant's actions were still a substantial cause",
                "The medical treatment was the sole cause of death",
                "The victim contributed to the harm",
                "The defendant did not foresee the harm"
            ),
            correctAnswer = "The defendant's actions were still a substantial cause",
            explanation = "Even though the medical treatment was poor, the defendant's actions were still a substantial and operating cause of the harm."
        ),

        CriminalCausationQuizQuestion(
            question = "Which principle was applied in R v Pagett?",
            options = mutableListOf(
                "The egg-shell skull rule",
                "Factual causation",
                "Legal causation",
                "The principle of self-defense breaking the chain of causation"
            ),
            correctAnswer = "Legal causation",
            explanation = "In R v Pagett, legal causation was applied because the defendant’s use of a human shield was the main cause of the death."
        ),

        CriminalCausationQuizQuestion(
            question = "What distinguishes factual causation from legal causation?",
            options = mutableListOf(
                "Factual causation deals with whether the result would have occurred anyway, legal causation focuses on whether the defendant is morally responsible",
                "Legal causation is the same as factual causation",
                "Factual causation focuses on the chain of events, legal causation on the direct consequences",
                "Legal causation is concerned with the victim's contribution"
            ),
            correctAnswer = "Factual causation deals with whether the result would have occurred anyway, legal causation focuses on whether the defendant is morally responsible",
            explanation = "Factual causation looks at whether the result would have happened without the defendant’s actions, while legal causation assesses whether the defendant’s actions should be held morally responsible."
        ),

        // Add the rest of your questions here...
    )
}
