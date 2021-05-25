public interface IMetPunten {
    int MAXPUNT = 20;
    boolean setResultaat(Docent examinator, double punt);
    double getResultaat();
    Docent getExaminator();
}
