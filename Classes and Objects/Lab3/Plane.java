
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class Plane {
    private PlaneSeat[] seat = new PlaneSeat[12];
    private int numEmptySeat = 12;

    public Plane() {
    }

    private PlaneSeat[] sortSeats() {
        ArrayList<PlaneSeat> seatsList = new ArrayList<>(Arrays.asList(seat));
        seatsList.sort(Comparator.nullsLast(Comparator.comparingInt(PlaneSeat::getCustomerID)));

        return seatsList.toArray(new PlaneSeat[12]);
    }

    private PlaneSeat[] sortSeatsBySeatId() {
        ArrayList<PlaneSeat> seatsList = new ArrayList<>(Arrays.asList(seat));
        seatsList.sort(Comparator.nullsLast(Comparator.comparingInt(PlaneSeat::getSeatID)));

        return seatsList.toArray(new PlaneSeat[12]);
    }

    public void showNumEmptySeats() {
        System.out.printf("There are %d empty seats\n\n", numEmptySeat);
    }

    public void showEmptySeats() {
        seat = sortSeatsBySeatId();
        System.out.println("The following seats are empty:\n");

        List<Integer> list1 = new ArrayList<Integer>();

        for (PlaneSeat planeSeat : seat) {
            if (planeSeat != null && planeSeat.isOccupied()) {
                list1.add(planeSeat.getSeatID());
            } else {
                continue;
            }
        }

        for (int i = 1; i < 13; i++) {
            if (list1.contains(i)) {
                continue;
            } else {
                System.out.printf("SeatID %d\n", i);
            }
        }

    }

    public void showAssignedSeats(boolean bySeatId) {
        System.out.println("The seat assignments are as follows:");

        if (bySeatId) {
            seat = sortSeatsBySeatId();
            for (PlaneSeat planeSeat : seat) {
                if (planeSeat != null && planeSeat.isOccupied())
                    System.out.printf("SeatID %d assigned to CustomerId %d\n", planeSeat.getSeatID(),
                            planeSeat.getCustomerID());
            }
        } else {
            seat = sortSeats();
            for (PlaneSeat planeSeat : seat) {
                if (planeSeat != null && planeSeat.isOccupied())
                    System.out.printf("SeatID %d assigned to CustomerId %d\n", planeSeat.getSeatID(),
                            planeSeat.getCustomerID());
            }
        }
    }

    public void assignSeat(int seatId, int cust_id) {

        int index = -1;
        for (int i = 0; i < seat.length; i++) {
            if (seat[i] != null && seat[i].getSeatID() == seatId)
                index = i;
        }

        if (index == -1 || !seat[index].isOccupied()) {
            PlaneSeat planeSeat = new PlaneSeat(seatId);
            planeSeat.assign(cust_id);
            seat[12 - numEmptySeat] = planeSeat;
            numEmptySeat--;
            System.out.println("Seat Assigned!\n");
        } else
            System.out.println("Seat already assigned to a customer.\n");
    }

    public void unAssignSeat(int seatId) {

        for (PlaneSeat planeSeat : seat) {
            if (planeSeat != null && planeSeat.getSeatID() == seatId) {
                planeSeat.unAssign();
                this.numEmptySeat++;
                System.out.println("Seat Unassigned!\n");
            }
        }
    }
}
