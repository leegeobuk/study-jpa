package hellojpa;

import javax.persistence.*;

@Entity
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String name;

    @Embedded
    private Period workPeriod;

    @Embedded
    private Address homeAddress;

    public Member() {

    }

    public Member(Long id, String name, Period workPeriod, Address homeAddress) {
        this.id = id;
        this.name = name;
        this.workPeriod = workPeriod;
        this.homeAddress = homeAddress;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkPeriod(Period workPeriod) {
        this.workPeriod = workPeriod;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public int getDaysWorked() {
        return workPeriod.getDaysWorked();
    }

    @Override
    public String toString() {
        return "(" + name + id + ")";
    }
}
