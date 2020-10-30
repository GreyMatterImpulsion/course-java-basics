package com.rakovets.course.javabasics.practice.jcf.list;

import java.util.ArrayList;
import java.util.Comparator;

public class Studio {

    private ArrayList<Actor> actors;

    public Studio(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public static class ActorFeeComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            return (int)(o2.getFee() - o1.getFee());
        }
    }

    public static class ActorLastNameComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }

    public static class ActorAgeComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }

    public static class ActorLastNameAndAgeComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            if (o1.getLastName().compareTo(o2.getLastName()) != 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return o1.getAge() - (o2.getAge());
            }
        }
    }

    public static class ActorFeeAndLastNameComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            if (o1.getFee() - (o2.getFee()) != 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        }
    }

    public void fire() {
        actors.sort(new ActorFeeComparator());
        actors.remove(0);
    }

    public String getAges() {
        String result = "";
        for (Actor actor : actors) {
            result += actor.getFirstName() + " ";
        }
        return result.trim();
    }

    public String getLastNames() {
        String result = "";
        for (Actor actor : actors) {
            result += actor.getLastName() + " ";
        }
        return result.trim();
    }

    public String getFees() {
        String result = "";
        for (Actor actor : actors) {
            result += actor.getFee() + " ";
        }
        return result.trim();
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }
}