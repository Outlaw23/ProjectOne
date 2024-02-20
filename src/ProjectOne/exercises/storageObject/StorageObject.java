package ProjectOne.exercises.storageObject;

import ProjectOne.attribute.buildings.Rooms;
import ProjectOne.attribute.emotion.Couple;
import ProjectOne.attribute.emotion.Standards;
import ProjectOne.attribute.groups.People;

public class StorageObject {
	String message = "";

	// rooms of the student house
	Rooms kitchen = new Rooms("kitchen", 40);
	Rooms livingRoom = new Rooms("living room", 130);
	Rooms bedroomForLisaAndDerik = new Rooms("bedroom", 90);
	Rooms bedroomForNaomie = new Rooms("bedroom", 70);
	Rooms bedroomForArjo = new Rooms("bedroom", 70);
	Rooms bedroomForLinda = new Rooms("bedroom", 60);
	
	// the People
	People lisa = new People("Lisa", 21, true, false);
	People derik = new People("Derik", 19, false, true);
	People naomie = new People("Noamie", 23, true, false);
	People arjo = new People("Arjo", 22, false, true);
	People linda = new People("Linda", 20, true, false);

	// in relationship or single
	Couple Lisa = new Couple(true, "Derik", 4);
	Couple Derik = new Couple(true, "Lisa", 4);
	Couple Naomie = new Couple(false, "no one", 0);
	Couple Arjo = new Couple(false, "no one", 0);
	Couple Linda = new Couple(false, "no one", 0);

	// the people standrards
	Standards lisaStandards = new Standards(3);
	Standards DerikStandards = new Standards(2);
	Standards naomieStandards = new Standards(0);
	Standards arjoStandards = new Standards(0);
	Standards lindaStandards = new Standards(0);
}
