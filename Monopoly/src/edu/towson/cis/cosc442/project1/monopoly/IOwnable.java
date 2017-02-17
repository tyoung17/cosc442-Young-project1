package edu.towson.cis.cosc442.project1.monopoly;

public interface IOwnable {

	String getName();

	Player getTheOwner();

	int getPrice();

	boolean isAvailable();

	Boolean playAction(String msg);

	void setAvailable(boolean available);

	void setTheOwner(Player owner);

	String toString();

}