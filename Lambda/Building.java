import java.util.*;

public class Building{

	public String address;
	public String name;
	public ArrayList<Room> roomList;

    //inner class
	public class Room{

		int squareFeet;
	
		public Room(int squareFeet){
            this.squareFeet = squareFeet;
		}
	
	    public String toString(){
	        return "" + squareFeet;
	    }
	
	}
    
    //constructor
    public Building(String address, String name, int[] squareFeetList){
    
        this.address = address;
        this.name = name;
        roomList = new ArrayList<Room>();
        
        for (int i=0; i<squareFeetList.length; i++){
        
            Room r = new Room(squareFeetList[i]);
            roomList.add(r);
        
        }
    
    }
    
	public ArrayList<Room> orderRoomsBySpace(){
	
	    //method local inner class
		class RoomComparator implements Comparator<Room>{
			public int compare(Room a, Room b){
                return a.squareFeet - b.squareFeet;
			}
		}
	    Collections.sort(this.roomList, new RoomComparator());	    
	    return roomList;

	}
  
    
    public static void main(String args[])
    {
        int[] temp = new int[3];
        temp[0] = 23;
        temp[1] = 15;
        temp[2] = 777;
    
        Building b = new Building("123 Fake St", "Observatory", temp);
        
        for (Room r: b.roomList){
            System.out.println(r);
        }
        
        //23
        //15
        //777
        
        System.out.println("-------");
        
        b.orderRoomsBySpace();
        
        for (Room r: b.roomList){
            System.out.println(r);
        }
        
        //15
        //23
        //777
        
        
    }
    



}
