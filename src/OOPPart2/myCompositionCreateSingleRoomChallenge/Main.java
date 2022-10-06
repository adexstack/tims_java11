package OOPPart2.myCompositionCreateSingleRoomChallenge;


public class Main {
    public static void main(String[] args) {
        Furnitures furniture = new Furnitures(1,1,"ikea");
        Electronics electronic  = new Electronics(2,"Philips","Samsung","Beko");
        Cotton cotton = new Cotton(15.5,"Blue","Silk");

        FloorLay floorLay = new FloorLay("marble");
        BuildWall buildWall = new BuildWall(20,"Brick","Grey");
        Ceiling ceiling = new Ceiling(22,"White");

        Interior interior = new Interior(cotton,electronic,furniture);
        Structure structure = new Structure(buildWall,ceiling,floorLay);

        SingleRoom singleRoom = new SingleRoom(interior,structure);
        singleRoom.roomAdvert();

    }
}
