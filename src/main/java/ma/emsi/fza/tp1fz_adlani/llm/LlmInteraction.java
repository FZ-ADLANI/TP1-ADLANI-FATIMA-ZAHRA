package ma.emsi.fza.tp1fz_adlani.llm;

import java.io.Serializable;

public class LlmInteraction implements Serializable {

    private String questionJson;
    private String reponseJson;
    private String reponseExtraite;

    public LlmInteraction(String questionJson, String reponseJson, String reponseExtraite) {
        this.questionJson = questionJson;
        this.reponseJson = reponseJson;
        this.reponseExtraite = reponseExtraite;
    }

    public String questionJson() {
        return questionJson;
    }

    public String reponseJson() {
        return reponseJson;
    }

    public String reponseExtraite() {
        return reponseExtraite;
    }

    public void setQuestionJson(String questionJson) {
        this.questionJson = questionJson;
    }

    public void setReponseJson(String reponseJson) {
        this.reponseJson = reponseJson;
    }

    public void setReponseExtraite(String reponseExtraite) {
        this.reponseExtraite = reponseExtraite;
    }
}
