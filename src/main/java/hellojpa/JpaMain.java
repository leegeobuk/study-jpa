package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member member1 = new Member();
            member1.setName("user1");
            member1.setWorkPeriod(Period.of(LocalDate.of(2019, 3, 15)));
            member1.setHomeAddress(Address.of("Yangju", "Goam-gil", "11456"));
            System.out.println("member1.getDaysWorked() = " + member1.getDaysWorked());

            em.persist(member1);

//            CriteriaBuilder cb = em.getCriteriaBuilder();
//            CriteriaQuery<Member> query = cb.createQuery(Member.class);
//            Root<Member> m = query.from(Member.class);
//            CriteriaQuery<Member> cq = query.select(m).where(cb.equal(m.get("name"), m.get("user1")));
//            List<Member> resultList = em.createQuery(cq).getResultList();

            em.flush();
            em.clear();

            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();

    }
}
