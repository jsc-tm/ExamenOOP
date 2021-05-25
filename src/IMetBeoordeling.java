public interface IMetBeoordeling {
    Beoordeling DEFAULT_BEOORDELING = Beoordeling.INBEHANDELING;
    void setBeoordeling(Beoordeling oordeel);
    Beoordeling getBeoordeling();
}
