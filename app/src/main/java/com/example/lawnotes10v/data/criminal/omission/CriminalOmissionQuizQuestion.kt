package com.example.lawnotes10v.data.criminal.omission

data class CriminalOmissionQuizQuestion(
    val question: String,
    val options: MutableList<String>, // Mutable to shuffle later
    val correctAnswer: String,
    val explanation: String
)

object QuizRepository {
    val quizQuestions = mutableListOf(
        CriminalOmissionQuizQuestion(
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

        CriminalOmissionQuizQuestion(
            question = "In which of the following situations could an omission lead to liability?",
            options = mutableListOf(
                "You see someone committing a crime and fail to report it",
                "You accidentally break a law",
                "You fail to act when you have a legal duty to do so",
                "You make a mistake of fact"
            ),
            correctAnswer = "You fail to act when you have a legal duty to do so",
            explanation = "Liability for omissions arises only when there is a legal duty to act."
        ),

        CriminalOmissionQuizQuestion(
            question = "Which of the following cases involves a contractual duty?",
            options = mutableListOf(
                "R v Gibbins and Proctor",
                "Fagan v MPC",
                "R v Pittwood",
                "R v Miller"
            ),
            correctAnswer = "R v Pittwood",
            explanation = "In R v Pittwood, the defendant had a contractual duty to close a railway gate, and his failure to do so led to liability."
        ),

        CriminalOmissionQuizQuestion(
            question = "Which case established that failure to stop a fire created by the defendant can result in liability?",
            options = mutableListOf(
                "R v Gibbins and Proctor",
                "Fagan v MPC",
                "R v Miller",
                "R v Dytham"
            ),
            correctAnswer = "R v Miller",
            explanation = "In R v Miller, the defendant was held liable for failing to take action after accidentally starting a fire."
        ),

        CriminalOmissionQuizQuestion(
            question = "What must generally be proven in addition to Actus Reus for criminal liability?",
            options = mutableListOf(
                "Omission",
                "Contract",
                "Mens Rea",
                "Causation"
            ),
            correctAnswer = "Mens Rea",
            explanation = "Both Actus Reus (the act) and Mens Rea (the mental state) must be proven for criminal liability."
        ),

        CriminalOmissionQuizQuestion(
            question = "Which of the following is an example of a voluntary assumption of duty?",
            options = mutableListOf(
                "A parent failing to feed their child",
                "A lifeguard ignoring a drowning swimmer",
                "A person caring for someone they volunteered to help",
                "A doctor refusing to treat a patient"
            ),
            correctAnswer = "A person caring for someone they volunteered to help",
            explanation = "A voluntary assumption of duty occurs when a person voluntarily takes responsibility for another's care."
        ),

        CriminalOmissionQuizQuestion(
            question = "What is the outcome in R v Dytham (1979)?",
            options = mutableListOf(
                "A police officer was convicted for failing to intervene in a public crime",
                "A driver was convicted for failing to stop after an accident",
                "A landlord was convicted for failing to repair a tenant's house",
                "A gatekeeper was convicted for failing to close a railway gate"
            ),
            correctAnswer = "A police officer was convicted for failing to intervene in a public crime",
            explanation = "In R v Dytham, the police officer was found liable for failing to act when he had a public duty to intervene."
        ),

        CriminalOmissionQuizQuestion(
            question = "Which of the following is a statutory duty?",
            options = mutableListOf(
                "A parent feeding their child",
                "A driver providing a breath sample when asked by police",
                "A person intervening in a fight",
                "A homeowner repairing their house"
            ),
            correctAnswer = "A driver providing a breath sample when asked by police",
            explanation = "This is a statutory duty under the Road Traffic Act 1988."
        ),

        CriminalOmissionQuizQuestion(
            question = "What kind of duty existed in R v Gibbins and Proctor (1918)?",
            options = mutableListOf(
                "Statutory duty",
                "Contractual duty",
                "Parental duty",
                "Public duty"
            ),
            correctAnswer = "Parental duty",
            explanation = "In R v Gibbins and Proctor, the defendants had a parental duty to care for their child."
        ),

        CriminalOmissionQuizQuestion(
            question = "What is the key element in omission liability?",
            options = mutableListOf(
                "A legal duty to act",
                "Motive",
                "Intent",
                "Proximity to the crime"
            ),
            correctAnswer = "A legal duty to act",
            explanation = "Omission liability requires that the defendant had a legal duty to act and failed to do so."
        ),
        CriminalOmissionQuizQuestion(
            question = "What does the case R v Miller (1983) illustrate about omissions?",
            options = mutableListOf(
                "Omissions can never lead to liability",
                "Failing to stop a dangerous situation created by the defendant can result in liability",
                "A failure to act is not punishable unless there is intent",
                "Omissions are only relevant in medical law"
            ),
            correctAnswer = "Failing to stop a dangerous situation created by the defendant can result in liability",
            explanation = "R v Miller established that failing to stop a dangerous situation, even if accidentally created, can result in liability."
        ),

        CriminalOmissionQuizQuestion(
            question = "Which case involves a continuing act?",
            options = mutableListOf(
                "Fagan v MPC",
                "R v Gibbins and Proctor",
                "R v Pittwood",
                "R v Ahmad"
            ),
            correctAnswer = "Fagan v MPC",
            explanation = "In Fagan v MPC, the court held that the defendant's failure to remove his car from the police officer’s foot was a continuing act."
        ),

        CriminalOmissionQuizQuestion(
            question = "What legal principle was established in Airedale NHS Trust v Bland (1993)?",
            options = mutableListOf(
                "Doctors must always try to save a life",
                "Withdrawing life support in cases with no benefit is lawful",
                "Euthanasia is legal",
                "Parental consent is needed to withdraw life support"
            ),
            correctAnswer = "Withdrawing life support in cases with no benefit is lawful",
            explanation = "Airedale NHS Trust v Bland held that withdrawing life-sustaining treatment when it provides no benefit is lawful."
        ),

        CriminalOmissionQuizQuestion(
            question = "Which case involved a parent and step-parent failing to feed a child, resulting in the child's death?",
            options = mutableListOf(
                "R v Gibbins and Proctor",
                "R v Pittwood",
                "Fagan v MPC",
                "R v Ahmad"
            ),
            correctAnswer = "R v Gibbins and Proctor",
            explanation = "In R v Gibbins and Proctor, the defendants were found guilty of murder for failing to feed a child."
        ),

        CriminalOmissionQuizQuestion(
            question = "In R v Ahmad (1986), why was the omission not held as an offence?",
            options = mutableListOf(
                "The defendant was not under a legal duty to act",
                "The omission was accidental",
                "The defendant had no contractual obligation",
                "The landlord-tenant relationship does not create liability"
            ),
            correctAnswer = "The defendant was not under a legal duty to act",
            explanation = "In R v Ahmad, the defendant’s failure to repair the tenant's property did not meet the legal definition of an 'act' required under the statute."
        ),
        CriminalOmissionQuizQuestion(
            question = "What must be proven in cases of gross negligence manslaughter involving an omission?",
            options = mutableListOf(
                "The omission must breach a duty of care and cause death",
                "The defendant intended to cause harm",
                "The defendant acted with recklessness",
                "There must be an ongoing contractual duty"
            ),
            correctAnswer = "The omission must breach a duty of care and cause death",
            explanation = "For gross negligence manslaughter, there must be a duty of care, a breach of that duty, and the breach must cause death."
        ),

        CriminalOmissionQuizQuestion(
            question = "Which of the following best describes the principle established in R v Stone and Dobinson (1977)?",
            options = mutableListOf(
                "A voluntary assumption of responsibility can create a duty of care",
                "A contract always creates a duty to act",
                "Police officers have no duty to intervene in private disputes",
                "Negligence is not sufficient for criminal liability"
            ),
            correctAnswer = "A voluntary assumption of responsibility can create a duty of care",
            explanation = "In R v Stone and Dobinson, the defendants were found guilty of manslaughter for failing to care for a sick relative, whom they had voluntarily taken responsibility for."
        ),

        CriminalOmissionQuizQuestion(
            question = "In which case did the defendant's failure to prevent illegal activities on his property lead to liability?",
            options = mutableListOf(
                "Tuck v Robson",
                "R v Miller",
                "R v Ahmad",
                "Fagan v MPC"
            ),
            correctAnswer = "Tuck v Robson",
            explanation = "In Tuck v Robson, the defendant was liable for failing to prevent illegal after-hours drinking on his premises."
        ),

        CriminalOmissionQuizQuestion(
            question = "Which of the following situations would likely NOT result in omission liability?",
            options = mutableListOf(
                "A police officer ignoring a crime in progress",
                "A parent failing to provide food for their child",
                "A bystander failing to stop a crime",
                "A contractual employee failing to perform safety duties"
            ),
            correctAnswer = "A bystander failing to stop a crime",
            explanation = "Generally, bystanders have no legal duty to intervene, so a bystander failing to stop a crime would not typically result in liability."
        ),

        CriminalOmissionQuizQuestion(
            question = "What is a 'duty of care' in the context of omissions?",
            options = mutableListOf(
                "A legal obligation to avoid causing harm",
                "A personal responsibility to protect loved ones",
                "A moral obligation to intervene in emergencies",
                "A law requiring all citizens to act in certain situations"
            ),
            correctAnswer = "A legal obligation to avoid causing harm",
            explanation = "A duty of care is a legal obligation requiring individuals to avoid actions or omissions that could harm others."
        ),
        // Add the rest of your questions here...
    )
}
