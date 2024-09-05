package entities;

public class Process {

	private int id;
	private String name;
	
	public Process(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	@Override
    public String toString() {
        return "Processo: " + "id: " + id + ", nome: " + name;
    }
}
