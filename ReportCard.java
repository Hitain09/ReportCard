public class ReportCard{
	private String studentName, studentId, studentBatch, studentStream, studentGrade;
	private int tocMarks,cppMarks,apcMarks,javaMarks,total = 0;
	private float cgpa=0;

	private ReportCard(String nameOfStudent, String idOfStudent, String batchOfStudent, String streamOfStudent, int marksInToc, int marksInCpp, int marksInApc, int marksInJava){
		this.studentName = nameOfStudent;
		this.studentId = idOfStudent;
		this.studentBatch = batchOfStudent;
		this.studentStream = streamOfStudent;
		this.tocMarks = marksInToc;
		this.cppMarks = marksInCpp;
		this.apcMarks = marksInApc;
		this.javaMarks = marksInJava;
	}

	public String getStudentName(){ return studentName;}
	public void setStudentName(String nameOfStudent){ this.studentName = nameOfStudent;}

	public String getStudentId(){ return studentId;}
	public void setStudentId(String idOfStudent){ this.studentId = idOfStudent;}

	public String getStudentBatch(){return studentBatch;}
	public void setStudentBatch(String batchOfStudent){ this.studentBatch = batchOfStudent;}

	public String getStudentStream(){return studentStream;}
	public void setStudentStream(String streamOfStudent){this.studentStream = streamOfStudent;}

	public int getTocMarks(){ return tocMarks;}
	public void setTocMarks(int marksInToc){this.tocMarks = marksInToc;}

	public int getCppMarks(){return cppMarks;}
	public void setCppMarks(int marksInCpp){this.cppMarks = marksInCpp;}

	public int getApcMarks(){return apcMarks;}
	public void setApcMarks(int marksInApc){this.apcMarks = marksInApc;}

	public int getJavaMarks(){return javaMarks;}
	public void setJavaMarks(int marksInJava){this.javaMarks = marksInJava;}

	public String studentResult(int marksInToc, int marksInJava, int marksInApc, int marksInCpp){
		total = marksInApc + marksInCpp + marksInJava + marksInToc;
		cgpa = total/500;
		if(cgpa == 10){ studentGrade = 'O';}
		else if(cgpa >= 9.0){studentGrade = 'A';}
		else if(cgpa >= 8.0){studentGrade = 'B';}
		else if(cgpa >= 7.0){studentGrade = 'C';}
		else if(cgpa >= 6.0){studentGrade = 'D';}
		else{studentGrade = 'F';}
		return studentGrade;

	}
	@Override
	public String toString(){
		String str1 =  "------Report Card------"+"\n"+"Student Name - "+studentName+"\n"+"Student ID - "+studentId+"\n"+"Student Batch - "+studentBatch+"\n"+"Student Stream - "+studentStream+
            "Marks in subjects :"+"\n"+"TOC Marks :"+tocMarks+"\n"+"Java Marks :"+javaMarks+"\n"+"APC Marks :"+apcMarks+"\n"+"Cpp Marks :"+cppMarks+
            "\n"+"Overall Grade : "+studentResult(getdbmsMarks,getdeldMarks,getosMarks,getcppMarks);
            return str1;
	}
}