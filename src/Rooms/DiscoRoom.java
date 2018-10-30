package Rooms;

import People.Person;

public class DiscoRoom extends Room
{
    public DiscoRoom(int x, int y)
    {
        super(x, y);
    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Yay! You find an awesome disco room. ");
    }
}
