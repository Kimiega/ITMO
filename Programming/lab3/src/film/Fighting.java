package film;

import util.StoryThing;

public interface Fighting {
    void setFighting(StoryThing opponent);
    void setOffFighting();
    boolean isFighting();
    StoryThing isFollowingFor();
}
