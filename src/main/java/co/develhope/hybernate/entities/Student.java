package co.develhope.hybernate.entities;

import javax.persistence.*;

/**
 * La classe è annotata con @Entity e @Table, indicando che rappresenta un'entità mappata a una tabella del database.
 *
 * La classe ha una proprietà id che rappresenta l'identificatore univoco dello studente.
 * La proprietà è annotata con @Id e @GeneratedValue, indicando che è una chiave primaria e che il suo
 * valore deve essere generato automaticamente dal database.
 *
 * Le proprietà lastName e firstName rappresentano il cognome e il nome dello studente.
 * Entrambe le proprietà sono annotate con @Column, con l'opzione nullable impostata su false.
 * Questo significa che i campi corrispondenti nella tabella del database non possono essere nulli.
 */


@Entity
/**
 * L'annotazione @Entity in Java indica che una classe rappresenta un'entità del database.
 * Questa annotazione è utilizzata con la libreria Java Persistence API (JPA) per la mappatura di oggetti Java a tabelle del database.
 * Con l'annotazione @Entity, un'istanza di una classe può essere persistita (cioè salvata) nel database e anche caricata (cioè recuperata) dal database.
 * La libreria JPA utilizza questa annotazione per sapere che la classe deve essere gestita come un'entità e che i suoi campi corrisponderanno ai campi delle tabelle del database.
 */

@Table(name = "students")
/**
 * L'annotazione @Table in Java indica che una classe è mappata a una tabella specifica del database.
 * Questa annotazione è utilizzata con la libreria Java Persistence API (JPA) per la mappatura di oggetti Java a tabelle del database.
 * L'annotazione @Table può essere utilizzata per specificare il nome della tabella del database che corrisponde alla classe.
 * Ad esempio: @Table(name="STUDENT_TABLE") ma se l'annotazione @Table non viene specificata,
 * JPA utilizzerà il nome della classe come nome della tabella del database come viene eseguito in questo esercizio.
 */

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false, unique = true)
    private String email;

    /**
     * L'annotazione nullable = false indica che la colonna corrispondente non può contenere valori nulli.
     * Ciò significa che quando si inserisce un nuovo record nel database, la colonna non può essere lasciata vuota.
     * In altre parole, è necessario fornire un valore per quella colonna.
     *
     *L'annotazione @Column(unique = true) indica che il campo 'email' deve essere unico nella tabella
     *  del database corrispondente alla classe Student.
     *  Questo significa che non possono esistere due istanze della classe Student con lo stesso valore per il campo 'email'.
     */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}