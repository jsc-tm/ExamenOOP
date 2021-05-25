abstract public class Persoon {
    protected final String id;
    private String naam;

    public Persoon() throws Exception {
        throw new Exception("een persoon moet een id en naam hebben");
    }

    public Persoon(String id, String naam) throws Exception {
        if (id==null) id = "";
        if (!checkId(id)) throw new Exception("een persoon moet een geldig id hebben");
        this.id = id;
        setNaam(naam);
    }

    abstract protected boolean checkId(String id);

    public String getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) throws Exception {
        if (naam==null) naam = "";
        naam = naam.trim();
        if (naam.length()<10) throw new Exception("een persoon moet een naam van minimaal 10 karakters hebben");
        this.naam = naam;
    }
}
