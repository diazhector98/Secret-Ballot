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

@DynamoDBTable(tableName = "secretballot-mobilehub-431411040-QuestionResults")

public class QuestionResultsDO {
    private String _questionId;
    private Double _votes1;
    private Double _votes2;
    private Double _votes3;

    @DynamoDBHashKey(attributeName = "questionId")
    @DynamoDBAttribute(attributeName = "questionId")
    public String getQuestionId() {
        return _questionId;
    }

    public void setQuestionId(final String _questionId) {
        this._questionId = _questionId;
    }
    @DynamoDBAttribute(attributeName = "votes1")
    public Double getVotes1() {
        return _votes1;
    }

    public void setVotes1(final Double _votes1) {
        this._votes1 = _votes1;
    }
    @DynamoDBAttribute(attributeName = "votes2")
    public Double getVotes2() {
        return _votes2;
    }

    public void setVotes2(final Double _votes2) {
        this._votes2 = _votes2;
    }
    @DynamoDBAttribute(attributeName = "votes3")
    public Double getVotes3() {
        return _votes3;
    }

    public void setVotes3(final Double _votes3) {
        this._votes3 = _votes3;
    }

}
