package OOPPart2.createroom;

public class Main {
    public static void main(String[] args) {

        Walls walls = new Walls(5,200,10);
        Physical physical = new Physical(walls,1,2,1);
        Interior interior = new Interior(new Furniture("Samsung","Fankey", "Ikea"), 2);

        Room room = new Room(physical, interior);
        System.out.println(room.getInterior().getCutton());
        room.getPhysical().decideRoomStandard();

    }

}
