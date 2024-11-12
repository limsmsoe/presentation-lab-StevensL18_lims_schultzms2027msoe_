public class config {
    public static final long DEFAULT_SEAT_CHECK_TIME = 1000; // How long it takes the host to check a table
    public static final int DEFAULT_BAR_SEATS = 12; // How many seats are at a bar
    public static final int DEFAULT_TABLES = 10; // How many tables are in the dining room
    public static final int DEFAULT_BARS = 2; // How many bars are in the dining room
    public static final int DEFAULT_TABLE_SEAT_MIN = 2; // Minimum number of random seats at a table
    public static final int DEFAULT_TABLE_SEAT_MAX = 8; // Maximum number of random seats at a table
    public static final long DEFAULT_SEATING_DURATION = 1000*3; // How long a customer occupies a table seat


    public static long seatCheckTime = DEFAULT_SEAT_CHECK_TIME;
    public static int barSeats = DEFAULT_BAR_SEATS;
    public static int tables = DEFAULT_TABLES;
    public static int bars = DEFAULT_BARS;
    public static int tableSeatMin = DEFAULT_TABLE_SEAT_MIN;
    public static int tableSeatMax = DEFAULT_TABLE_SEAT_MAX;
    public static long seatingDuration = DEFAULT_SEATING_DURATION;
}
