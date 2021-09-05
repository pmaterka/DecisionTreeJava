import axios from 'axios';

const SURVEY_QUESTION_API_BASE_URL ="http://localhost:8080/surveyquestion";

class SurveyQuestionService{

    getSurveyQuestion (){
        return axios.get(SURVEY_QUESTION_API_BASE_URL);
    }

    createSurveyQuestion(surveyQuestion){
        return axios.post(SURVEY_QUESTION_API_BASE_URL, surveyQuestion);
    }
    getSurveyQuestionById (surveyQuestionId){
        return axios.get(SURVEY_QUESTION_API_BASE_URL +'/'+ surveyQuestionId);
    }
    updateSurveyQuestion(surveyQuestion, surveyQuestionId){
        return axios.put(SURVEY_QUESTION_API_BASE_URL + '/'+ surveyQuestionId, surveyQuestion)
    }
    deleteSurveyQuestion(surveyQuestionId){
        return axios.delete(SURVEY_QUESTION_API_BASE_URL + '/' + surveyQuestionId);
    }
}

export default new SurveyQuestionService()