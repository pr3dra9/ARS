package rs.fon.ars.factory;

import rs.fon.ars.Event;

import java.sql.Date;

public class EventFactory {
    static Event createEvent(int id, int budget, String name, String description, Date endDate){
        return new Event(id, budget, name, description, new Date(System.currentTimeMillis()), endDate);
    }
}
