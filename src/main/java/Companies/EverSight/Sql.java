package Companies.EverSight;

public class Sql {
   /* SELECT DISTINCT plays.id, title, IFNULL(SUM(number_of_tickets), 0) AS reserved_tickets
    FROM plays LEFT JOIN reservations
    ON plays.id = reservations.play_id
    GROUP BY plays.id
    ORDER BY reserved_tickets DESC;*/
}
