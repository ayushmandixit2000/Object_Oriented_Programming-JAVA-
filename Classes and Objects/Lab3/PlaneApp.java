import java.util.Scanner;

public class PlaneApp {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        Plane plane = new Plane();

        System.out.print("(1) Show the number of empty seats\n" +
                "(2) Show the list of empty seats\n" +
                "(3) Show the list of customers together with their seat numbers in the order of the seat numbers\n" +
                "(4) Show the list of customers together with their seat numbers in the order of the customer ID\n" +
                "(5) Assign a customer to a seat\n" +
                "(6) Remove a seat assignment\n" +
                "(7) Exit\n");

        do {
            System.out.print("\nEnter the number of your choice: ");
            num = scanner.nextInt();

            switch (num) {
                case 1:
                    plane.showNumEmptySeats();
                    break;
                case 2:
                    plane.showEmptySeats();
                    break;
                case 3:
                    plane.showAssignedSeats(true);
                    break;
                case 4:
                    plane.showAssignedSeats(false);
                    break;
                case 5:
                    System.out.print("Assigning Seat ..\n Please enter SeatID: ");
                    int seatId = scanner.nextInt();
                    System.out.print(" Please enter Customer ID: ");
                    int customerId = scanner.nextInt();
                    plane.assignSeat(seatId, customerId);
                    break;
                case 6:
                    System.out.print("Enter SeatID to unassign customer from: ");
                    plane.unAssignSeat(scanner.nextInt());
                    break;
            }

        } while (num != 7);
    }
}