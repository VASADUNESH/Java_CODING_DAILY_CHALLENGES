package SEPT_26;

public class Trainer {
	private int trainerId,batchCount; private String trainerName;
	private double basicSal,HRAPer, DAPer,perkPerBatch;
	
	public Trainer(int trainerId, int batchCount, String trainerName, double basicSal, double hRAPer, double dAPer,
			double perkPerBatch) {
		super();
		this.trainerId = trainerId;
		this.batchCount = batchCount;
		this.trainerName = trainerName;
		this.basicSal = basicSal;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.perkPerBatch = perkPerBatch;
	}
	
	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public double calculateGrossSalary() {
		return basicSal+HRAPer+DAPer+(batchCount*perkPerBatch) ;
	}

	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", batchCount=" + batchCount + ", trainerName=" + trainerName
				+ ", basicSal=" + basicSal + ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + ", perkPerBatch="
				+ perkPerBatch + "]";
	}
	
}
