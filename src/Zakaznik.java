public class Zakaznik {
    private String jmeno;
    private static int nextId = 1;
    private final int id;


    public Zakaznik(String jmeno){
        this.jmeno = jmeno;
        this.id = nextId++;

    }
    public int getId(){
        return  id;
    }
    public String getJmeno(){
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
}
