package com.example.lawnotes10v.data.criminal.causation

data class CriminalFlashCardCasesChapter3(val title: String, val content: String)
object FlashCardCasesChapter3 {
    val flashCardsChapter3Data = listOf(
        CriminalFlashCardCasesChapter3(
            "1. R v White (1910)",
            "Facts: The defendant put cyanide in his mother’s drink, intending to kill her. She died of a heart attack before drinking the poison.\n\n" +
                    "Held: The court held that the defendant was not guilty of murder because his actions did not cause her death. However, he was convicted of attempted murder."
        ),

        CriminalFlashCardCasesChapter3(
            "2. R v Blaue (1975)",
            "Facts: The defendant stabbed a woman who refused a blood transfusion due to her religious beliefs. She later died from her injuries.\n\n" +
                    "Held: The court held that the defendant must take his victim as he finds them, including their religious beliefs. The refusal of the transfusion did not break the chain of causation."
        ),

        CriminalFlashCardCasesChapter3(
            "3. R v Pagett (1983)",
            "Facts: The defendant used his pregnant girlfriend as a human shield during a shootout with the police. The police shot and killed the girl.\n\n" +
                    "Held: The defendant was held responsible for her death as his actions had caused the situation that led to her being shot."
        ),

        CriminalFlashCardCasesChapter3(
            "4. R v Roberts (1971)",
            "Facts: A woman jumped out of a moving car to escape sexual advances by the defendant. She was injured as a result.\n\n" +
                    "Held: The court held that the defendant was responsible for her injuries as her actions were a foreseeable consequence of his behavior."
        ),

        CriminalFlashCardCasesChapter3(
            "5. R v Jordan (1956)",
            "Facts: The victim was stabbed and given medical treatment, which was inappropriate and caused his death.\n\n" +
                    "Held: The medical treatment was so bad that it broke the chain of causation, and the defendant was not held liable for the victim's death."
        ),

        CriminalFlashCardCasesChapter3(
            "6. R v Smith (1959)",
            "Facts: The defendant stabbed another soldier, and the victim received poor medical treatment, being dropped twice on the way to the hospital.\n\n" +
                    "Held: Despite the poor treatment, the stab wound was still an operating cause of death, so the defendant was convicted."
        ),

        CriminalFlashCardCasesChapter3(
            "7. R v Cheshire (1991)",
            "Facts: The victim was shot by the defendant and later died due to complications from a tracheotomy.\n\n" +
                    "Held: The court held that the defendant was still liable for the death, as the initial wound was still a significant cause."
        ),

        CriminalFlashCardCasesChapter3(
            "8. R v Kennedy (2007)",
            "Facts: The defendant prepared heroin and handed it to the victim, who self-administered it and later died.\n\n" +
                    "Held: The victim’s voluntary action in administering the drug broke the chain of causation, and the defendant was not liable for the death."
        ),

        CriminalFlashCardCasesChapter3(
            "9. R v Malcherek & Steel (1981)",
            "Facts: Both victims were placed on life support after being attacked by the defendants, and the doctors later switched off the machines.\n\n" +
                    "Held: The court held that the doctors' actions did not break the chain of causation because the victims were already brain dead when the machines were turned off."
        ),

        CriminalFlashCardCasesChapter3(
            "10. R v Mitchell (1983)",
            "Facts: The defendant punched a man in a post office queue, causing him to fall onto an elderly woman, who later died.\n\n" +
                    "Held: The defendant was convicted of manslaughter, as his unlawful act had caused the death, even though it was not directed at the victim."
        )

        // Add more FlashCard instances...
    )
}