package org.example.constants;

public enum Sql {
    INSERT_FLIGHT("INSERT INTO flight (flight_number, air_line, destination, departure_city, departure_time, arrival_time, gate, terminal, status, check_in_counter, boarding_time)" +
            "VALUES ('%s','%s','%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')"),
    SELECT_FLIGHTS("SELECT * FROM flight"),
    SELECT_FLIGHT("SELECT * FROM flight WHERE flight_number = '%s' "),
    INSERT_BOOKING("INSERT INTO booking (passenger_name, passenger_surname, flight_number, user_id) VALUES ('%s', '%s', '%s', '%s')"),
    DELETE_BOOKING("DELETE FROM booking WHERE id = '%s'"),
    SELECT_USER_BOOKINGS("SELECT booking.id, booking.passenger_name, booking.passenger_surname, booking.flight_number, booking.user_id " +
            "FROM booking\n" +
            "INNER JOIN \"user\" ON \"user\".id = booking.user_id WHERE booking.user_id = '%s' "),
    SELECT_USER("SELECT * FROM \"user\" WHERE username = '%s' AND password = '%s' "),
    ;

    private final String stmt;

    Sql(String stmt) {
        this.stmt = stmt;
    }

    public String getStmt(){
        return stmt;
    }

}
