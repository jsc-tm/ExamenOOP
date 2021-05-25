abstract public class DeelRapport implements IMetStudent, IMetVak {
    private Student student;
    private Vak vak;
    protected boolean beoordeeld = false;
    protected Onderdeel onderdeel;

    public DeelRapport(Student student, Vak vak) throws Exception {
        if (student==null || vak==null) throw new Exception("Student en vak mogen niet null zijn bij een deelrapport");
        setVak(vak);
        setStudent(student);
        setOnderdeel();
    }

    private void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public Student getStudent() {
        return student;
    }

    private void setVak(Vak vak) {
        this.vak = vak;
    }

    @Override
    public Vak getVak() {
        return vak;
    }

    abstract protected void setOnderdeel();
}

