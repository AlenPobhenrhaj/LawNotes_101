package com.example.lawnotes10v.data.criminal.causation

data class CriminalFlashCardChapter3(val title: String, val content: String)

object FlashCardChapter3 {
    val flashCardsChapter3Data = listOf(
        CriminalFlashCardChapter3(
            "1. What is the but-for test in factual causation?",
            "The but-for test asks whether the result would have happened if the defendant had not done something. If the answer is no, then they caused the result."
        ),

        CriminalFlashCardChapter3(
            "2. What is the egg-shell skull rule?",
            "The egg-shell skull rule means that the defendant must take the victim as they find them. If the victim has a weakness or condition, the defendant is still responsible if their actions cause harm."
        ),

        CriminalFlashCardChapter3(
            "3. What breaks the chain of causation?",
            "The chain of causation can be broken by something called a novus actus interveniens. This is a new act or event that is independent of the defendant’s actions and is the real cause of harm."
        ),

        CriminalFlashCardChapter3(
            "4. What is legal causation?",
            "Legal causation looks at whether the defendant’s actions were the main cause of the result. The defendant’s actions must have been an important factor in causing the harm."
        ),

        CriminalFlashCardChapter3(
            "5. What is factual causation?",
            "Factual causation is about whether the result would have happened ‘but for’ the defendant’s actions. If the result would have happened anyway, the defendant is not responsible."
        ),

        CriminalFlashCardChapter3(
            "6. What is a novus actus interveniens?",
            "A novus actus interveniens is a new act that breaks the chain of causation. This means the defendant is no longer responsible for the result."
        ),

        CriminalFlashCardChapter3(
            "7. What is an example of factual causation from case law?",
            "In R v White, the defendant put poison in his mother’s drink, but she died of a heart attack before drinking it. His act did not cause her death, so he wasn’t guilty of murder."
        ),

        CriminalFlashCardChapter3(
            "8. How does the case of Blaue relate to causation?",
            "In R v Blaue, the victim refused a life-saving blood transfusion due to her religious beliefs. The defendant was still held responsible for her death because the stab wound caused it."
        ),

        // Add more FlashCard instances...
    )
}

