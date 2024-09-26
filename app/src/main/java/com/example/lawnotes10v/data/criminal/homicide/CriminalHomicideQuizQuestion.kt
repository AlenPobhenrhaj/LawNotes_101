package com.example.lawnotes10v.data.criminal.homicide

data class CriminalHomicideQuizQuestion(
    val question: String,
    val options: MutableList<String>, // Mutable to shuffle later
    val correctAnswer: String,
    val explanation: String
)

object QuizRepository {
    val quizQuestions = mutableListOf(
        CriminalHomicideQuizQuestion(
            question = "What is the actus reus for murder?",
            options = mutableListOf(
                "Causing grievous bodily harm",
                "Unlawful killing of a human being",
                "Intending to kill someone",
                "Acting recklessly"
            ),
            correctAnswer = "Unlawful killing of a human being",
            explanation = "The actus reus of murder is the unlawful killing of a human being."
        ),

        CriminalHomicideQuizQuestion(
            question = "What is the mens rea for murder?",
            options = mutableListOf(
                "Negligence",
                "Recklessness",
                "Malice aforethought",
                "Gross negligence"
            ),
            correctAnswer = "Malice aforethought",
            explanation = "Malice aforethought is the mens rea for murder, meaning an intention to kill or cause grievous bodily harm."
        ),

        CriminalHomicideQuizQuestion(
            question = "Which law replaced the defence of provocation with loss of self-control?",
            options = mutableListOf(
                "Coroners and Justice Act 2009",
                "Homicide Act 1957",
                "Offences Against the Person Act 1861",
                "Criminal Justice Act 2003"
            ),
            correctAnswer = "Coroners and Justice Act 2009",
            explanation = "The Coroners and Justice Act 2009 replaced the old provocation defence with the loss of self-control defence."
        ),

        CriminalHomicideQuizQuestion(
            question = "What sentence does a murder conviction carry?",
            options = mutableListOf(
                "Maximum life in prison",
                "Mandatory life in prison",
                "10 years in prison",
                "Discretionary sentence"
            ),
            correctAnswer = "Mandatory life in prison",
            explanation = "Murder carries a mandatory life sentence in the UK."
        ),

        CriminalHomicideQuizQuestion(
            question = "What is voluntary manslaughter?",
            options = mutableListOf(
                "A complete defence to murder",
                "A type of manslaughter without intention to kill",
                "A reduction from murder due to partial defences",
                "A result of gross negligence"
            ),
            correctAnswer = "A reduction from murder due to partial defences",
            explanation = "Voluntary manslaughter occurs when there is intention to kill, but partial defences like loss of self-control or diminished responsibility apply."
        ),

        CriminalHomicideQuizQuestion(
            question = "What is the result of a successful loss of self-control defence?",
            options = mutableListOf(
                "Complete acquittal",
                "Reduction from murder to manslaughter",
                "Murder conviction with reduced sentence",
                "Reduced charge of assault"
            ),
            correctAnswer = "Reduction from murder to manslaughter",
            explanation = "If the loss of self-control defence succeeds, the charge is reduced from murder to voluntary manslaughter."
        ),

        CriminalHomicideQuizQuestion(
            question = "Which case established the virtual certainty test for oblique intention?",
            options = mutableListOf(
                "R v Vickers",
                "R v Woollin",
                "R v Cunningham",
                "R v Ahluwalia"
            ),
            correctAnswer = "R v Woollin",
            explanation = "R v Woollin established the test for oblique intention, where a consequence is virtually certain and D foresees it."
        ),

        CriminalHomicideQuizQuestion(
            question = "What type of crime is murder classified as?",
            options = mutableListOf(
                "Strict liability",
                "Reckless crime",
                "Specific intent crime",
                "General intent crime"
            ),
            correctAnswer = "Specific intent crime",
            explanation = "Murder is a specific intent crime, requiring proof of an intention to kill or cause grievous bodily harm."
        ),

        CriminalHomicideQuizQuestion(
            question = "What is the meaning of 'grievous bodily harm' in the context of murder?",
            options = mutableListOf(
                "Serious physical harm",
                "Slight injury",
                "Unlawful restraint",
                "Any mental harm"
            ),
            correctAnswer = "Serious physical harm",
            explanation = "Grievous bodily harm refers to really serious physical harm, which is a sufficient mens rea for murder."
        ),

        CriminalHomicideQuizQuestion(
            question = "What is diminished responsibility?",
            options = mutableListOf(
                "A complete defence to murder",
                "A partial defence due to abnormal mental functioning",
                "A form of strict liability",
                "A defence based on recklessness"
            ),
            correctAnswer = "A partial defence due to abnormal mental functioning",
            explanation = "Diminished responsibility is a partial defence, which applies if the defendant was suffering from abnormal mental functioning at the time of the killing."
        ),
        CriminalHomicideQuizQuestion(
            question = "What is required for the loss of self-control defence to succeed?",
            options = mutableListOf(
                "A sudden and temporary loss of control",
                "Any loss of temper",
                "A qualifying trigger and a reasonable reaction from a person of D’s age and sex",
                "A well-planned reaction to provocation"
            ),
            correctAnswer = "A qualifying trigger and a reasonable reaction from a person of D’s age and sex",
            explanation = "The loss of self-control defence requires a qualifying trigger and a reaction that would be expected from someone of the defendant's age and sex."
        ),

        CriminalHomicideQuizQuestion(
            question = "Which of the following cannot be a qualifying trigger for loss of self-control?",
            options = mutableListOf(
                "Fear of serious violence",
                "Being insulted in an extremely grave manner",
                "Sexual infidelity on its own",
                "A serious threat to family members"
            ),
            correctAnswer = "Sexual infidelity on its own",
            explanation = "Sexual infidelity on its own cannot be a qualifying trigger, though it may be considered if it is part of a wider context."
        ),

        CriminalHomicideQuizQuestion(
            question = "What is oblique intention in murder cases?",
            options = mutableListOf(
                "Direct aim to cause death",
                "Intention to harm with no regard for consequences",
                "Foreseeing death or serious injury as virtually certain",
                "Acting in reckless disregard for life"
            ),
            correctAnswer = "Foreseeing death or serious injury as virtually certain",
            explanation = "Oblique intention occurs when the defendant foresees death or serious injury as a virtually certain result of their actions."
        ),

        CriminalHomicideQuizQuestion(
            question = "In diminished responsibility, what must the abnormality of mental functioning arise from?",
            options = mutableListOf(
                "Any form of intoxication",
                "Any stress or pressure",
                "A recognised medical condition",
                "A temporary emotional state"
            ),
            correctAnswer = "A recognised medical condition",
            explanation = "The abnormality of mental functioning must arise from a recognised medical condition for the defence of diminished responsibility to apply."
        ),

        CriminalHomicideQuizQuestion(
            question = "Which law governs the partial defence of diminished responsibility in the UK?",
            options = mutableListOf(
                "Homicide Act 1957",
                "Criminal Justice Act 2003",
                "Coroners and Justice Act 2009",
                "Offences Against the Person Act 1861"
            ),
            correctAnswer = "Coroners and Justice Act 2009",
            explanation = "The Coroners and Justice Act 2009 reformed the partial defence of diminished responsibility."
        ),
        CriminalHomicideQuizQuestion(
            question = "In which case was it ruled that an abnormality of mental functioning does not need to be the sole cause of the killing?",
            options = mutableListOf(
                "R v Dietschmann",
                "R v Vickers",
                "R v Woollin",
                "R v Ahluwalia"
            ),
            correctAnswer = "R v Dietschmann",
            explanation = "In R v Dietschmann, the court ruled that the abnormality of mental functioning does not need to be the sole cause, as long as it provides an explanation for the killing."
        ),

        CriminalHomicideQuizQuestion(
            question = "How does the case of R v Clinton affect the sexual infidelity exclusion in loss of self-control?",
            options = mutableListOf(
                "It reinforces the exclusion of sexual infidelity as a trigger.",
                "It allows sexual infidelity to be considered if part of a wider context.",
                "It abolishes the exclusion of sexual infidelity as a trigger.",
                "It limits the application of the loss of self-control defence."
            ),
            correctAnswer = "It allows sexual infidelity to be considered if part of a wider context.",
            explanation = "R v Clinton allows sexual infidelity to be considered if it is part of a wider context, but not as a sole trigger."
        ),

        CriminalHomicideQuizQuestion(
            question = "What is the key difference between murder and voluntary manslaughter?",
            options = mutableListOf(
                "Voluntary manslaughter requires no intention to kill.",
                "Voluntary manslaughter is reduced from murder due to partial defences.",
                "Murder involves only reckless killings.",
                "Murder and manslaughter have different actus reus."
            ),
            correctAnswer = "Voluntary manslaughter is reduced from murder due to partial defences.",
            explanation = "Voluntary manslaughter is reduced from murder when partial defences like loss of self-control or diminished responsibility apply."
        ),

        CriminalHomicideQuizQuestion(
            question = "What must the jury consider when deciding whether a loss of self-control is justified?",
            options = mutableListOf(
                "The defendant’s subjective feelings alone",
                "The reaction of a reasonable person with D's age and sex",
                "The defendant’s motives for the killing",
                "Whether the defendant acted immediately after provocation"
            ),
            correctAnswer = "The reaction of a reasonable person with D's age and sex",
            explanation = "The jury must consider whether a person of the defendant’s age and sex, with a normal level of tolerance, would have reacted similarly."
        ),

        CriminalHomicideQuizQuestion(
            question = "What is required for the mental abnormality in diminished responsibility to substantially impair?",
            options = mutableListOf(
                "Ability to distinguish right from wrong",
                "Ability to understand the nature of the act, form rational judgment, or exercise self-control",
                "Ability to feel remorse",
                "The moral justification of the act"
            ),
            correctAnswer = "Ability to understand the nature of the act, form rational judgment, or exercise self-control",
            explanation = "For diminished responsibility to succeed, the abnormality must substantially impair D’s ability to understand their actions, form rational judgment, or exercise self-control."
        ),

        // Add the rest of your questions here...
    )
}
