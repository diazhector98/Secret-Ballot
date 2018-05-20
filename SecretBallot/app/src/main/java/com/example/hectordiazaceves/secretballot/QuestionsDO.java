//package com.amazonaws.models.nosql;
package com.example.hectordiazaceves.secretballot;


import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBAttribute;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBIndexHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBIndexRangeKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBRangeKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBTable;

import java.util.List;
import java.util.Map;
import java.util.Set;

@DynamoDBTable(tableName = "secretballot-mobilehub-431411040-Questions")

public class QuestionsDO {

    private String _questionId;
    private Double _timestamp;
    private String _option1;
    private String _option2;
    private String _option3;
    private String _question;

    @DynamoDBHashKey(attributeName = "questionId")
    @DynamoDBAttribute(attributeName = "questionId")
    public String getQuestionId() {
        return _questionId;
    }

    public void setQuestionId(final String _questionId) {
        this._questionId = _questionId;
    }
    @DynamoDBRangeKey(attributeName = "timestamp")
    @DynamoDBAttribute(attributeName = "timestamp")
    public Double getTimestamp() {
        return _timestamp;
    }

    public void setTimestamp(final Double _timestamp) {
        this._timestamp = _timestamp;
    }
    @DynamoDBAttribute(attributeName = "option1")
    public String getOption1() {
        return _option1;
    }

    public void setOption1(final String _option1) {
        this._option1 = _option1;
    }
    @DynamoDBAttribute(attributeName = "option2")
    public String getOption2() {
        return _option2;
    }

    public void setOption2(final String _option2) {
        this._option2 = _option2;
    }
    @DynamoDBAttribute(attributeName = "option3")
    public String getOption3() {
        return _option3;
    }

    public void setOption3(final String _option3) {
        this._option3 = _option3;
    }
    @DynamoDBAttribute(attributeName = "question")
    public String getQuestion() {
        return _question;
    }

    public void setQuestion(final String _question) {
        this._question = _question;
    }

}
