import React, {Component} from "react";
import TreeService from "../services/TreeService";
import SurveyQuestionService from "../services/SurveyQuestionService";
import SurveyAnswerService from "../services/SurveyAnswerService";

class TreeComponent extends Component{


    constructor(props) {
        super(props);

        this.state ={
            surveyQuestion: [],
            surveyAnswer: []

        }
        this.addSurvey = this.addSurvey.bind(this);
        this.editSurvey = this.editSurvey.bind(this);
        this.deleteSurvey = this.deleteSurvey.bind(this);
    }

    deleteSurvey(id){
        SurveyQuestionService.deleteSurveyQuestion(id).then(res => {
            this.setState({surveyQuestion: this.state.surveyQuestion.filter(surveyQuestion => surveyQuestion.id !== id)});
        });
        SurveyAnswerService.deleteSurveyAnswer(id).then(res => {
            this.setState({surveyAnswer: this.state.surveyAnswer.filter(surveyAnswer => surveyAnswer.id !== id)});
        });
    }
    viewSurvey(id){
        this.props.history.push(`/viewDetails/${id}`);
    }
    componentDidMount() {
        SurveyQuestionService.getSurveyQuestion().then((res) => {
            this.setState({
                surveyQuestion: res.data
                });})
        SurveyAnswerService.getSurveyAnswer().then((res) => {
            this.setState({
                surveyAnswer: res.data
            });})
    }
    editSurvey(id){
        this.props.history.push(`/add/${id}`)

    }

    addSurvey (){
        this.props.history.push('/add/add');

    }

    render() {
        return(
            <div>
                <div className="row">
                    <button className="btn btn-outline-primary" onClick={this.addSurvey}>
                        Dodaj ankiete
                    </button>

                </div>

                <div className="row">

                    <div className="tree">
                        <ul>
                            <li>
                                <a href="#">Ankieta
                                    {
                                        this.state.surveyQuestion.map(
                                            surveyQuestion =>

                                        <ul>
                                        <li>
                                        <a href="#">Pytanie 1
                                        <td>{ surveyQuestion.theQuestion }</td>
                                        </a>
                                        <ul>
                                        <li>
                                        <a href="#">Odpowiedz
                                            <td>{ surveyQuestion.surveyAnswerList }</td>
                                        </a>
                                        </li>
                                        </ul>
                                        </li>
                                        <li>
                                        <a href="#">Pytanie 2
                                            <td>{ surveyQuestion.theQuestion }</td>
                                        </a>
                                        <ul>
                                        <li><a href="#">Odpowiedz1</a></li>
                                        <li>
                                        <a href="#">Odpowiedz2</a>
                                        <ul>
                                        <li>
                                        <a href="#">Rozwiazanie problemu1</a>
                                        </li>
                                        <li>
                                        <a href="#">Rozwiazanie problemu 2</a>
                                        </li>
                                        <li>
                                        <a href="#">Rozwiazanie problemu 3</a>
                                        </li>
                                        </ul>
                                        </li>
                                        <li><a href="#">Odpowiedz3</a></li>
                                        </ul>
                                        </li>
                                        </ul>
                                        )
                                    }

                                </a>



                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        )
    }

}
export default TreeComponent