获取天气预报的api

`http://api.map.baidu.com/telematics/v3/weather?location=杭州&output=json&ak=9IFC7MPIPL3mLy8GUVMwYSNE`


返回的是 json格式的数据

```json
{
    "error":0,
    "status":"success",
    "date":"2018-03-10",
    "results":[
        {
            "currentCity":"杭州",
            "pm25":"124",
            "index":[
                {
                    "des":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。",
                    "tipt":"穿衣指数",
                    "title":"穿衣",
                    "zs":"较舒适"
                },
                {
                    "des":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。",
                    "tipt":"洗车指数",
                    "title":"洗车",
                    "zs":"较适宜"
                },
                {
                    "des":"昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。",
                    "tipt":"感冒指数",
                    "title":"感冒",
                    "zs":"易发"
                },
                {
                    "des":"天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。",
                    "tipt":"运动指数",
                    "title":"运动",
                    "zs":"较适宜"
                },
                {
                    "des":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。",
                    "tipt":"紫外线强度指数",
                    "title":"紫外线强度",
                    "zs":"弱"
                }
            ],
            "weather_data":[
                {
                    "date":"周六 03月10日 (实时：12℃)",
                    "dayPictureUrl":"http://api.map.baidu.com/images/weather/day/qing.png",
                    "nightPictureUrl":"http://api.map.baidu.com/images/weather/night/qing.png",
                    "weather":"晴",
                    "wind":"南风微风",
                    "temperature":"17 ~ 6℃"
                },
                {
                    "date":"周日",
                    "dayPictureUrl":"http://api.map.baidu.com/images/weather/day/duoyun.png",
                    "nightPictureUrl":"http://api.map.baidu.com/images/weather/night/yin.png",
                    "weather":"多云转阴",
                    "wind":"东南风3-4级",
                    "temperature":"21 ~ 8℃"
                },
                {
                    "date":"周一",
                    "dayPictureUrl":"http://api.map.baidu.com/images/weather/day/duoyun.png",
                    "nightPictureUrl":"http://api.map.baidu.com/images/weather/night/duoyun.png",
                    "weather":"多云",
                    "wind":"南风微风",
                    "temperature":"23 ~ 11℃"
                },
                {
                    "date":"周二",
                    "dayPictureUrl":"http://api.map.baidu.com/images/weather/day/duoyun.png",
                    "nightPictureUrl":"http://api.map.baidu.com/images/weather/night/duoyun.png",
                    "weather":"多云",
                    "wind":"南风微风",
                    "temperature":"24 ~ 13℃"
                }
            ]
        }
    ]
}


```


