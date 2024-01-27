package com.example.lawnotes10v.data

data class QuizQuestion(
    val question: String,
    val options: MutableList<String>, // Mutable to shuffle later
    val correctAnswer: String,
    val explanation: String
)
object QuizRepository {
    val quizQuestions = mutableListOf(
        QuizQuestion(
            question = "Criminal Law is designed to:",
            options = mutableListOf(
                "Compensate victims",
                "Control behaviors of citizens",
                "Regulate international trade",
            ),
            correctAnswer = "Control behaviors of citizens",
            explanation = "Criminal Law sets standards for permissible behavior within a society."
        ),
        QuizQuestion(
            question = "In Criminal Law, who prosecutes the defendant?",
            options = mutableListOf(
                "The victim",
                "A jury",
                "The State",
            ),
            correctAnswer = "The State",
            explanation = "In criminal proceedings, the state is responsible for prosecuting individuals accused of crimes."
        ),
        QuizQuestion(
            question = "Actus reus refers to:",
            options = mutableListOf(
                "The guilty mind",
                "The criminal act",
                "The legal duty",
            ),
            correctAnswer = "The criminal act",
            explanation = "Actus reus is the physical act of committing a crime, a fundamental component of criminal liability."
        ),
        QuizQuestion(
            question = "Mens rea is:",
            options = mutableListOf(
                "A strict liability",
                "A defense mechanism",
                "The mental state of committing a crime",
            ),
            correctAnswer = "The mental state of committing a crime",
            explanation = " Mens rea refers to the mental state or 'guilty mind' behind the commission of a criminal act."
        ),
        QuizQuestion(
            question = "Which of the following is a principle of Civil Law?",
            options = mutableListOf(
                "Punishment of the wrongdoer",
                "Compensation to the victim",
                "Protection of state interests",
            ),
            correctAnswer = "Compensation to the victim",
            explanation = "Civil Law focuses on resolving disputes between individuals or organizations,"
        ),
        QuizQuestion(
            question = "Which of the following is a principle of Civil Law?",
            options = mutableListOf(
                "Punishment of the wrongdoer",
                "Compensation to the victim",
                "Protection of state interests",
            ),
            correctAnswer = "Compensation to the victim",
            explanation = "Civil Law deals with compensating the victim for losses suffered due to the defendant's actions."
        ),
        QuizQuestion(
            question = "The 'golden thread' of English Criminal Law means that:",
            options = mutableListOf(
                "The defendant is always innocent",
                "The prosecution must prove guilt",
                "The jury decides on sentencing",
            ),
            correctAnswer = "The prosecution must prove guilt",
            explanation = "This principle emphasizes that it is the prosecution's responsibility to prove the defendant's guilt beyond a reasonable doubt."
        ),
        QuizQuestion(
            question = "A strict liability offense:",
            options = mutableListOf(
                "Requires proof of mens rea",
                "Is based solely on the actus reus",
                "Can only be committed by adults",
            ),
            correctAnswer = "Is based solely on the actus reus",
            explanation = "In strict liability offenses, the defendant can be liable for the mere act of committing the offense, without the prosecution needing to prove intent or mens rea."
        ),
        QuizQuestion(
            question = "If a defendant believed they possessed something different than what was found, they:",
            options = mutableListOf(
                "Cannot be found guilty",
                "Can be found guilty of possession",
                "Are only guilty if they intended harm",
            ),
            correctAnswer = "Can be found guilty of possession",
            explanation = "A mistake of fact is generally not a defense to possession if the item possessed is illegal."
        ),
        QuizQuestion(
            question = "Which of the following is true about omission liability?",
            options = mutableListOf(
                "It is always punishable",
                "It requires a legal duty to act",
                "It refers to mental state crimes",
            ),
            correctAnswer = "It requires a legal duty to act",
            explanation = "Liability for omission stems from failing to act when there is a legal obligation to do so."
        ),
        QuizQuestion(
            question = "In result crimes, what must the prosecution establish?",
            options = mutableListOf(
                "Mens rea only",
                "Actus reus only",
                "Causation",
            ),
            correctAnswer = "Causation",
            explanation = "The prosecution must show a causal link between the defendant's act and the prohibited result."
        ),
        QuizQuestion(
            question = "The case R v Cunningham is significant for establishing:",
            options = mutableListOf(
                "Intention as a form of mens rea",
                "Recklessness as a form of mens rea",
                "Strict liability",
            ),
            correctAnswer = "Recklessness as a form of mens rea",
            explanation = "The case clarified the mens rea of recklessness, which involves a conscious disregard of a substantial and unjustifiable risk."
        ),
        QuizQuestion(
            question = "Status crimes are:",
            options = mutableListOf(
                "Always strict liability offenses",
                "Based on the defendant being in a certain situation",
                "Crimes that require proof of actus reus and mens rea",
            ),
            correctAnswer = "Based on the defendant being in a certain situation",
            explanation = "Status crimes involve criminal liability for being in a situation deemed illegal, regardless of conduct or intent."
        ),
        QuizQuestion(
            question = "Automatism can negate:",
            options = mutableListOf(
                "Only actus reus",
                "Only mens rea",
                "Both actus reus and mens rea",
            ),
            correctAnswer = "Both actus reus and mens rea",
            explanation = "Automatism, as a defense, suggests the defendant was not in control of their actions, negating both the physical act and the intent."
        ),
        QuizQuestion(
            question = "R v Larsonneur illustrates situational liability because:",
            options = mutableListOf(
                "The defendant voluntarily committed a crime",
                "The defendant was in an unlawful situation regardless of intent",
                "The defendant used automatism as a defense",
            ),
            correctAnswer = "The defendant was in an unlawful situation regardless of intent",
            explanation = "The defendant was criminally liable simply for being in a certain situation, which is the essence of situational liability."
        ),
        QuizQuestion(
            question = "In result crimes, the principle of causation requires:",
            options = mutableListOf(
                "An indirect cause of the result",
                "A direct cause of the result without any intervening cause",
                "A demonstration of negligence",
            ),
            correctAnswer = "A direct cause of the result without any intervening cause",
            explanation = "Causation must be direct, with the defendant's actions leading to the result without being broken by any intervening events."
        ),
        // Add the rest of your questions here...
    )
}
