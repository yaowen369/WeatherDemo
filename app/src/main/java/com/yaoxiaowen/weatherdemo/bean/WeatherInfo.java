package com.yaoxiaowen.weatherdemo.bean;

import java.io.Serializable;
import java.util.List;

/**
 * author：yaowen on 18/3/11 13:31
 * email：yaoxiaowen88@gmail.com
 * www.yaoxiaowen.com
 */

//Todo 未来可以实现 Parcelable
public class WeatherInfo implements Serializable{


    /**
     * error : 0
     * status : success
     * date : 2018-03-10
     * results : [{"currentCity":"杭州","pm25":"124","index":[{"des":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。","tipt":"穿衣指数","title":"穿衣","zs":"较舒适"},{"des":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。","tipt":"洗车指数","title":"洗车","zs":"较适宜"},{"des":"昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。","tipt":"感冒指数","title":"感冒","zs":"易发"},{"des":"天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。","tipt":"运动指数","title":"运动","zs":"较适宜"},{"des":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。","tipt":"紫外线强度指数","title":"紫外线强度","zs":"弱"}],"weather_data":[{"date":"周六 03月10日 (实时：12℃)","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/qing.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/qing.png","weather":"晴","wind":"南风微风","temperature":"17 ~ 6℃"},{"date":"周日","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/duoyun.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/yin.png","weather":"多云转阴","wind":"东南风3-4级","temperature":"21 ~ 8℃"},{"date":"周一","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/duoyun.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/duoyun.png","weather":"多云","wind":"南风微风","temperature":"23 ~ 11℃"},{"date":"周二","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/duoyun.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/duoyun.png","weather":"多云","wind":"南风微风","temperature":"24 ~ 13℃"}]}]
     */

    private int error;
    private String status;
    private String date;
    private List<ResultsBean> results;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "WeatherInfo{" +
                "error=" + error +
                ", status='" + status + '\'' +
                ", date='" + date + '\'' +
                ", results=" + results +
                '}';
    }

    public static class ResultsBean {
        /**
         * currentCity : 杭州
         * pm25 : 124
         * index : [{"des":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。","tipt":"穿衣指数","title":"穿衣","zs":"较舒适"},{"des":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。","tipt":"洗车指数","title":"洗车","zs":"较适宜"},{"des":"昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。","tipt":"感冒指数","title":"感冒","zs":"易发"},{"des":"天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。","tipt":"运动指数","title":"运动","zs":"较适宜"},{"des":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。","tipt":"紫外线强度指数","title":"紫外线强度","zs":"弱"}]
         * weather_data : [{"date":"周六 03月10日 (实时：12℃)","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/qing.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/qing.png","weather":"晴","wind":"南风微风","temperature":"17 ~ 6℃"},{"date":"周日","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/duoyun.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/yin.png","weather":"多云转阴","wind":"东南风3-4级","temperature":"21 ~ 8℃"},{"date":"周一","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/duoyun.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/duoyun.png","weather":"多云","wind":"南风微风","temperature":"23 ~ 11℃"},{"date":"周二","dayPictureUrl":"http://api.map.baidu.com/images/weather/day/duoyun.png","nightPictureUrl":"http://api.map.baidu.com/images/weather/night/duoyun.png","weather":"多云","wind":"南风微风","temperature":"24 ~ 13℃"}]
         */

        private String currentCity;
        private String pm25;
        private List<IndexBean> index;
        private List<WeatherDataBean> weather_data;

        public String getCurrentCity() {
            return currentCity;
        }

        public void setCurrentCity(String currentCity) {
            this.currentCity = currentCity;
        }

        public String getPm25() {
            return pm25;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }

        public List<IndexBean> getIndex() {
            return index;
        }

        public void setIndex(List<IndexBean> index) {
            this.index = index;
        }

        public List<WeatherDataBean> getWeather_data() {
            return weather_data;
        }

        public void setWeather_data(List<WeatherDataBean> weather_data) {
            this.weather_data = weather_data;
        }

        public static class IndexBean {
            /**
             * des : 建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。
             * tipt : 穿衣指数
             * title : 穿衣
             * zs : 较舒适
             */

            private String des;
            private String tipt;
            private String title;
            private String zs;

            public String getDes() {
                return des;
            }

            public void setDes(String des) {
                this.des = des;
            }

            public String getTipt() {
                return tipt;
            }

            public void setTipt(String tipt) {
                this.tipt = tipt;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getZs() {
                return zs;
            }

            public void setZs(String zs) {
                this.zs = zs;
            }
        }

        public static class WeatherDataBean {
            /**
             * date : 周六 03月10日 (实时：12℃)
             * dayPictureUrl : http://api.map.baidu.com/images/weather/day/qing.png
             * nightPictureUrl : http://api.map.baidu.com/images/weather/night/qing.png
             * weather : 晴
             * wind : 南风微风
             * temperature : 17 ~ 6℃
             */

            private String date;
            private String dayPictureUrl;
            private String nightPictureUrl;
            private String weather;
            private String wind;
            private String temperature;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDayPictureUrl() {
                return dayPictureUrl;
            }

            public void setDayPictureUrl(String dayPictureUrl) {
                this.dayPictureUrl = dayPictureUrl;
            }

            public String getNightPictureUrl() {
                return nightPictureUrl;
            }

            public void setNightPictureUrl(String nightPictureUrl) {
                this.nightPictureUrl = nightPictureUrl;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }
        }
    }
}
