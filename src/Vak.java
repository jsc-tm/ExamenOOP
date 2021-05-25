import java.util.regex.Pattern;

public class Vak {
    private final static String PATTERN = "^YX[0-9]{4}$";
    private String id;
    private String naam;

    public Vak(String id, String naam) throws Exception {
        if (!checkId(id)) throw new Exception("id is ongeldig voor een vak");
        if (naam==null) naam = "";
        naam = naam.trim().toUpperCase();
        if (naam.length()<3) throw new Exception("naam is ongeldig voor een vak");
        this.id = id;
        this.naam = naam;
    }

    private boolean checkId(String id) {
        if (id==null) return false;
        return Pattern.matches(PATTERN, id);
    }

    public String getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return "Vak [id = " + id + " , naam = " + naam + "]";
    }
}
