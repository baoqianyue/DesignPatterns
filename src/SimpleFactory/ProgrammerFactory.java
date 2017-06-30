package SimpleFactory;

/**
 * Created by 鲍骞月 on 2017/6/30.
 */
public class ProgrammerFactory {
    public static Programmer createProgrammer(String type){
        Programmer programmer = null;
        switch (type){
            case "Android":
                programmer = new AndroidProgrammer();
                return programmer;
            case "Java":
                programmer = new JavaProgrammer();
                return programmer;
            default:
                return programmer;
        }

    }
}
