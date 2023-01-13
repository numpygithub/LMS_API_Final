package pojo;

import java.util.List;


/*     
    "batchName": "PY02", 
    "batchDescription": "Python", 
    "batchStatus": "Active", 
    "batchNoOfClasses": 12, 
    "programId": 10  
 */
public class CreateBatch {
	
	private String batchName;
	private String batchDescription;
	private String batchStatus;
	private int batchNoOfClasses;
	private int programId;
	
	
	public String getbatchName() {
		return batchName;
	}
	public void setbatchName(String batchName) {
		this.batchName = batchName;
	}
	
	public String getbatchDescription() {
		return batchDescription;
	}
	public void setbatchDescription(String batchDescription) {
		this.batchDescription = batchDescription;
	}
	
	
	public String getbatchStatus() {
		return batchStatus;
	}
	public void setbatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}
	
	public int getbatchNoOfClasses() {
		return batchNoOfClasses;
	}
	public void setbatchNoOfClasses(int batchNoOfClasses) {
		this.batchNoOfClasses = batchNoOfClasses;
	}
	
	public int getprogramId() {
		return programId;
	}
	public void setprogramId(int programId) {
		this.programId = programId;
	}


}
