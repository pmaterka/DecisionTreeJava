import axios from 'axios';

const SURVEY_ANSWER_API_BASE_URL ="http://localhost:8080/surveyAnswer";

class SurveyAnswerService{

    getSurveyAnswer (){
        return axios.get(SURVEY_ANSWER_API_BASE_URL);
    }

    createSurveyAnswer(surveyAnswer){
        return axios.post(SURVEY_ANSWER_API_BASE_URL, surveyAnswer);
    }
    getSurveyAnswer (surveyAnswerId){
        return axios.get(SURVEY_ANSWER_API_BASE_URL +'/'+ surveyAnswerId);
    }
    updateSurveyAnswer(surveyAnswer, surveyAnswerId){
        return axios.put(SURVEY_ANSWER_API_BASE_URL + '/'+ surveyAnswerId, surveyAnswer)
    }
    deleteSurveyAnswer(surveyAnswerId){
        return axios.delete(SURVEY_ANSWER_API_BASE_URL + '/' + surveyAnswerId);
    }
}

export default new SurveyAnswerService()