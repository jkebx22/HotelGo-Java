public class Main<string> {

    private static Object RoomSize;
    private static Object stay;

    public static void main(String[] args) {
        int Rn = 15;

        switch (Rn) {
            case 1:
                RoomSize = 0;
                stay = 0;
                System.out.println("Queen Size 1 night stay $30.00");
                break;
            case 2:
                RoomSize = 0;
                stay = 1;
                System.out.println("Queen Size 2 night stay $60.00");
                break;
            case 3:
                RoomSize = 0;
                stay = 2;
                System.out.println("Queen Size 3 night stay $90.00");
                break;
            case 4:
                RoomSize = 0;
                stay = 3;
                System.out.println("Queen Size 4 night stay $120.00");
                break;
            case 5:
                RoomSize = 0;
                stay = 4;
                System.out.println("Queen Size 5 night stay $150.00");
                break;
            case 6:
                RoomSize = 1;
                stay = 0;
                System.out.println("King Size 1 night stay $40.00");
                break;
            case 7:
                RoomSize = 1;
                stay = 1;
                System.out.println("King Size 2 night stay $80.00");
                break;
            case 8:
                RoomSize = 1;
                stay = 2;
                System.out.println("King Size 3 night stay $120.00");
                break;
            case 9:
                RoomSize = 1;
                stay = 3;
                System.out.println("King Size 4 night stay $160.00");
                break;
            case 10:
                RoomSize = 1;
                stay = 4;
                System.out.println("King Size 5 night stay $200.00");
                break;
            case 11:
                RoomSize = 2;
                stay = 0;
                System.out.println("Suite 1 night stay $50.00");
                break;
            case 12:
                RoomSize = 2;
                stay = 1;
                System.out.println("Suite 2 night stay $100.00");
                break;
            case 13:
                RoomSize = 2;
                stay = 2;
                System.out.println("Suite 3 night stay $150.00");
                break;
            case 14:
                RoomSize = 2;
                stay = 3;
                System.out.println("Suite 4 night stay $200.00");
                break;
            case 15:
                RoomSize = 2;
                stay = 4;
                System.out.println("Suite 5 night stay $250.00");
                break;
            default:
                System.out.println("Error - invalid selection");
                break;
        }

    }
}
