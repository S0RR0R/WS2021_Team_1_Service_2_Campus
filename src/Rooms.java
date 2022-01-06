import java.lang.String;
import java.util.Scanner;

    public class rooms {

        public static String roomCategoryHolder;
        public static String facultyHolder;
        public static int houseNumberHolder;
        public static int roomFloorHolder;
        public static int roomNumberHolder;
        public static int n;

        
        public static void Room() {
            String roomAddressName = (houseNumberHolder + "." + roomFloorHolder + "." + roomNumberHolder);

            int houseNumber = n;                                                                                          //declaration of the number of the house the room is located in, needed for address
            int roomFloor = n;                                                                                            //declaration of the floor of a room, needed for address
            int roomNumber = n;                                                                                           //declaration of the room number, needed for address
            String roomCategory = null;
            roomCategoryHolder = null;
            String faculty = null;
            facultyHolder = null;
            String[][][] roomAddress = new String[houseNumber][roomFloor][roomNumber];             //combining of floor and room number to create an address
            // /* linking of certain room types to their respective addresses */
            roomAddress[houseNumber][roomFloor][roomNumber] = roomCategory;                                                 //roomAddress = Room; Just a more sensible way to call it


            Scanner houseNumberInput = new Scanner(System.in);
            Scanner roomFloorInput = new Scanner(System.in);
            Scanner roomNumberInput = new Scanner(System.in);
            Scanner roomCategoryInput = new Scanner(System.in);
            Scanner facultyInput = new Scanner(System.in);


            System.out.println("Please input the house number of the room you are trying to create: ");                             //input for createRoom
            houseNumberHolder = houseNumberInput.nextInt();
            houseNumber = houseNumberHolder;

            System.out.println("Please input the floor the room is supposed to be located on: ");                                   //input for createRoom
            roomFloorHolder = roomFloorInput.nextInt();
            roomFloor = roomFloorHolder;

            System.out.println("Please input the room number of the new room: ");                                                   //input for createRoom
            roomNumberHolder = roomNumberInput.nextInt();
            roomNumber = roomNumberHolder;

            
            if (roomAddress[houseNumber][roomFloor][roomNumber] == null) {                                                           //check if this part of the array already has values
                System.out.println("Please input the type of the room (e.g. library, canteen, toilet):");
                roomCategoryHolder = roomCategoryInput.next();
                roomCategory = roomCategoryHolder;

                System.out.println("Please add which faculty the room belongs to:");
                facultyHolder = facultyInput.next();
                faculty = facultyHolder;
                System.out.println("Success! A new room with the address " + roomAddressName + " ,and the name:" + roomCategoryHolder + " has been created. It belongs to the faculty:" + facultyHolder);   //notification of success
            } 
            
            else {
                System.out.print("The room you are trying to create does already exists. Please restart the process and try again.");
            }    //error notification

        }
    }
