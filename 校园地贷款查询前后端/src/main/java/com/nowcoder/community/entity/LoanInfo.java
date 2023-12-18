package com.nowcoder.community.entity;


public class LoanInfo {
    public String xueHao;
    public String xueYuan;
    private String loanDisbursement;
    private String deductionAmount;
    private String refundAmount;
    private String refundAccount;

    @Override
    public String toString() {
        return "LoanInfo{" +
                "xueHao='" + xueHao + '\'' +
                ", xueYuan='" + xueYuan + '\'' +
                ", loanDisbursement='" + loanDisbursement + '\'' +
                ", deductionAmount='" + deductionAmount + '\'' +
                ", refundAmount='" + refundAmount + '\'' +
                ", refundAccount='" + refundAccount + '\'' +
                '}';
    }

    public String getXueHao() {
        return xueHao;
    }

    public void setXueHao(String xueHao) {
        this.xueHao = xueHao;
    }

    public String getXueYuan() {
        return xueYuan;
    }

    public void setXueYuan(String xueYuan) {
        this.xueYuan = xueYuan;
    }

    public String getLoanDisbursement() {
        return loanDisbursement;
    }

    public void setLoanDisbursement(String loanDisbursement) {
        this.loanDisbursement = loanDisbursement;
    }

    public String getDeductionAmount() {
        return deductionAmount;
    }

    public void setDeductionAmount(String deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundAccount() {
        return refundAccount;
    }

    public void setRefundAccount(String refundAccount) {
        this.refundAccount = refundAccount;
    }
}
