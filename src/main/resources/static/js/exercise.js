Vue.component('single-select', {
    props: ['question', 'index'],
    data: function () {
        return {
            userAnswers: []
        }
    },
    methods: {
        getIndex: function (val) {
            return ' ' + String.fromCharCode(val + 65) + '. ';
        }
    },
    watch: {
        userAnswers: function (val) {
            // console.log(val)
        }
    },
    computed: {
        wrongAnswer: function () {
            if (this.userAnswers == '') {
                return '';
            } else {
                return this.userAnswers != this.question.AnswersIds ? 'wrong-answer' : ''
            }
        }
    },
    template: '<div :class="wrongAnswer">' +
        '<p>{{index+1}}. {{question.Topic}}</p>' +
        '<ol style="list-style: none"><li v-for="item,index1 in question.Answer"><input type="radio" :name="question.QuestionId" :value="item.AnswerID" v-model="userAnswers">{{getIndex(index1)}}{{item.AnswerContent}}</li></ol></div>'
})


Vue.component('multi-select', {
    props: ['question', 'index'],
    data: function () {
        return {
            userAnswers: []
        }
    },
    methods: {
        getIndex: function (val) {
            return ' ' + String.fromCharCode(val + 65) + '. ';
        }
    },
    watch: {
        userAnswers: function (val) {
            // console.log(val)
        }
    },
    computed: {
        wrongAnswer: function () {
            if (this.userAnswers == '') {
                return '';
            } else {
                return this.userAnswers != this.question.AnswersIds ? 'wrong-answer' : ''
            }
        }
    },
    template: '<div :class="wrongAnswer">' +
        '<p v-html="question.Topic">{{index+1}}. {{question.Topic}}</p>' +
        '<ol style="list-style: none"><li v-for="item,index1 in question.Answer"><input type="checkbox" :name="question.QuestionId" :value="item.AnswerID" v-model="userAnswers">{{getIndex(index1)}}{{item.AnswerContent}}</li></ol></div>'
})

Vue.component('fill-in', {
    props: ['question', 'index'],
    data: function () {
        return {
            userAnswers: [],
            totalAnswersNum: 0,
        }
    },
    methods: {
        getFillInHtml: function (index, question) {
            var i = 0;
            var id = '';
            var title = question.Topic;
            while (title.indexOf('____') != -1) {
                title = title.replace('____', '<input class="fill-in-input" id="' + (question.QuestionId + i) + '" type="text">');
                id += this.question.QuestionId + i;
                id += ';'
                i++;
            }
            this.totalAnswersNum = i;
            this.registerInputIds(id, this);
            return index + 1 + '.  ' + title;
        },
        registerInputIds: function (id, that) {
            var ids = id.split(';');
            setTimeout(function () {
                for (var i = 0; i < ids.length; i++) {
                    if (ids[i].trim() != '') {
                        $('#' + ids[i]).bind('input', function (e) {
                            var index = e.target.id.charAt(e.target.id.length - 1);
                            var value = e.target.value;
                            that.userAnswers.splice(index, 1, value)
                        })
                    }
                }
            }, 300)
        },
        getIndex: function (val) {
            return ' ' + String.fromCharCode(val + 65) + '. ';
        },


        display: function () {
            console.log(this.wrongAnswer())

        },
    },
    mounted: function () {
    },
    computed: {
        wrongAnswer: function () {
            var right = true;
            if (this.userAnswers.length != this.question.Answer.length) {
                right = false;
            } else {
                for (var i = 0; i < this.userAnswers.length; i++) {
                    if (this.userAnswers[i] != this.question.Answer[i].AnswerContent) {
                        right = false;
                        break;
                    }
                }
            }
            return right ? '' : 'wrong-answer';
        }
    },
    watch: {},
    template: '<div :class="wrongAnswer">' +
        '<p v-html="getFillInHtml(index,question)"></p>' +
        '<button @click="display()">display</button></div>'
})

var test = new Vue({
    el: '#exercise',
    data: {
        message: 'hello world',
        questions: []
    },
    methods: {
        getQuestionType: function (val) {
            return val;
        },
        getExercise: function () {
            var url = '/exercise';
            $.ajax({
                url: url,
                type: 'get',
                dataType: 'json',
                success: function (result) {
                    console.log(result)
                    for (var i in result.d) {
                        test.questions.push(result.d[i]);
                    }
                }
            })
        }
    },
    mounted: function () {
        this.getExercise();
    }
})