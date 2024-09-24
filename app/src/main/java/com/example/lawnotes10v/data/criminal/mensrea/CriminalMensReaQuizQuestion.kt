package com.example.lawnotes10v.data.criminal.mensrea

data class CriminalMensReaQuizQuestion(
    val question: String,
    val options: MutableList<String>, // Mutable to shuffle later
    val correctAnswer: String,
    val explanation: String
)

object QuizRepository {
    val quizQuestions = mutableListOf(
        CriminalMensReaQuizQuestion(
            question = "What does Mens Rea refer to?",
            options = mutableListOf(
                "A physical act",
                "A guilty mind",
                "A legal defense",
                "An innocent act"
            ),
            correctAnswer = "A guilty mind",
            explanation = "Mens Rea refers to the mental state of someone committing a crime, showing their guilty mind."
        ),
        CriminalMensReaQuizQuestion(
            question = "Which of these is a type of subjective fault?",
            options = mutableListOf(
                "Negligence",
                "Objective fault",
                "Intention",
                "Gross negligence"
            ),
            correctAnswer = "Intention",
            explanation = "Intention is a subjective fault because it refers to the mental state where someone consciously aims to cause harm."
        ),
        CriminalMensReaQuizQuestion(
            question = "What is direct intention?",
            options = mutableListOf(
                "When the person acts by accident",
                "When the person acts with purpose to achieve a result",
                "When the person ignores the risk",
                "When the person avoids responsibility"
            ),
            correctAnswer = "When the person acts with purpose to achieve a result",
            explanation = "Direct intention means the person aims to bring about a specific result with their actions."
        ),
        CriminalMensReaQuizQuestion(
            question = "What is recklessness?",
            options = mutableListOf(
                "Failing to consider any risks",
                "Taking a risk without knowing the consequences",
                "Consciously taking an unjustified risk",
                "Ignoring the law completely"
            ),
            correctAnswer = "Consciously taking an unjustified risk",
            explanation = "Recklessness is when a person knows there's a risk but still decides to proceed with their actions."
        ),
        CriminalMensReaQuizQuestion(
            question = "Which type of fault focuses on the 'reasonable person' standard?",
            options = mutableListOf(
                "Subjective fault",
                "Recklessness",
                "Objective fault",
                "Direct intention"
            ),
            correctAnswer = "Objective fault",
            explanation = "Objective fault is based on the idea of what a 'reasonable person' would do in the same situation."
        ),
        CriminalMensReaQuizQuestion(
            question = "What is the main difference between recklessness and negligence?",
            options = mutableListOf(
                "Recklessness is aware of risk; negligence is unaware",
                "Negligence requires more severe harm",
                "Negligence is always intentional",
                "Recklessness does not involve any fault"
            ),
            correctAnswer = "Recklessness is aware of risk; negligence is unaware",
            explanation = "Recklessness involves awareness of a risk, while negligence happens when a person should have been aware but wasn’t."
        ),
        CriminalMensReaQuizQuestion(
            question = "Which of the following is an example of a crime involving objective fault?",
            options = mutableListOf(
                "Murder",
                "Theft",
                "Careless driving",
                "Handling stolen goods"
            ),
            correctAnswer = "Careless driving",
            explanation = "Careless driving is an objective fault crime because it is judged by what a reasonable person would have done."
        ),
        CriminalMensReaQuizQuestion(
            question = "What does indirect intention involve?",
            options = mutableListOf(
                "Committing a crime accidentally",
                "Committing a crime with purpose",
                "Knowing the result is certain but not aiming for it",
                "Acting without thinking about the consequences"
            ),
            correctAnswer = "Knowing the result is certain but not aiming for it",
            explanation = "Indirect intention means the person knows the outcome will happen, even if it’s not their direct aim."
        ),
        CriminalMensReaQuizQuestion(
            question = "Which of the following is a subjective fault?",
            options = mutableListOf(
                "Gross negligence",
                "Intention",
                "Objective fault",
                "Failure to act"
            ),
            correctAnswer = "Intention",
            explanation = "Intention is a subjective fault, which focuses on the person’s mental state when committing a crime."
        ),
        CriminalMensReaQuizQuestion(
            question = "Which mental state is required for murder?",
            options = mutableListOf(
                "Negligence",
                "Intention to kill or cause serious injury",
                "Recklessness",
                "Unintentional harm"
            ),
            correctAnswer = "Intention to kill or cause serious injury",
            explanation = "Murder requires proof of intention to kill or cause serious injury, making it a crime of specific intent."
        ), CriminalMensReaQuizQuestion(
            question = "What is the key difference between subjective and objective fault?",
            options = mutableListOf(
                "Subjective fault looks at a person’s actions; objective fault looks at consequences",
                "Subjective fault considers the person’s mindset; objective fault does not",
                "Objective fault involves criminal intent; subjective fault involves negligence",
                "There is no difference between subjective and objective fault"
            ),
            correctAnswer = "Subjective fault considers the person’s mindset; objective fault does not",
            explanation = "Subjective fault focuses on the person’s mental state, while objective fault focuses on whether the person met the reasonable person standard."
        ),
        CriminalMensReaQuizQuestion(
            question = "In criminal law, what does 'closing the mind to risk' refer to?",
            options = mutableListOf(
                "Negligence",
                "Recklessness",
                "Indirect intention",
                "Involuntary conduct"
            ),
            correctAnswer = "Recklessness",
            explanation = "'Closing the mind to risk' is a form of recklessness where the person deliberately ignores an obvious risk."
        ),
        CriminalMensReaQuizQuestion(
            question = "Which of these crimes requires only objective fault?",
            options = mutableListOf(
                "Theft",
                "Gross negligence manslaughter",
                "Handling stolen goods",
                "Dangerous driving"
            ),
            correctAnswer = "Dangerous driving",
            explanation = "Dangerous driving is judged by what a reasonable person would do, making it a crime of objective fault."
        ),
        CriminalMensReaQuizQuestion(
            question = "In the case of indirect intention, what must the person be aware of?",
            options = mutableListOf(
                "That their actions might lead to some risk",
                "That the outcome is virtually certain",
                "That they acted carelessly",
                "That they followed all the rules"
            ),
            correctAnswer = "That the outcome is virtually certain",
            explanation = "Indirect intention requires that the person knows the outcome is nearly certain, even if they didn’t aim for it."
        ),
        CriminalMensReaQuizQuestion(
            question = "Which of the following is an example of a crime involving recklessness?",
            options = mutableListOf(
                "Murder",
                "Negligent manslaughter",
                "Criminal damage",
                "Theft"
            ),
            correctAnswer = "Criminal damage",
            explanation = "Criminal damage is often committed with recklessness, where the person takes a risk knowing damage might occur."
        ), CriminalMensReaQuizQuestion(
            question = "What was the legal significance of the case Woollin [1999] in defining intention?",
            options = mutableListOf(
                "It allowed juries to convict based on any foresight of consequences",
                "It introduced a test for indirect intention based on virtual certainty",
                "It abolished the distinction between direct and indirect intention",
                "It focused on motive as a primary factor in determining intention"
            ),
            correctAnswer = "It introduced a test for indirect intention based on virtual certainty",
            explanation = "The Woollin case introduced the concept of virtual certainty in determining indirect intention, clarifying how juries should infer intent."
        ),
        CriminalMensReaQuizQuestion(
            question = "Which case redefined recklessness as requiring actual foresight of risk by the defendant?",
            options = mutableListOf(
                "Caldwell",
                "Stephenson",
                "G and R",
                "Brady"
            ),
            correctAnswer = "G and R",
            explanation = "The House of Lords in G and R overturned Caldwell recklessness, requiring that the defendant must have actual foresight of the risk."
        ),
        CriminalMensReaQuizQuestion(
            question = "In cases of negligence, what does the term 'reasonable person' mean?",
            options = mutableListOf(
                "An average person with the same skills as the defendant",
                "A person who would act with perfect judgment in every situation",
                "A person who behaves with the level of care expected in the same circumstances",
                "A professional with special training relevant to the case"
            ),
            correctAnswer = "A person who behaves with the level of care expected in the same circumstances",
            explanation = "A 'reasonable person' standard refers to the expected behavior of an average person in the same circumstances, not necessarily a professional or expert."
        ),
        CriminalMensReaQuizQuestion(
            question = "Which form of mens rea must be proven for a conviction of gross negligence manslaughter?",
            options = mutableListOf(
                "Direct intention",
                "Recklessness",
                "Negligence",
                "Subjective fault"
            ),
            correctAnswer = "Negligence",
            explanation = "Gross negligence manslaughter requires proof that the person failed to meet the reasonable standard of care, without needing to prove intention."
        ),
        CriminalMensReaQuizQuestion(
            question = "What is the relationship between motive and intention in criminal law?",
            options = mutableListOf(
                "Motive is always considered when determining intention",
                "Motive is irrelevant to intention, which focuses only on the act",
                "Motive defines the reason for intention",
                "Motive can reduce the severity of the crime"
            ),
            correctAnswer = "Motive is irrelevant to intention, which focuses only on the act",
            explanation = "Criminal law separates motive from intention; intention focuses on the act, while motive explains why the person did it but does not affect liability."
        ),
        CriminalMensReaQuizQuestion(
            question = "What was the legal significance of the case Woollin [1999] in defining intention?",
            options = mutableListOf(
                "It allowed juries to convict based on any foresight of consequences",
                "It introduced a test for indirect intention based on virtual certainty",
                "It abolished the distinction between direct and indirect intention",
                "It focused on motive as a primary factor in determining intention"
            ),
            correctAnswer = "It introduced a test for indirect intention based on virtual certainty",
            explanation = "The Woollin case introduced the concept of virtual certainty in determining indirect intention, clarifying how juries should infer intent."
        ),
        CriminalMensReaQuizQuestion(
            question = "Which case redefined recklessness as requiring actual foresight of risk by the defendant?",
            options = mutableListOf(
                "Caldwell",
                "Stephenson",
                "G and R",
                "Brady"
            ),
            correctAnswer = "G and R",
            explanation = "The House of Lords in G and R overturned Caldwell recklessness, requiring that the defendant must have actual foresight of the risk."
        ),
        CriminalMensReaQuizQuestion(
            question = "In cases of negligence, what does the term 'reasonable person' mean?",
            options = mutableListOf(
                "An average person with the same skills as the defendant",
                "A person who would act with perfect judgment in every situation",
                "A person who behaves with the level of care expected in the same circumstances",
                "A professional with special training relevant to the case"
            ),
            correctAnswer = "A person who behaves with the level of care expected in the same circumstances",
            explanation = "A 'reasonable person' standard refers to the expected behavior of an average person in the same circumstances, not necessarily a professional or expert."
        ),
        CriminalMensReaQuizQuestion(
            question = "Which form of mens rea must be proven for a conviction of gross negligence manslaughter?",
            options = mutableListOf(
                "Direct intention",
                "Recklessness",
                "Negligence",
                "Subjective fault"
            ),
            correctAnswer = "Negligence",
            explanation = "Gross negligence manslaughter requires proof that the person failed to meet the reasonable standard of care, without needing to prove intention."
        ),
        CriminalMensReaQuizQuestion(
            question = "What is the relationship between motive and intention in criminal law?",
            options = mutableListOf(
                "Motive is always considered when determining intention",
                "Motive is irrelevant to intention, which focuses only on the act",
                "Motive defines the reason for intention",
                "Motive can reduce the severity of the crime"
            ),
            correctAnswer = "Motive is irrelevant to intention, which focuses only on the act",
            explanation = "Criminal law separates motive from intention; intention focuses on the act, while motive explains why the person did it but does not affect liability."
        ),

        // Add the rest of your questions here...
    )
}
