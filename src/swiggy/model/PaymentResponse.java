package swiggy.model;

import java.util.Date;

public class PaymentResponse {
    private String coRelationId;
    private String status;
    private Date responseDate;

    public PaymentResponse(String coRelationId, String status, Date responseDate) {
        this.coRelationId = coRelationId;
        this.status = status;
        this.responseDate = responseDate;
    }

    public String getCoRelationId() {
        return coRelationId;
    }

    public String getStatus() {
        return status;
    }

    public Date getResponseDate() {
        return responseDate;
    }
}
