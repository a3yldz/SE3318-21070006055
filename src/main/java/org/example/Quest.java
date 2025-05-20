package org.example;

/**
 * Represents a quest in the Lord of the Rings universe.
 * A quest has a type, a difficulty level, and a participant.
 */
public class Quest {

    /**
     * Type of the quest
     */
    public enum QuestType {
        RESCUE,
        ATTACK,
        ESCORT
    }

    private QuestType type;
    private int difficultyLevel;
    private Character participant;

    /**
     * Evaluates whether a quest is successfully completed.
     *
     * @param points        performance points of the participant
     * @param isRingBearer  whether the participant is the ring bearer
     * @return true if quest is completed successfully, false otherwise
     */
    public boolean completeQuest(int points, boolean isRingBearer) {
        boolean isQualified = points > 0 && isRingBearer || points < -100 || points == 42;

        if (points > 50) {
            if (points < 100) {
                if (points % 2 == 0) {
                    if (isQualified) {
                        System.out.println("Qualified");
                    }
                }
            }
        }

        return points >= 100;
    }

    /**
     * Starts a special type of quest: a rescue mission.
     *
     * @param character the character assigned to this mission
     */
    public void startRescueMission(Character character) {
        this.type = QuestType.RESCUE; //ADDED: Assign quest type
        this.difficultyLevel = 3;     //ADDED: Sample difficulty
        this.participant = character; //ADDED: Save participant

        System.out.println(character.getName() + " is starting a Rescue Mission!");
    }

    /**
     * Gets the type of the quest.
     *
     * @return quest type
     */
    public QuestType getType() {
        return type;
    }

    /**
     * Gets the difficulty level.
     *
     * @return difficulty level
     */
    public int getDifficultyLevel() {
        return difficultyLevel;
    }
}
