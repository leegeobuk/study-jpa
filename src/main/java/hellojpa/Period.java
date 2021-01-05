package hellojpa;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Embeddable
public class Period {

    @Column(name = "START_DATE")
    private LocalDate startDate;

    @Column(name = "END_DATE")
    private LocalDate endDate;

    private Period() {

    }

    private Period(LocalDate startDate) {
        this.startDate = startDate;
        this.endDate = LocalDate.now();
    }

    private Period(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public static Period of(LocalDate startDate) {
        return new Period(startDate);
    }

    public static Period of(LocalDate startDate, LocalDate endDate) {
        return new Period(startDate, endDate);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getDaysWorked() {
        long until = getStartDate().until(getEndDate(), ChronoUnit.DAYS);
        return (int) until;
    }
}
