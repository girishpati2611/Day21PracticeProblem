import org.example.MoodAnalyser;
import org.example.MoodAnalysisException;
import org.junit.*;

public class TestMoodAnalyser {
    MoodAnalyser obj = new MoodAnalyser();

    @Test
    public void analyseMoodTest() throws MoodAnalysisException {

        String result = obj.analyseMood("I am in sad mood");

        Assert.assertEquals("SAD", result);
    }

    @Test
    public void analyseMoodTest1() throws MoodAnalysisException {

        String result = obj.analyseMood("I am in any mood");

        Assert.assertEquals("HAPPY", result);

    }

    @Test
    public void analyseMoodTest2() throws MoodAnalysisException {

        String result = obj.analyseMood(null);

        Assert.assertEquals("org.example.MoodAnalysisException", result);

    }
}

