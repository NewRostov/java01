package September17.model;

import java.util.ArrayList;
import java.util.List;

// класс вопрос
public class QuestionForLottery {
    private int id;
    private String body;
    private final List<String> listAnswer;
    private int answer;

    public QuestionForLottery(int id, String body, int answer) {
        this.id = id;
        this.body = body;
        listAnswer = new ArrayList<>();
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public List<String> getListAnswer() {return listAnswer; }

    public int getTrueAnswer() {
        return answer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTrueAnswer(int trueAnswer) {
        this.answer = trueAnswer;
    }
}
