package com.example.administrator.retrofit;

import java.util.List;

/**
 * Created by Administrator on 2016/7/19.
 */
public class Data {


    private int pageNo;
    private int pageSize;
    private int total;

    private List<DataBean> data;
    /**
     * articleType : n
     * classfy :
     * id : 8454217
     * image : http://img0.pcauto.com.cn/pcauto/nation/ycxc/1607/APP_1.jpg
     * pubDate : 2016-07-19
     * topicUrl : http://www.pcauto.com.cn/nation/845/8454217.html
     * url : http://www.pcauto.com.cn/nation/845/8454217.html
     */

    private List<FocusBean> focus;
    private List<?> topData;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public List<FocusBean> getFocus() {
        return focus;
    }

    public void setFocus(List<FocusBean> focus) {
        this.focus = focus;
    }

    public List<?> getTopData() {
        return topData;
    }

    public void setTopData(List<?> topData) {
        this.topData = topData;
    }

    public static class DataBean {
        private String articleType;
        private int channelId;
        private String channelName;
        private String classfy;
        private int count;
        private int downs;
        private int floorCount;
        private String id;
        private String image;
        private String imageList;
        private String pubDate;
        private String title;
        private int type;
        private int ups;
        private String url;
        private String voteId;

        public String getArticleType() {
            return articleType;
        }

        public void setArticleType(String articleType) {
            this.articleType = articleType;
        }

        public int getChannelId() {
            return channelId;
        }

        public void setChannelId(int channelId) {
            this.channelId = channelId;
        }

        public String getChannelName() {
            return channelName;
        }

        public void setChannelName(String channelName) {
            this.channelName = channelName;
        }

        public String getClassfy() {
            return classfy;
        }

        public void setClassfy(String classfy) {
            this.classfy = classfy;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getDowns() {
            return downs;
        }

        public void setDowns(int downs) {
            this.downs = downs;
        }

        public int getFloorCount() {
            return floorCount;
        }

        public void setFloorCount(int floorCount) {
            this.floorCount = floorCount;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getImageList() {
            return imageList;
        }

        public void setImageList(String imageList) {
            this.imageList = imageList;
        }

        public String getPubDate() {
            return pubDate;
        }

        public void setPubDate(String pubDate) {
            this.pubDate = pubDate;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getUps() {
            return ups;
        }

        public void setUps(int ups) {
            this.ups = ups;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getVoteId() {
            return voteId;
        }

        public void setVoteId(String voteId) {
            this.voteId = voteId;
        }
    }

    public static class FocusBean {
        private String articleType;
        private String classfy;
        private String id;
        private String image;
        private String pubDate;
        private String topicUrl;
        private String url;

        public String getArticleType() {
            return articleType;
        }

        public void setArticleType(String articleType) {
            this.articleType = articleType;
        }

        public String getClassfy() {
            return classfy;
        }

        public void setClassfy(String classfy) {
            this.classfy = classfy;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getPubDate() {
            return pubDate;
        }

        public void setPubDate(String pubDate) {
            this.pubDate = pubDate;
        }

        public String getTopicUrl() {
            return topicUrl;
        }

        public void setTopicUrl(String topicUrl) {
            this.topicUrl = topicUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
