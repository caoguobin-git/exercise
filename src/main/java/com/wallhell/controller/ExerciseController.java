/***********************************************
 * File Name: ExerciseController
 * @author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 22 11 2019 上午 10:25
 ***********************************************/

package com.wallhell.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "/exercise")
public class ExerciseController {

    @GetMapping(value = "")
    @ResponseBody
    public Object getExercise() throws JsonProcessingException {
        Map map = new ObjectMapper().readValue("{\n" +
                "  \"d\": [\n" +
                "    {\n" +
                "      \"QuestionId\": \"d5c2b43c-215f-4fd2-a8a9-fa22ff3199fe\",\n" +
                "      \"Topic\": \"资产负债率和利息保障倍数均属于()指标。\",\n" +
                "      \"Score\": 0.5,\n" +
                "      \"PageNumber\": \"166\",\n" +
                "      \"IsShowPageNumber\": \"True\",\n" +
                "      \"AnalyticDesc\": \"资产负债率、负债与所有者权益比率、负债与有形净资产比率和利息保障倍数等，统称为杠杆比率。\",\n" +
                "      \"KnowledgeId\": \"\",\n" +
                "      \"AnswersIds\": \"2b88e769-38b8-401f-9333-24851e8767b9\",\n" +
                "      \"ParentID\": \"\",\n" +
                "      \"QuestionLevel\": \"易\",\n" +
                "      \"AnalyticUrl\": \"\",\n" +
                "      \"QuestionMainType\": \"single-select\",\n" +
                "      \"WrongID\": \"ae3cec79-cd3f-4e63-9dfe-d9ad8f1ab3ca\",\n" +
                "      \"labelID\": null,\n" +
                "      \"ScheduleItemsID\": \"0ac2f03e-a752-47eb-9001-5409fcca7fdd\",\n" +
                "      \"QuestionType\": \"single-select\",\n" +
                "      \"ChoiceID\": \"\",\n" +
                "      \"IsRight\": 2,\n" +
                "      \"ScheduleID\": null,\n" +
                "      \"ParentTopic\": \"\",\n" +
                "      \"ExamId\": \"dda98fbe-ab9b-f527-bfcc-23324cc9b218\",\n" +
                "      \"ChapterID\": null,\n" +
                "      \"Location\": 0,\n" +
                "      \"Answer\": [\n" +
                "        {\n" +
                "          \"AnswerID\": \"aecea6bf-5ebf-44bd-b501-a21ac0e8e431\",\n" +
                "          \"AnswerContent\": \"盈利比率\",\n" +
                "          \"QuestionId\": \"d5c2b43c-215f-4fd2-a8a9-fa22ff3199fe\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"AnswerID\": \"607cee29-b8c9-4b45-a882-0f8fbd3fc164\",\n" +
                "          \"AnswerContent\": \"资产比率\",\n" +
                "          \"QuestionId\": \"d5c2b43c-215f-4fd2-a8a9-fa22ff3199fe\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"AnswerID\": \"2b88e769-38b8-401f-9333-24851e8767b9\",\n" +
                "          \"AnswerContent\": \"杠杆比率\",\n" +
                "          \"QuestionId\": \"d5c2b43c-215f-4fd2-a8a9-fa22ff3199fe\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"AnswerID\": \"6e5d2088-cd20-4665-943d-6766a6c8b0ba\",\n" +
                "          \"AnswerContent\": \"负债比率\",\n" +
                "          \"QuestionId\": \"d5c2b43c-215f-4fd2-a8a9-fa22ff3199fe\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"QuestionId\": \"c84e6269-194a-4ff4-b3c0-8244589a922f\",\n" +
                "      \"Topic\": \"下列各项中，（）不属于企业资产负债表的科目。 \",\n" +
                "      \"Score\": 0.5,\n" +
                "      \"PageNumber\": \"156\",\n" +
                "      \"IsShowPageNumber\": \"True\",\n" +
                "      \"AnalyticDesc\": \"资产负债表是反映借款人在某一特定日期财务状况的财务报表。财务费用不属于企业资产负债表的科目。\",\n" +
                "      \"KnowledgeId\": \"\",\n" +
                "      \"AnswersIds\": \"b337251a-3db4-4df8-a298-4dd8c96285e0\",\n" +
                "      \"ParentID\": \"\",\n" +
                "      \"QuestionLevel\": \"易\",\n" +
                "      \"AnalyticUrl\": \"\",\n" +
                "      \"QuestionMainType\": \"single-select\",\n" +
                "      \"WrongID\": \"83b59ad5-bfad-419e-b9d9-e5a18d6534b7\",\n" +
                "      \"labelID\": null,\n" +
                "      \"ScheduleItemsID\": null,\n" +
                "      \"QuestionType\": \"single-select\",\n" +
                "      \"ChoiceID\": \"\",\n" +
                "      \"IsRight\": 0,\n" +
                "      \"ScheduleID\": null,\n" +
                "      \"ParentTopic\": \"\",\n" +
                "      \"ExamId\": \"dda98fbe-ab9b-f527-bfcc-23324cc9b218\",\n" +
                "      \"ChapterID\": null,\n" +
                "      \"Location\": 0,\n" +
                "      \"Answer\": [\n" +
                "        {\n" +
                "          \"AnswerID\": \"f8c7bc36-a8dd-4676-a6e2-9ba1c74ef5be\",\n" +
                "          \"AnswerContent\": \"货币资金\",\n" +
                "          \"QuestionId\": \"c84e6269-194a-4ff4-b3c0-8244589a922f\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"AnswerID\": \"b337251a-3db4-4df8-a298-4dd8c96285e0\",\n" +
                "          \"AnswerContent\": \"财务费用\",\n" +
                "          \"QuestionId\": \"c84e6269-194a-4ff4-b3c0-8244589a922f\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"AnswerID\": \"b51ce326-4683-4b91-a66a-f2de2c18ad08\",\n" +
                "          \"AnswerContent\": \"短期投资\",\n" +
                "          \"QuestionId\": \"c84e6269-194a-4ff4-b3c0-8244589a922f\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"AnswerID\": \"0c393462-c631-45f1-a064-fd503025551a\",\n" +
                "          \"AnswerContent\": \"无形资产\",\n" +
                "          \"QuestionId\": \"c84e6269-194a-4ff4-b3c0-8244589a922f\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"QuestionId\": \"11c1dc0a-6290-4d8e-9459-3822dd340e04\",\n" +
                "      \"Topic\": \"对于长期销售增长企业，（ ）对于销售收入增长显得非常重要。 \",\n" +
                "      \"Score\": 0.5,\n" +
                "      \"PageNumber\": \"44\",\n" +
                "      \"IsShowPageNumber\": \"True\",\n" +
                "      \"AnalyticDesc\": \"营运资金增加对于销售收人的增长就显得非常重要。\",\n" +
                "      \"KnowledgeId\": \"\",\n" +
                "      \"AnswersIds\": \"fc51de50-fd22-41fd-8937-34e90645d65a\",\n" +
                "      \"ParentID\": \"\",\n" +
                "      \"QuestionLevel\": \"易\",\n" +
                "      \"AnalyticUrl\": \"\",\n" +
                "      \"QuestionMainType\": \"single-select\",\n" +
                "      \"WrongID\": \"11065ca1-a5d6-4c69-80c4-c06dff01e8ef\",\n" +
                "      \"labelID\": null,\n" +
                "      \"ScheduleItemsID\": null,\n" +
                "      \"QuestionType\": \"single-select\",\n" +
                "      \"ChoiceID\": \"\",\n" +
                "      \"IsRight\": 0,\n" +
                "      \"ScheduleID\": null,\n" +
                "      \"ParentTopic\": \"\",\n" +
                "      \"ExamId\": \"dda98fbe-ab9b-f527-bfcc-23324cc9b218\",\n" +
                "      \"ChapterID\": null,\n" +
                "      \"Location\": 0,\n" +
                "      \"Answer\": [\n" +
                "        {\n" +
                "          \"AnswerID\": \"faaac286-16a3-4856-a9f3-2e3392c5f97f\",\n" +
                "          \"AnswerContent\": \"科学技术\",\n" +
                "          \"QuestionId\": \"11c1dc0a-6290-4d8e-9459-3822dd340e04\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"AnswerID\": \"c33e6d7b-e054-436a-b0b7-b1da5c68ffa5\",\n" +
                "          \"AnswerContent\": \"季节因素\",\n" +
                "          \"QuestionId\": \"11c1dc0a-6290-4d8e-9459-3822dd340e04\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"AnswerID\": \"e1f850be-58bc-4092-93f7-474e7e983624\",\n" +
                "          \"AnswerContent\": \"资产负债结构\",\n" +
                "          \"QuestionId\": \"11c1dc0a-6290-4d8e-9459-3822dd340e04\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"AnswerID\": \"fc51de50-fd22-41fd-8937-34e90645d65a\",\n" +
                "          \"AnswerContent\": \"营运资金增加\",\n" +
                "          \"QuestionId\": \"11c1dc0a-6290-4d8e-9459-3822dd340e04\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"QuestionId\": \"2b220276-5dfb-43ec-b07a-e87575d71f69\",\n" +
                "      \"Topic\": \"商业银行中长期贷款结清后，原则上贷款档案需要再保管（）年。\",\n" +
                "      \"Score\": 0.5,\n" +
                "      \"PageNumber\": \"328\",\n" +
                "      \"IsShowPageNumber\": \"True\",\n" +
                "      \"AnalyticDesc\": \"中、长期贷款结清后原则上贷款档案需要再保管20年。\",\n" +
                "      \"KnowledgeId\": \"\",\n" +
                "      \"AnswersIds\": \"a25b6e7e-2c5b-47fa-8510-382e7e915b49\",\n" +
                "      \"ParentID\": \"\",\n" +
                "      \"QuestionLevel\": \"易\",\n" +
                "      \"AnalyticUrl\": \"\",\n" +
                "      \"QuestionMainType\": \"single-select\",\n" +
                "      \"WrongID\": null,\n" +
                "      \"labelID\": null,\n" +
                "      \"ScheduleItemsID\": null,\n" +
                "      \"QuestionType\": \"single-select\",\n" +
                "      \"ChoiceID\": \"\",\n" +
                "      \"IsRight\": 0,\n" +
                "      \"ScheduleID\": null,\n" +
                "      \"ParentTopic\": \"\",\n" +
                "      \"ExamId\": \"dda98fbe-ab9b-f527-bfcc-23324cc9b218\",\n" +
                "      \"ChapterID\": null,\n" +
                "      \"Location\": 0,\n" +
                "      \"Answer\": [\n" +
                "        {\n" +
                "          \"AnswerID\": \"5498d635-3178-464f-9fea-754393e413bf\",\n" +
                "          \"AnswerContent\": \"5\",\n" +
                "          \"QuestionId\": \"2b220276-5dfb-43ec-b07a-e87575d71f69\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"AnswerID\": \"7a49e628-febc-472e-b9b9-574a379385ec\",\n" +
                "          \"AnswerContent\": \"15\",\n" +
                "          \"QuestionId\": \"2b220276-5dfb-43ec-b07a-e87575d71f69\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"AnswerID\": \"6cad01d0-0d5d-472c-bd5f-8741c9487692\",\n" +
                "          \"AnswerContent\": \"10\",\n" +
                "          \"QuestionId\": \"2b220276-5dfb-43ec-b07a-e87575d71f69\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"AnswerID\": \"a25b6e7e-2c5b-47fa-8510-382e7e915b49\",\n" +
                "          \"AnswerContent\": \"20\",\n" +
                "          \"QuestionId\": \"2b220276-5dfb-43ec-b07a-e87575d71f69\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"QuestionId\": \"2b220276-5dfb-43ec-b07a-e87575d71f68\",\n" +
                "      \"Topic\": \"商业银行中长期贷款结清后，原则上贷款档案需要再保管____年,不能超过____年。\",\n" +
                "      \"Score\": 0.5,\n" +
                "      \"PageNumber\": \"328\",\n" +
                "      \"IsShowPageNumber\": \"True\",\n" +
                "      \"AnalyticDesc\": \"中、长期贷款结清后原则上贷款档案需要再保管20年。\",\n" +
                "      \"KnowledgeId\": \"\",\n" +
                "      \"AnswersIds\": \"5498d635-3178-464f-9fea-754393e413bf,5498d635-3178-464f-9fea-754393e413b0\",\n" +
                "      \"ParentID\": \"\",\n" +
                "      \"QuestionLevel\": \"易\",\n" +
                "      \"AnalyticUrl\": \"\",\n" +
                "      \"QuestionMainType\": \"填空题\",\n" +
                "      \"WrongID\": null,\n" +
                "      \"labelID\": null,\n" +
                "      \"ScheduleItemsID\": null,\n" +
                "      \"QuestionType\": \"fill-in\",\n" +
                "      \"ChoiceID\": \"\",\n" +
                "      \"IsRight\": 0,\n" +
                "      \"ScheduleID\": null,\n" +
                "      \"ParentTopic\": \"\",\n" +
                "      \"ExamId\": \"dda98fbe-ab9b-f527-bfcc-23324cc9b218\",\n" +
                "      \"ChapterID\": null,\n" +
                "      \"Location\": 0,\n" +
                "      \"Answer\": [\n" +
                "        {\n" +
                "          \"AnswerID\": \"5498d635-3178-464f-9fea-754393e413bf\",\n" +
                "          \"AnswerContent\": \"5\",\n" +
                "          \"QuestionId\": \"2b220276-5dfb-43ec-b07a-e87575d71f68\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"AnswerID\": \"5498d635-3178-464f-9fea-754393e413b0\",\n" +
                "          \"AnswerContent\": \"50\",\n" +
                "          \"QuestionId\": \"2b220276-5dfb-43ec-b07a-e87575d71f68\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}", Map.class);
        return map;
    }
}
