public class ReadAndWriteFacade{
    private ReadFile readFile;
    private AnalyzeInformation analyzeInformation;
    private WriteFile writeFile;
    public ReadAndWriteFacade(){
       readFile=new ReadFile();
       analyzeInformation=new AnalyzeInformation();
       writeFile=new WriteFile();
    }
    public void doOption(String readFileName,String delContent,String savedFileName){ 
       String content=readFile.readFileContent(readFileName);
       System.out.println("��ȡ�ļ�"+readFileName+"������:");
       System.out.println(content);
       String savedContent=analyzeInformation.getSavedContent(content,delContent);
       writeFile.writeToFile(savedFileName,savedContent);
       System.out.println("���浽�ļ�"+savedFileName+"�е�����:");
       System.out.println(savedContent);
       
    } 
}