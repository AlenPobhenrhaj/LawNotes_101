package com.example.lawnotes10v.data.criminal.actus_reus

data class CriminalActusReusQuizQuestion(
    val question: String,
    val options: MutableList<String>, // Mutable to shuffle later
    val correctAnswer: String,
    val explanation: String
)

object QuizRepository {
    val quizQuestions = mutableListOf(
        CriminalActusReusQuizQuestion(
            question = "What is the term Actus Reus commonly referred to as?",
            options = mutableListOf(
                "Guilty mind",
                "Prohibited conduct",
                "Negligence",
                "Self-defense"
            ),
            correctAnswer = "Prohibited conduct",
            explanation = "Actus Reus refers to the conduct element of a crime, which is the prohibited act."

        ),
        CriminalActusReusQuizQuestion(
            question = "Which of the following is NOT a component of Actus Reus?",
            options = mutableListOf(
                "The act",
                "The mental state of the defendant",
                "The result caused by the act",
                "The circumstances of the act"
            ),
            correctAnswer = "The mental state of the defendant",
            explanation = "The mental state is related to Mens Rea, not Actus Reus."

        ),
        CriminalActusReusQuizQuestion(
            question = "Actus reus refers to:",
            options = mutableListOf(
                "The guilty mind",
                "The criminal act",
                "The legal duty",
            ),
            correctAnswer = "The criminal act",
            explanation = "Actus reus is the physical act of committing a crime, a fundamental component of criminal liability."
        ),
        CriminalActusReusQuizQuestion(
            question = "Mens rea is:",
            options = mutableListOf(
                "A strict liability",
                "A defense mechanism",
                "The mental state of committing a crime",
            ),
            correctAnswer = "The mental state of committing a crime",
            explanation = " Mens rea refers to the mental state or 'guilty mind' behind the commission of a criminal act."
        ),
        CriminalActusReusQuizQuestion(
            question = "Which of the following crimes is an example of a conduct crime?",
            options = mutableListOf(
                "Murder",
                "Manslaughter",
                "Possession of drugs",
                "Assault causing injury"
            ),
            correctAnswer = "Possession of drugs",
            explanation = "Conduct crimes require only that a prohibited act occurs, without the need for a result."

        ),
        CriminalActusReusQuizQuestion(
            question = "Which of the following is a principle of Civil Law?",
            options = mutableListOf(
                "Punishment of the wrongdoer",
                "Compensation to the victim",
                "Protection of state interests",
            ),
            correctAnswer = "Compensation to the victim",
            explanation = "Civil Law deals with compensating the victim for losses suffered due to the defendant's actions."
        ),
        CriminalActusReusQuizQuestion(
            question = "In criminal law, what must generally be proven alongside Actus Reus to establish liability?",
            options = mutableListOf(
                "Mens Rea",
                "Negligence",
                "Recklessness",
                "Ignorance of the law"
            ),
            correctAnswer = "Mens Rea",
            explanation = "Both Actus Reus (the act) and Mens Rea (the mental state) must be proven for criminal liability."

        ),
        CriminalActusReusQuizQuestion(
            question = "A strict liability offense:",
            options = mutableListOf(
                "Requires proof of mens rea",
                "Is based solely on the actus reus",
                "Can only be committed by adults",
            ),
            correctAnswer = "Is based solely on the actus reus",
            explanation = "In strict liability offenses, the defendant can be liable for the mere act of committing the offense, without the prosecution needing to prove intent or mens rea."
        ),
        CriminalActusReusQuizQuestion(
            question = "If a defendant believed they possessed something different than what was found, they:",
            options = mutableListOf(
                "Cannot be found guilty",
                "Can be found guilty of possession",
                "Are only guilty if they intended harm",
            ),
            correctAnswer = "Can be found guilty of possession",
            explanation = "A mistake of fact is generally not a defense to possession if the item possessed is illegal."
        ),
        CriminalActusReusQuizQuestion(
            question = "Which of the following is true about omission liability?",
            options = mutableListOf(
                "It is always punishable",
                "It requires a legal duty to act",
                "It refers to mental state crimes",
            ),
            correctAnswer = "It requires a legal duty to act",
            explanation = "Liability for omission stems from failing to act when there is a legal obligation to do so."
        ),
        CriminalActusReusQuizQuestion(
            question = "In result crimes, what must the prosecution establish?",
            options = mutableListOf(
                "Mens rea only",
                "Actus reus only",
                "Causation",
            ),
            correctAnswer = "Causation",
            explanation = "The prosecution must show a causal link between the defendant's act and the prohibited result."
        ),
        CriminalActusReusQuizQuestion(
            question = "The case R v Cunningham is significant for establishing:",
            options = mutableListOf(
                "Intention as a form of mens rea",
                "Recklessness as a form of mens rea",
                "Strict liability",
            ),
            correctAnswer = "Recklessness as a form of mens rea",
            explanation = "The case clarified the mens rea of recklessness, which involves a conscious disregard of a substantial and unjustifiable risk."
        ),
        CriminalActusReusQuizQuestion(
            question = "Status crimes are:",
            options = mutableListOf(
                "Always strict liability offenses",
                "Based on the defendant being in a certain situation",
                "Crimes that require proof of actus reus and mens rea",
            ),
            correctAnswer = "Based on the defendant being in a certain situation",
            explanation = "Status crimes involve criminal liability for being in a situation deemed illegal, regardless of conduct or intent."
        ),
        CriminalActusReusQuizQuestion(
            question = "Automatism can negate:",
            options = mutableListOf(
                "Only actus reus",
                "Only mens rea",
                "Both actus reus and mens rea",
            ),
            correctAnswer = "Both actus reus and mens rea",
            explanation = "Automatism, as a defense, suggests the defendant was not in control of their actions, negating both the physical act and the intent."
        ),
        CriminalActusReusQuizQuestion(
            question = "R v Larsonneur illustrates situational liability because:",
            options = mutableListOf(
                "The defendant voluntarily committed a crime",
                "The defendant was in an unlawful situation regardless of intent",
                "The defendant used automatism as a defense",
            ),
            correctAnswer = "The defendant was in an unlawful situation regardless of intent",
            explanation = "The defendant was criminally liable simply for being in a certain situation, which is the essence of situational liability."
        ),
        CriminalActusReusQuizQuestion(
            question = "In result crimes, the principle of causation requires:",
            options = mutableListOf(
                "An indirect cause of the result",
                "A direct cause of the result without any intervening cause",
                "A demonstration of negligence",
            ),
            correctAnswer = "A direct cause of the result without any intervening cause",
            explanation = "Causation must be direct, with the defendant's actions leading to the result without being broken by any intervening events."
        ),
        CriminalActusReusQuizQuestion(
            question = "What does Actus Reus encompass in criminal law?",
            options = mutableListOf(
                "Only the mental state of the defendant",
                "The conduct element of an offence, including prohibited acts or omissions",
                "The verdict of the jury",
            ),
            correctAnswer = "The conduct element of an offence, including prohibited acts or omissions",
            explanation = "Actus Reus refers to the physical element of a crime, which can be an action, lack of action (when there's a legal duty to act), or a situation. It does not involve the mental state of the defendant, which is covered by Mens Rea, nor is it related to the jury's verdict."
        ),
        CriminalActusReusQuizQuestion(
            question = "When can an omission be considered as Actus Reus?",
            options = mutableListOf(
                "When the defendant has a hobby of collecting rare items",
                "Only in cases of theft",
                "When the defendant fails to act where there is a legal duty to do so",
            ),
            correctAnswer = "When the defendant fails to act where there is a legal duty to do so",
            explanation = "An omission can be considered as Actus Reus only when the defendant has a specific legal duty to act but fails to do so. Without such a duty, the failure to act does not constitute the physical element of a crime."
        ),
        CriminalActusReusQuizQuestion(
            question = "Which of the following accurately describes a continuing act?",
            options = mutableListOf(
                "An act that occurs repeatedly",
                "An act that begins innocently but becomes criminal when the offender becomes aware of it",
                "A crime that requires multiple actions to be completed",
                "A crime where the defendant continues acting even after being caught"
            ),
            correctAnswer = "An act that begins innocently but becomes criminal when the offender becomes aware of it",
            explanation = "A continuing act involves a situation where the act starts unintentionally but becomes criminal once the individual is aware of the harm and does not stop."

        ),
        CriminalActusReusQuizQuestion(
            question = "What is an example of a statutory duty to act?",
            options = mutableListOf(
                "Duty to watch television for at least 2 hours a day",
                "Duty of a driver to provide a breath sample when asked by the police",
                "Duty to sing the national anthem every morning",
            ),
            correctAnswer = "Duty of a driver to provide a breath sample when asked by the police",
            explanation = "Statutory duties are specific obligations imposed by law. The requirement for drivers to provide a breath sample, as mandated by the Road Traffic Act 1988, is an example of such a duty, where failure to comply can constitute Actus Reus."
        ),
        CriminalActusReusQuizQuestion(
            question = "How can contractual duty lead to Actus Reus?",
            options = mutableListOf(
                "By failing to watch enough sports",
                "If someone fails to fulfill a contractual obligation that results in harm",
                "By not following fashion trends",
            ),
            correctAnswer = "If someone fails to fulfill a contractual obligation that results in harm",
            explanation = "Contractual duties bind individuals to certain actions. When someone fails to fulfill these obligations, and that failure results in harm, it can lead to criminal liability. For instance, a gatekeeper not closing a gate as required by their job contract, leading to a fatal accident, would be held criminally liable."
        ),
        CriminalActusReusQuizQuestion(
            question = "What constitutes a voluntarily assumed duty?",
            options = mutableListOf(
                "Signing up for a library card",
                "A voluntary assumption of responsibility for another's care",
                "Choosing a favorite ice cream flavor",
            ),
            correctAnswer = "A voluntary assumption of responsibility for another's care",
            explanation = "Voluntarily assuming responsibility for someone's care creates a legal duty to act in their best interest. Failure to fulfill this duty, especially in situations where the dependent person is harmed due to negligence or inaction, constitutes Actus Reus."
        ),
        CriminalActusReusQuizQuestion(
            question = "Case Study - R v Miller (1983)\n\nWhat principle was established in R v Miller (1983) regarding Actus Reus and omissions?",
            options = mutableListOf(
                "That a person cannot be held liable for accidental actions",
                "That failing to act after creating a dangerous situation can constitute Actus Reus",
                "That arson can only be committed intentionally",
            ),
            correctAnswer = "That failing to act after creating a dangerous situation can constitute Actus Reus",
            explanation = "R v Miller established that a person who creates a dangerous situation (even accidentally) and then fails to take reasonable steps to rectify it can be held criminally liable for the resulting harm, as their omission to act constitutes Actus Reus."
        ),
        CriminalActusReusQuizQuestion(
            question = "Continuing act\n\nWhat does the case of Fagan v Metropolitan Police Commissioner demonstrate about continuing acts?",
            options = mutableListOf(
                "That an act can be considered continuous if the defendant maintains a harmful situation",
                "That parking a car is always considered a criminal act",
                "That police officers' feet have special legal protection",
            ),
            correctAnswer = "That an act can be considered continuous if the defendant maintains a harmful situation",
            explanation = "In Fagan, the defendant's continued inaction after accidentally causing harm was treated as a continuous act, illustrating that the maintenance of a harmful situation can be considered a single, ongoing Actus Reus."
        ),
        CriminalActusReusQuizQuestion(
            question = "Medical Law - Airedale NHS Trust v Bland (1993)\n\nWhat was the ruling in Airedale NHS Trust v Bland regarding life-sustaining treatment?",
            options = mutableListOf(
                "That doctors must always use every means possible to prolong life",
                "That treatment can never be withdrawn",
                "That it's lawful to discontinue life-sustaining treatment when it offers no benefit",
            ),
            correctAnswer = "That it's lawful to discontinue life-sustaining treatment when it offers no benefit",
            explanation = "Airedale NHS Trust v Bland established that discontinuing life-sustaining treatment is lawful when the treatment provides no benefit to the patient, respecting principles of patient autonomy and best interest."
        ),
        CriminalActusReusQuizQuestion(
            question = "How is the distinction between acts and omissions relevant in medical contexts, particularly in cases like Airedale NHS Trust v Bland?",
            options = mutableListOf(
                "It determines the color of hospital walls",
                "It impacts the legality of withholding or withdrawing treatment",
                "It decides what food is served in hospitals",
            ),
            correctAnswer = " It impacts the legality of withholding or withdrawing treatment",
            explanation = "The distinction between acts and omissions is crucial in medical law, particularly regarding the legality of withholding or withdrawing life-sustaining treatment. This distinction influences whether such actions are considered lawful omissions or potentially unlawful acts."
        ),
        // Add the rest of your questions here...
    )
}
