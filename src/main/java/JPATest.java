import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPATest {
    public static void main(String[] args) {
        /*
        BuddyInfo buddy1 = new BuddyInfo();
        BuddyInfo buddy2 = new BuddyInfo();
        buddy2.setName("Connor");
        buddy2.setPhoneNum("2261234567");

        AddressBook addbook = new AddressBook();
        addbook.addBuddy(buddy1);
        addbook.addBuddy(buddy2);


        // Connecting to the database through EntityManagerFactory
        // connection details loaded from persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");

        EntityManager em = emf.createEntityManager();

        // Creating a new transaction
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        // Persisting the product entity objects
        em.persist(buddy1);
        em.persist(buddy2);
        em.persist(addbook);

        tx.commit();

        // Querying the contents of the database using JPQL query
        Query q = em.createQuery("SELECT b FROM BuddyInfo b");

        @SuppressWarnings("unchecked")
        List<BuddyInfo> results = q.getResultList();

        System.out.println("List of buddies\n----------------");

        for (BuddyInfo b : results) {

            System.out.println(b.getName() + " (id=" + b.getId() + ")");
        }


        Query q2 = em.createQuery("SELECT a FROM AddressBook a");

        @SuppressWarnings("unchecked")
        AddressBook resultAddressBook = (AddressBook) q2.getSingleResult();

        System.out.println("Name of first Buddy in Address Book:");
        System.out.println(resultAddressBook.getElementAt(0).getName() );






        // Closing connection
        em.close();

        emf.close();
    */
    }



}
