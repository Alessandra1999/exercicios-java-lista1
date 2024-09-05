package entities;

public class PrintJob {

	private int jobId;
	private String description;
	
	public PrintJob(int jobId, String description) {
		this.jobId = jobId;
		this.description = description;
	}

	public int getJobId() {
		return jobId;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Serviço de Impressão: Id: " + jobId + ", descrição: " + description;
	}
	
	
}
