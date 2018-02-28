package com.zp.mvp.main.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/2/28.
 */

public class MainBean {


    /**
     * type : 1
     * detail : {"rvEventList":[{"report_time":"2018-02-22 12:30","img_path":"android/0101541504f2429ba4d0ff1a5f5e58f3.jpg","event_code":"20180222123039DYH118ST217SH0N407","rv_name":"大岩河石湖村段","editable":"false","ad_name":"石湖村","source":"1","event_describe":"测试","event_type_name":"河道保洁","event_status":"5"},{"report_time":"2018-02-21 13:42","img_path":"android/ceb32ddbd34f40f6843d00aeb8344e11.jpg","event_code":"20180221134210DYH118ST217SH0N407","rv_name":"大岩河石湖村段","editable":"false","ad_name":"石湖村","source":"1","event_describe":"距离计算有误","event_type_name":"河道保洁","event_status":"5"},{"report_time":"2018-02-15 16:36","img_path":"android/9a917a2acf444f0fa8c3c51532ccf255.jpg","event_code":"20180215163611DYH118ST217SH0N407","rv_name":"大岩河石湖村段","editable":"false","ad_name":"石湖村","source":"1","event_describe":"距离有问题","event_type_name":"河道保洁","event_status":"5"},{"report_time":"2018-02-12 14:06","img_path":"android/8e8d72e902b44c949d952721717d23b0.jpg","event_code":"20180212140655DYH118ST217SH0N407","rv_name":"大岩河石湖村段","editable":"false","ad_name":"石湖村","source":"1","event_describe":"距离不准，光谷到武昌火车站，不止两公里。","event_type_name":"公示牌","event_status":"3"},{"report_time":"2018-02-10 20:56","img_path":"android/5fab5cedd6ff4d9e8ac74fcf99a1ce7b.jpg","event_code":"20180210205612DYH118ST217SH0N407","rv_name":"大岩河石湖村段","editable":"false","ad_name":"石湖村","source":"1","event_describe":"路线距离不正确，不应该只有600多米","event_type_name":"河道保洁","event_status":"3"},{"report_time":"2018-02-10 10:44","img_path":"android/88a8219d35134dc495eb234686b3bba5.jpg","event_code":"20180210104411NKS118ST215PK0N407","rv_name":"牛崆水","editable":"false","ad_name":"蒲坑村","source":"1","event_describe":"测试","event_type_name":"破坏水生态行为","event_status":"5"},{"report_time":"2018-02-09 10:21","img_path":"android/eee242e56af546b09367bef71c64dc08.jpg","event_code":"20180209102127DYH118ST217SH0N407","rv_name":"大岩河石湖村段","editable":"true","ad_name":"石湖村","source":"1","event_describe":"测试","event_type_name":"河底淤积","event_status":"1"},{"report_time":"2018-02-05 13:41","img_path":"android/7f9becb83b684252a45e2fa0c44b8a31.jpg","event_code":"20180205134141BWH118ST218BW0N407","rv_name":"白湾河白湾村段","editable":"true","ad_name":"白湾村","source":"1","event_describe":"测试","event_type_name":"巡查问题解决情况","event_status":"1"},{"report_time":"2018-02-01 16:26","img_path":"android/be8eb16bb8604536ba14e99d707d6509.jpg","event_code":"20180201162638","rv_name":"大岩河石湖村段","editable":"true","ad_name":"石湖村","source":"1","event_describe":"测试","event_type_name":"巡查问题解决情况","event_status":"1"},{"report_time":"2018-01-31 11:06","img_path":"android/ca36eaa1cbf1431fa696e55ced2e3ee9.jpg","event_code":"20180131110645","rv_name":"孔塘排","editable":"true","ad_name":"松岗村","source":"1","event_describe":"仍有大量垃圾未清理，请及时安排处理","event_type_name":"巡查问题解决情况","event_status":"1"}],"status":1}
     * title : 操作结果
     * content : 操作成功
     */

    private int type;
    private DetailBean detail;
    private String title;
    private String content;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public DetailBean getDetail() {
        return detail;
    }

    public void setDetail(DetailBean detail) {
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static class DetailBean {
        /**
         * rvEventList : [{"report_time":"2018-02-22 12:30","img_path":"android/0101541504f2429ba4d0ff1a5f5e58f3.jpg","event_code":"20180222123039DYH118ST217SH0N407","rv_name":"大岩河石湖村段","editable":"false","ad_name":"石湖村","source":"1","event_describe":"测试","event_type_name":"河道保洁","event_status":"5"},{"report_time":"2018-02-21 13:42","img_path":"android/ceb32ddbd34f40f6843d00aeb8344e11.jpg","event_code":"20180221134210DYH118ST217SH0N407","rv_name":"大岩河石湖村段","editable":"false","ad_name":"石湖村","source":"1","event_describe":"距离计算有误","event_type_name":"河道保洁","event_status":"5"},{"report_time":"2018-02-15 16:36","img_path":"android/9a917a2acf444f0fa8c3c51532ccf255.jpg","event_code":"20180215163611DYH118ST217SH0N407","rv_name":"大岩河石湖村段","editable":"false","ad_name":"石湖村","source":"1","event_describe":"距离有问题","event_type_name":"河道保洁","event_status":"5"},{"report_time":"2018-02-12 14:06","img_path":"android/8e8d72e902b44c949d952721717d23b0.jpg","event_code":"20180212140655DYH118ST217SH0N407","rv_name":"大岩河石湖村段","editable":"false","ad_name":"石湖村","source":"1","event_describe":"距离不准，光谷到武昌火车站，不止两公里。","event_type_name":"公示牌","event_status":"3"},{"report_time":"2018-02-10 20:56","img_path":"android/5fab5cedd6ff4d9e8ac74fcf99a1ce7b.jpg","event_code":"20180210205612DYH118ST217SH0N407","rv_name":"大岩河石湖村段","editable":"false","ad_name":"石湖村","source":"1","event_describe":"路线距离不正确，不应该只有600多米","event_type_name":"河道保洁","event_status":"3"},{"report_time":"2018-02-10 10:44","img_path":"android/88a8219d35134dc495eb234686b3bba5.jpg","event_code":"20180210104411NKS118ST215PK0N407","rv_name":"牛崆水","editable":"false","ad_name":"蒲坑村","source":"1","event_describe":"测试","event_type_name":"破坏水生态行为","event_status":"5"},{"report_time":"2018-02-09 10:21","img_path":"android/eee242e56af546b09367bef71c64dc08.jpg","event_code":"20180209102127DYH118ST217SH0N407","rv_name":"大岩河石湖村段","editable":"true","ad_name":"石湖村","source":"1","event_describe":"测试","event_type_name":"河底淤积","event_status":"1"},{"report_time":"2018-02-05 13:41","img_path":"android/7f9becb83b684252a45e2fa0c44b8a31.jpg","event_code":"20180205134141BWH118ST218BW0N407","rv_name":"白湾河白湾村段","editable":"true","ad_name":"白湾村","source":"1","event_describe":"测试","event_type_name":"巡查问题解决情况","event_status":"1"},{"report_time":"2018-02-01 16:26","img_path":"android/be8eb16bb8604536ba14e99d707d6509.jpg","event_code":"20180201162638","rv_name":"大岩河石湖村段","editable":"true","ad_name":"石湖村","source":"1","event_describe":"测试","event_type_name":"巡查问题解决情况","event_status":"1"},{"report_time":"2018-01-31 11:06","img_path":"android/ca36eaa1cbf1431fa696e55ced2e3ee9.jpg","event_code":"20180131110645","rv_name":"孔塘排","editable":"true","ad_name":"松岗村","source":"1","event_describe":"仍有大量垃圾未清理，请及时安排处理","event_type_name":"巡查问题解决情况","event_status":"1"}]
         * status : 1
         */

        private int status;
        private List<RvEventListBean> rvEventList;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public List<RvEventListBean> getRvEventList() {
            return rvEventList;
        }

        public void setRvEventList(List<RvEventListBean> rvEventList) {
            this.rvEventList = rvEventList;
        }

        public static class RvEventListBean {
            /**
             * report_time : 2018-02-22 12:30
             * img_path : android/0101541504f2429ba4d0ff1a5f5e58f3.jpg
             * event_code : 20180222123039DYH118ST217SH0N407
             * rv_name : 大岩河石湖村段
             * editable : false
             * ad_name : 石湖村
             * source : 1
             * event_describe : 测试
             * event_type_name : 河道保洁
             * event_status : 5
             */

            private String report_time;
            private String img_path;
            private String event_code;
            private String rv_name;
            private String editable;
            private String ad_name;
            private String source;
            private String event_describe;
            private String event_type_name;
            private String event_status;

            public String getReport_time() {
                return report_time;
            }

            public void setReport_time(String report_time) {
                this.report_time = report_time;
            }

            public String getImg_path() {
                return "http://120.79.90.233:8080/imageserver/qxhzz/uploadfile/" + img_path;
            }

            public void setImg_path(String img_path) {
                this.img_path = img_path;
            }

            public String getEvent_code() {
                return event_code;
            }

            public void setEvent_code(String event_code) {
                this.event_code = event_code;
            }

            public String getRv_name() {
                return rv_name;
            }

            public void setRv_name(String rv_name) {
                this.rv_name = rv_name;
            }

            public String getEditable() {
                return editable;
            }

            public void setEditable(String editable) {
                this.editable = editable;
            }

            public String getAd_name() {
                return ad_name;
            }

            public void setAd_name(String ad_name) {
                this.ad_name = ad_name;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getEvent_describe() {
                return event_describe;
            }

            public void setEvent_describe(String event_describe) {
                this.event_describe = event_describe;
            }

            public String getEvent_type_name() {
                return event_type_name;
            }

            public void setEvent_type_name(String event_type_name) {
                this.event_type_name = event_type_name;
            }

            public String getEvent_status() {
                return event_status;
            }

            public void setEvent_status(String event_status) {
                this.event_status = event_status;
            }
        }
    }
}
