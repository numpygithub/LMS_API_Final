package pojo;

import java.util.List;

/*{ 
 "programName": "PostgreSQL14", 
 "programDescription": "Learn PostgreSql14", 
 "programStatus": "Active", 
 "creationTime": "2023-01-07T04:13:00.000+00:00", 
  "lastModTime": "2023-01-07T04:13:00.000+00:00" 
} 
 */

public class CreateProgram {
	
		private int programId;
		private String programName;
		private String programDescription;
		private String programStatus;
		private String creationTime;
		private String lastModTime;
		
		// Need to check with program id
		public String getprogramName() {
			return programName;
		}
		public void setName(String programName) {
			this.programName = programName;
		}
		
		public String getprogramDescription() {
			return programDescription;
		}
		public void setprogramDescription(String programDescription) {
			this.programDescription = programDescription;
		}
		
		
		public String getprogramStatus() {
			return programStatus;
		}
		public void setprogramStatus(String programStatus) {
			this.programStatus = programStatus;
		}
		
		public String getcreationTime() {
			return creationTime;
		}
		public void setcreationTime(String creationTime) {
			this.creationTime = creationTime;
		}
		
		public String getlastModTime() {
			return lastModTime;
		}
		public void setlastModTime(String lastModTime) {
			this.lastModTime = lastModTime;
		}
				
	}


