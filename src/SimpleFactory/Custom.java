package SimpleFactory;

/**
 * Created by 鲍骞月 on 2017/6/30.
 */
public class Custom {
    public static void main(String [] args){
        Programmer JavaProgrammer = ProgrammerFactory.createProgrammer("Java");
        Programmer AndroidProgrmmer = ProgrammerFactory.createProgrammer("Android");
    }
}
