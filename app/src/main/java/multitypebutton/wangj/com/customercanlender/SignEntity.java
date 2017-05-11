package multitypebutton.wangj.com.customercanlender;

import java.util.List;

/**
 * 当前类注释：
 * <p>
 * Author :LeonWang <p>
 * Created  2017/5/10.18:41 <p>
 * Description:
 * <p>
 * E-mail:lijiawangjun@gmail.com
 */

public class SignEntity {


    /**
     * appClient : false
     * canSign : false
     * countResign : 1
     * customerSignInfos : [{"signTime":"2017-05-22 09:22:39","signTypes":"normal","times":13},{"signTime":"2017-05-21 09:22:06","signTypes":"normal","times":12},{"signTime":"2017-05-20 09:22:24","signTypes":"normal","times":11},{"signTime":"2017-05-19 09:22:25","signTypes":"normal","times":10},{"signTime":"2017-05-18 09:22:08","signTypes":"normal","times":9},{"signTime":"2017-05-17 09:22:19","signTypes":"normal","times":8},{"signTime":"2017-05-16 09:22:22","signTypes":"normal","times":7},{"signTime":"2017-05-15 09:22:25","signTypes":"normal","times":6},{"signTime":"2017-05-14 09:22:08","signTypes":"normal","times":5},{"signTime":"2017-05-13 09:22:21","signTypes":"normal","times":4},{"signTime":"2017-05-12 09:22:51","signTypes":"normal","times":3},{"signTime":"2017-05-11 09:22:21","signTypes":"normal","times":2},{"signTime":"2017-05-10 09:35:47","signTypes":"normal","times":1},{"signTime":"2017-05-02 00:00:00","signTypes":"resign","times":1}]
     * grade : V4珀金会员
     * isSignToday : true
     * merchOrderNo : 20170510142844140
     * partnerId : 15977111112
     * protocol : HTTP_FORM_JSON
     * requestNo : 20170510142844140
     * resultCode : EXECUTE_SUCCESS
     * resultMessage : 成功
     * serverTime : 2017-05-22 09:30:46
     * service : customerSignQuery
     * sign : fd0d9bce06900e1f844d0938c8668266
     * signPointToday : 5
     * signPointTom : 5
     * signType : MD5
     * success : true
     * times : 13
     * timesMonth : 14
     * totalPoint : 21075
     * version : 1.0
     */

    private boolean appClient;
    private boolean canSign;
    private int countResign;
    private String grade;
    private boolean isSignToday;
    private String merchOrderNo;
    private String partnerId;
    private String protocol;
    private String requestNo;
    private String resultCode;
    private String resultMessage;
    private String serverTime;
    private String service;
    private String sign;
    private int signPointToday;
    private int signPointTom;
    private String signType;
    private boolean success;
    private int times;
    private int timesMonth;
    private int totalPoint;
    private String version;
    private List<CustomerSignInfosEntity> customerSignInfos;

    public void setAppClient(boolean appClient) {
        this.appClient = appClient;
    }

    public void setCanSign(boolean canSign) {
        this.canSign = canSign;
    }

    public void setCountResign(int countResign) {
        this.countResign = countResign;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setIsSignToday(boolean isSignToday) {
        this.isSignToday = isSignToday;
    }

    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public void setServerTime(String serverTime) {
        this.serverTime = serverTime;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setSignPointToday(int signPointToday) {
        this.signPointToday = signPointToday;
    }

    public void setSignPointTom(int signPointTom) {
        this.signPointTom = signPointTom;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public void setTimesMonth(int timesMonth) {
        this.timesMonth = timesMonth;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setCustomerSignInfos(List<CustomerSignInfosEntity> customerSignInfos) {
        this.customerSignInfos = customerSignInfos;
    }

    public boolean getAppClient() {
        return appClient;
    }

    public boolean getCanSign() {
        return canSign;
    }

    public int getCountResign() {
        return countResign;
    }

    public String getGrade() {
        return grade;
    }

    public boolean getIsSignToday() {
        return isSignToday;
    }

    public String getMerchOrderNo() {
        return merchOrderNo;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public String getServerTime() {
        return serverTime;
    }

    public String getService() {
        return service;
    }

    public String getSign() {
        return sign;
    }

    public int getSignPointToday() {
        return signPointToday;
    }

    public int getSignPointTom() {
        return signPointTom;
    }

    public String getSignType() {
        return signType;
    }

    public boolean getSuccess() {
        return success;
    }

    public int getTimes() {
        return times;
    }

    public int getTimesMonth() {
        return timesMonth;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public String getVersion() {
        return version;
    }

    public List<CustomerSignInfosEntity> getCustomerSignInfos() {
        return customerSignInfos;
    }

    public static class CustomerSignInfosEntity {
        /**
         * signTime : 2017-05-22 09:22:39
         * signTypes : normal
         * times : 13
         */

        private String signTime;
        private String signTypes;
        private int times;

        public void setSignTime(String signTime) {
            this.signTime = signTime;
        }

        public void setSignTypes(String signTypes) {
            this.signTypes = signTypes;
        }

        public void setTimes(int times) {
            this.times = times;
        }

        public String getSignTime() {
            return signTime;
        }

        public String getSignTypes() {
            return signTypes;
        }

        public int getTimes() {
            return times;
        }
    }
}
