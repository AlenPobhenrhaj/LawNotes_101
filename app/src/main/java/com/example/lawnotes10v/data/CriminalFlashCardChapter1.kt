package com.example.lawnotes10v.data

data class CriminalFlashCardChapter1(val title: String, val content: String)

object FlashCardChapter1 {
    val flashCardsChapter1Data = listOf(
        CriminalFlashCardChapter1("1. Criminal Law vs. Civil Law", "Criminal Law: Aimed at controlling behaviors; the state prosecutes and can imprison.\n\nCivil Law: Concerned with compensating victims; involves personal action, no prosecution."),
        CriminalFlashCardChapter1("2. Elements of Criminal Offences", "Need both actus reus (criminal act) and mens rea (guilty mind) for a crime."),
        CriminalFlashCardChapter1("3. Actus Reus and Mens Rea", "Actus reus: The act itself.\n\nMens rea: The intent or knowledge of wrongdoing."),
        CriminalFlashCardChapter1("4. Defining a Criminal Offence", "Must be statutory or at common law; most now have no actual legislation."),
        CriminalFlashCardChapter1("5. Burden of Proof", "The prosecution must prove beyond a reasonable doubt that the defendant committed the crime with both actus reus and mens rea."),
        CriminalFlashCardChapter1("6. Criminal Trials", "Basic understanding of trial procedures is essential, even if not covered in the course."),
        CriminalFlashCardChapter1("7. Appeals Process", "From Magistrate’s Court to Crown Court, then to Court of Appeal, and possibly the Supreme Court."),
        CriminalFlashCardChapter1("8. Who can Commit a Crime?", "Legal capacity is required; age and mental state are factors."),
        CriminalFlashCardChapter1("9. Actus Reus Details", "Can be a voluntary act, omission, or a state of affairs."),
        CriminalFlashCardChapter1("10. Mens Rea", "Intent, recklessness, or negligence that constitutes the mental state of the offence."),
        CriminalFlashCardChapter1("11. Types of Mens Rea\n", "Intention, recklessness, and negligence."),
        CriminalFlashCardChapter1("12. Proof Requirements", "Both actus reus and mens rea must be proven unless it's a strict liability offence."),
        CriminalFlashCardChapter1("13. Automatism as a Defence", "Acts done while unconscious or without voluntary control can negate liability."),
        CriminalFlashCardChapter1("14. Omission Liability", "Failure to act can constitute actus reus if there is a legal duty to act."),
        CriminalFlashCardChapter1("15. Result Crimes", "Defendant must cause the prohibited outcome (e.g., death in homicide)."),
        CriminalFlashCardChapter1("16. Situational Liability", "Being in a certain state of affairs (e.g., possession of drugs) can constitute an offence."),
        CriminalFlashCardChapter1("17. Strict Liability Example", "Selling alcohol to minors is an offence regardless of intent or knowledge."),
        // Add more FlashCard instances...
    )
}

