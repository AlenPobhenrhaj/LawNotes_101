package com.example.lawnotes10v.data.criminal.actus_reus

data class CriminalFlashCardCasesChapter1(val title: String, val content: String)
object FlashCardCasesChapter1 {
    val flashCardsChapter1Data = listOf(
        CriminalFlashCardCasesChapter1(
            "1. Fagan v Metropolitan Police Commissioner (1969)",
            "Facts: The defendant accidentally drove his car onto a police officer's foot. When the officer asked him to move the car, the defendant refused for some time, causing further harm.\n\n" +
                    "Held: The court held that this was a continuing act. The act started when the car drove onto the foot and continued as long as the car stayed there. The defendant was convicted because the act became criminal when he refused to move the car after realizing the harm."
        ),
        CriminalFlashCardCasesChapter1(
            "2. R v Miller (1983)",
            "Facts: The defendant accidentally started a fire by dropping a cigarette while drunk. After waking up and realizing the fire had started, he did nothing to stop it and moved to another room, causing further damage.\n\n" +
                    "Held: The court ruled that because the defendant created the dangerous situation, he was under a duty to prevent harm. His failure to act made him liable for arson."
        ),
        CriminalFlashCardCasesChapter1(
            "3. R v Pittwood (1902)",
            "Facts: The defendant, a railway gatekeeper, failed to close the gate, resulting in a train hitting a cart and killing a person.\n\n" +
                    "Held: The defendant was guilty of manslaughter as his contractual duty to close the gate was not fulfilled. This case demonstrates how Actus Reus can arise from a failure to act under a contractual duty."
        ),
        CriminalFlashCardCasesChapter1(
            "5. Airedale NHS Trust v Bland (1993)",
            "Facts: Bland was in a permanent vegetative state with no hope of recovery. The hospital sought legal permission to discontinue life-sustaining treatment.\n\n" +
                    "Held: The court held that discontinuing life support was lawful and considered an omission rather than an act of killing. Doctors are not under a duty to continue treatment that provides no benefit."
        ),
        CriminalFlashCardCasesChapter1(
            "6. R v Gibbins and Proctor (1918)",
            "Facts: Gibbins and Proctor starved Gibbins' child to death by failing to provide food.\n\n" +
                    "Held: They were guilty of murder because they had a legal duty to feed the child, and their omission caused her death."
        ),
        CriminalFlashCardCasesChapter1(
            "7. R v Dytham (1979)",
            "Facts: A police officer witnessed a man being beaten to death but did nothing to intervene or call for help.\n\n" +
                    "Held: The officer was convicted of misconduct in public office because his failure to act was a breach of duty."
        ),
        CriminalFlashCardCasesChapter1(
            "8. R v Ahmad (1986)",
            "Facts: Ahmad, a landlord, failed to carry out repairs to a tenant’s property, leaving it in poor condition.\n\n" +
                    "Held: The court ruled that this omission did not constitute the act required under the Protection from Eviction Act 1977."
        ),
        CriminalFlashCardCasesChapter1(
            "9. Tuck v Robson (1970)",
            "Facts: The defendant, a pub owner, allowed customers to continue drinking after hours on his premises.\n\n" +
                    "Held: The defendant was liable for failing to prevent the crime of illegal drinking on his property, as he had control over the premises."
        ),
        CriminalFlashCardCasesChapter1(
            "10. Road Traffic Act 1988, Section 6",
            "Key Point: This statute imposes a statutory duty on drivers to provide a breath sample when asked by the police. Failure to comply results in criminal liability."
        ),
        CriminalFlashCardCasesChapter1(
            "11. Domestic Violence, Crime and Victims Act 2004, Section 5",
            "Key Point: This statute created an offense of causing or allowing the death of a child or vulnerable adult by failing to act when there is a duty to do so."
        ),
        // Add more FlashCard instances...
    )
}