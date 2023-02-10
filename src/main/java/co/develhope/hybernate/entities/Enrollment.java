package co.develhope.hybernate.entities;

import javax.persistence.*;

@Table(name = "enrollments")
@Entity
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private SchoolClass classes;
    //@ManyToOne
    //@JoinColumn(name = "class_id", nullable = false)
    //private SchoolClass classId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Student students;
    //@ManyToOne
    //@JoinColumn(name = "student_id", nullable = false)
    //private Student studentId


    //In questo caso, l'annotazione indica che ci sono molte istanze della classe Student che possono essere associate a
    //un'unica istanza della classe SchoolClass. La relazione viene mappata utilizzando una chiave esterna,
    //che rappresenta una colonna nella tabella Student che fa riferimento alla chiave primaria nella tabella SchoolClass.
    //
    //L'opzione fetch = FetchType.LAZY indica che i dati della classe associata non devono essere caricati automaticamente
    //insieme alla classe studente. Invece, verranno caricati solo se esplicitamente richiesti.
    //Questo può essere utile per migliorare le prestazioni, poiché evita di caricare dati inutili se non necessari.
    //
    //In sintesi, l'annotazione @ManyToOne viene utilizzata per mappare una relazione "molti a uno" tra due entità e
    // l'opzione fetch = FetchType.LAZY indica che i dati associati non devono essere caricati automaticamente.
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public SchoolClass getClasses() {
        return classes;
    }

    public void setClasses(SchoolClass classes) {
        this.classes = classes;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }
}