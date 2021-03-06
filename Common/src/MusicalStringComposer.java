import java.util.List;

/**
 * Created by rosudrag-pc on 11/1/2014.
 */
public class MusicalStringComposer {
    protected MusicalStringComposer(){};

    public static String AppendVoice(List<String> strings)
    {
        String result = "";
        int counter = 0;

        for(String string : strings)
        {
            if(string.isEmpty())
            {
                continue;
            }

            if(string.startsWith("V9"))
                continue;

            if(counter == 16)
            {
                break;
            }

            if(counter == 9)
            {
                counter++;
            }

            String voice = "V" + counter;

            result += " " + voice + " " + string;

            counter++;
        }

        return result;
    }
}
