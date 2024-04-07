package com.example.lawnotes10v.data

data class CriminalFlashCardCasesChapter1(val title: String, val content: String)
object FlashCardCasesChapter1 {
    val flashCardsChapter1Data = listOf(
        CriminalFlashCardCasesChapter1(
            "1. Introduction to Actus Reus",
            "Actus Reus refers to the conduct element of an offence, which can include a prohibited act or omission, the circumstances, and/or the result caused by the defendant's actions.\n\n" + "Mens Rea, the mental element, involves the defendant's state of mind, such as intention, recklessness, or negligence."
        ),
        CriminalFlashCardCasesChapter1(
            "2. Voluntary Act Requirement",
            "Most offences require a voluntary act by the defendant, but there are exceptions where omissions or states of affairs can constitute the Actus Reus."
        ),
        CriminalFlashCardCasesChapter1(
            "3. Omissions as Actus Reus",
            "Generally, a person is not liable for failing to act unless there is a specific duty to act.\n\n" + "R v Ahmad (1986): Failure to carry out house alterations by a landlord did not constitute \"doing acts\" required for a conviction under the Protection from Eviction Act 1977."
        ),
        CriminalFlashCardCasesChapter1("Duties to Act", ""),
        CriminalFlashCardCasesChapter1(
            "a. Statutory Duties:",
            "Example: Road Traffic Act 1988 requires drivers to provide breath samples to police when requested."
        ),
        CriminalFlashCardCasesChapter1(
            "b. Duty of Law Enforcement",
            "R v Dytham (1979):\n\n A police officer was found liable for failing to protect a citizen being attacked."
        ),
        CriminalFlashCardCasesChapter1(
            "c. Contractual Duties",
            "R v Pittwood (1902):\n\n A railway gatekeeper failed to close a gate, leading to a fatal accident. Held liable for manslaughter."
        ),
        CriminalFlashCardCasesChapter1(
            "d. Voluntarily Assumed Duties",
            "R v Gibbins and Proctor (1919):\n\n Parents found guilty of murder for starving a child.\n\n" + "R v Stone and Dobinson (1977):\n\n Siblings found guilty of manslaughter for failing to care for a dependent relative."
        ),
        CriminalFlashCardCasesChapter1(
            "e. Ownership or Control of Property",
            "Owners must prevent crimes committed with their property when present."
        ),
        CriminalFlashCardCasesChapter1(
            "f. Continuing Acts",
            "Fagan v Metropolitan Police Commissioner (1969):\n\n Continuing to park a car on a police officer's foot was a continuous act constituting battery."
        ),
        CriminalFlashCardCasesChapter1(
            "4. Creating Dangerous Circumstances",
            "R v Miller (1983):\n\n A person who inadvertently starts a fire and fails to take action to extinguish it can be held liable for arson, as the omission to act after creating a dangerous situation constitutes Actus Reus."
        ),
        CriminalFlashCardCasesChapter1(
            "5. Medical Law and Actus Reus",
            "Airedale NHS Trust v Bland (1993):\n\n Withdrawing life-sustaining treatment from a patient in a permanent vegetative state was deemed lawful when the treatment offers no benefit, emphasizing the principles of patient autonomy and best interest."
        ),
        CriminalFlashCardCasesChapter1(
            "6. Distinguishing Acts from Omissions",
            "The distinction is crucial in medical contexts, such as deciding whether discontinuing life support is an act or an omission. It has significant legal implications, particularly regarding the legality of withholding or withdrawing treatment."
        ),
        // Add more FlashCard instances...
    )
}