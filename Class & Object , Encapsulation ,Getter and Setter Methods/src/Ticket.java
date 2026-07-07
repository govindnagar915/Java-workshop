//Movie Ticket Booking
class MovieTicket {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getTotalPrice() {
        double total = ticketPrice * numberOfTickets;

        if (numberOfTickets >= 5) {
            total -= total * 0.05;
        }

        return total;
    }
}

public class Ticket {
    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();

        mt.setMovieName("Avengers");
        mt.setTicketPrice(200);
        mt.setNumberOfTickets(5);

        System.out.println("Movie Name : " + mt.getMovieName());
        System.out.println("Total Price : " + mt.getTotalPrice());
    }
}