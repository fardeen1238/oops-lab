
import java.util.Scanner;

class BusTicketReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String passengerName = "";
        int age = 0;
        int ticketBooked = 0;
        int choice;

        do {
            System.out.println("\n=== BUS TICKET RESERVATION SYSTEM ===");
            System.out.println("1. Passenger Registration");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. View Ticket Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Passenger Name: ");
                    passengerName = sc.nextLine();

                    System.out.print("Enter Passenger Age: ");
                    age = sc.nextInt();

                    System.out.println("Passenger Registered Successfully!");
                    break;

                case 2:
                    if (passengerName.isEmpty()) {
                        System.out.println("Please register passenger first!");
                    } else if (ticketBooked == 1) {
                        System.out.println("Ticket already booked!");
                    } else {
                        ticketBooked = 1;
                        System.out.println("Ticket Booked Successfully!");
                        System.out.println("Passenger Name: " + passengerName);
                    }
                    break;

                case 3:
                    if (ticketBooked == 1) {
                        ticketBooked = 0;
                        System.out.println("Ticket Cancelled Successfully!");
                    } else {
                        System.out.println("No ticket available to cancel!");
                    }
                    break;

                case 4:
                    if (passengerName.isEmpty()) {
                        System.out.println("No passenger registered!");
                    } else {
                        System.out.println("\n--- Passenger Details ---");
                        System.out.println("Name: " + passengerName);
                        System.out.println("Age: " + age);
                        System.out.println("Ticket Status: "
                                + (ticketBooked == 1 ? "Booked" : "Not Booked"));
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
