package Interfaces;

import Classes.Actor;

import java.util.List;

public interface iMarketBehaviour {
    public void acceptToMarket(Actor actor);
    public void releseFromMarket(List<Actor> actors);
    public void update();
}
