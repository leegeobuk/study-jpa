package hellojpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;

//    @OneToMany(mappedBy = "team")
//    private List<Member> members = new ArrayList<>();

    public void addMember(Member member) {
//        members.add(member);
//        member.setTeam(this);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    public List<Member> getMembers() {
//        return members;
//    }

    public void setName(String name) {
        this.name = name;
    }
}
