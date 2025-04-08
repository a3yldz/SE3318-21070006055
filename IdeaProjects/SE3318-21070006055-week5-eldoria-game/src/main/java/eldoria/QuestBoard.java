package eldoria;

public class QuestBoard {

    public void assignQuest(Character character, String questName) {
        if (character instanceof Questable) {
            Questable questable = (Questable) character;
            questable.acceptQuest(questName);
        } else {
            System.out.println(character.getName() + " cannot accept quests.");
        }
    }
}
