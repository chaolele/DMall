package com.ch.mall.vo;

import java.util.List;

/**
 * Created by lenovo on 2016/6/12.
 */
public class Goods {


    /**
     * status : 1
     * reason : true
     * results : [{"advert_id":8724,"page_id":4,"location_id":2,"show_id":3,"contents":"我是新人，我有特权","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/61/61d4b28c7a1fb3d54768f4b786924af4.png","is_click":1,"event_id":3,"event_content":{"id":5702},"tips":"专享价9元起"},{"advert_id":8940,"page_id":4,"location_id":2,"show_id":3,"contents":"耐克当季好货鞋服热荐","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/93/9318099fe1d4e192ab80de5cfbebe0c8.jpg","is_click":1,"event_id":3,"event_content":{"id":5812},"tips":"99元起"},{"advert_id":8939,"page_id":4,"location_id":2,"show_id":3,"contents":"阿迪达斯跑步鞋专场","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/5c/5c63588d8b2b697c82cc183e441773e0.jpg","is_click":1,"event_id":3,"event_content":{"id":5811},"tips":"低至4折"},{"advert_id":8938,"page_id":4,"location_id":2,"show_id":3,"contents":"李宁断码好货出清价","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/bc/bcb5db1e1b6eb83087432ac4ad093376.jpg","is_click":1,"event_id":3,"event_content":{"id":5810},"tips":"18元起"},{"advert_id":8875,"page_id":4,"location_id":2,"show_id":3,"contents":"运动一周好货TOP500","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/f1/f10278c8314d2b4b69efa72a9162fa64.jpg","is_click":1,"event_id":3,"event_content":{"id":5794},"tips":"低至2.5折"},{"advert_id":8788,"page_id":4,"location_id":2,"show_id":3,"contents":"卡骆驰   全家\u201c棕\u201d动员","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/11/11776df0f44e08b53df63e146ba4fb3a.jpg","is_click":1,"event_id":3,"event_content":{"id":5744},"tips":"69元起"},{"advert_id":8873,"page_id":4,"location_id":2,"show_id":3,"contents":"耐克全品类专场","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/93/93fb86e2eaa0a3cb036d4cf5726b3cfa.jpg","is_click":1,"event_id":3,"event_content":{"id":5790},"tips":"5.9折封顶"},{"advert_id":8874,"page_id":4,"location_id":2,"show_id":3,"contents":"NB复古鞋街头潮咖","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/3e/3e0344ef628796727c7c0e49a1f44792.jpg","is_click":1,"event_id":3,"event_content":{"id":5792},"tips":"269元起"},{"advert_id":8802,"page_id":4,"location_id":2,"show_id":3,"contents":"斯凯奇 出游必备休闲鞋","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/84/84abea69edfe8b659b63efbfb231e67c.jpg","is_click":1,"event_id":3,"event_content":{"id":5753},"tips":"149元起"},{"advert_id":8872,"page_id":4,"location_id":2,"show_id":3,"contents":"耐克阿迪蓝/足球鞋一件减30","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/f3/f345ff94e64bd82a236a0197e1080503.jpg","is_click":1,"event_id":3,"event_content":{"id":5789},"tips":"两件减70"},{"advert_id":8914,"page_id":4,"location_id":2,"show_id":3,"contents":"MLB假期特惠","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/ee/eee0c6ce5769f6d5df43dae114fc680e.jpg","is_click":1,"event_id":3,"event_content":{"id":5819},"tips":"全场39元起"},{"advert_id":8871,"page_id":4,"location_id":2,"show_id":3,"contents":"李宁全品类买2免1","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/fe/fe1996b16b475bbd44e744218b659bb6.jpg","is_click":1,"event_id":3,"event_content":{"id":5788},"tips":"最低79两件"},{"advert_id":8918,"page_id":4,"location_id":2,"show_id":3,"contents":"端午特惠-T恤","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/3f/3fadaddac2e196279f2081a3f2c2508d.jpg","is_click":1,"event_id":3,"event_content":{"id":5823},"tips":"99元三件"},{"advert_id":8763,"page_id":4,"location_id":2,"show_id":3,"contents":"阿迪NEO运动休闲","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/10/1084ea4d7ad8ec6983df797eadc060d3.jpg","is_click":1,"event_id":3,"event_content":{"id":5720},"tips":"低至149元"},{"advert_id":8803,"page_id":4,"location_id":2,"show_id":3,"contents":"卡骆驰  夏日新品","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/f6/f68e4e4b28ad049d24a15a08f4cbcbb7.jpg","is_click":1,"event_id":3,"event_content":{"id":5754},"tips":"129元起"},{"advert_id":8895,"page_id":4,"location_id":2,"show_id":3,"contents":"匡威劲价两件减30/三件减50","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/52/52330180ce9f0d7634dafb8a8363d00b.jpg","is_click":1,"event_id":3,"event_content":{"id":5813},"tips":"99元起"},{"advert_id":8927,"page_id":4,"location_id":2,"show_id":3,"contents":"悦动COOL夏 添柏岚专场","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/35/35e8b2613712e6b7e7fcdf67a4ee3eae.jpg","is_click":1,"event_id":3,"event_content":{"id":5797},"tips":"4折封顶"},{"advert_id":8896,"page_id":4,"location_id":2,"show_id":3,"contents":"卡帕百余好货一口价","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/3f/3f49323da1c422a802b931b44072292d.jpg","is_click":1,"event_id":3,"event_content":{"id":5814},"tips":"19-99元"},{"advert_id":8897,"page_id":4,"location_id":2,"show_id":3,"contents":"鬼冢虎亚瑟士满100减10块可累计","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/25/25a6f01525ac77fcb90838ac2e3cb159.jpg","is_click":1,"event_id":3,"event_content":{"id":5815},"tips":"319元起"},{"advert_id":8860,"page_id":4,"location_id":2,"show_id":3,"contents":"Levis&G-star","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/a9/a90f73113e3e8a82170aaed334c54d88.jpg","is_click":1,"event_id":3,"event_content":{"id":5781},"tips":"下单立减30"},{"advert_id":8926,"page_id":4,"location_id":2,"show_id":3,"contents":"野练怕汗不够留 乐斯菲斯专场","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/b5/b5a64b6c6dd2648f8c362af394e55630.jpg","is_click":1,"event_id":3,"event_content":{"id":5782},"tips":"4.5折封顶"},{"advert_id":8796,"page_id":4,"location_id":2,"show_id":3,"contents":"爱乐   疯狂拼单季","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/59/59d70b5adf4b47870a641d8a157ff628.jpg","is_click":1,"event_id":3,"event_content":{"id":5747},"tips":"259元2双"},{"advert_id":8775,"page_id":4,"location_id":2,"show_id":3,"contents":"李宁应季单品","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/78/78c6ec17e940e8348a2d3beb495ce045.jpg","is_click":1,"event_id":3,"event_content":{"id":5728},"tips":"低至19元"},{"advert_id":8925,"page_id":4,"location_id":2,"show_id":3,"contents":"悦动COOL夏 哥伦比亚专场","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/f7/f736e7a3801459b0f40d5375564923bd.jpg","is_click":1,"event_id":3,"event_content":{"id":5796},"tips":"2.1折起"},{"advert_id":8915,"page_id":4,"location_id":2,"show_id":3,"contents":"端午特惠-内裤&袜子","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/cb/cb0461cbce126eecedca17fd004fc7e9.jpg","is_click":1,"event_id":3,"event_content":{"id":5820},"tips":"69元三件"},{"advert_id":8773,"page_id":4,"location_id":2,"show_id":3,"contents":"阿迪李宁涉水/凉拖/沙滩鞋","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/48/481264d533399843dc8db1673683b8f8.jpg","is_click":1,"event_id":3,"event_content":{"id":5726},"tips":"低至139元"},{"advert_id":8876,"page_id":4,"location_id":2,"show_id":3,"contents":"万斯趣享街头潮鞋","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/19/1966a1a1d245d2ef7cae3783fdd1e4d8.jpg","is_click":1,"event_id":3,"event_content":{"id":5795},"tips":"低至3.5折"},{"advert_id":8856,"page_id":4,"location_id":2,"show_id":3,"contents":"奥康+策乐+保罗盖帝三大品牌联合","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/e8/e81888a6a68e2b3be04b7680907703ae.jpg","is_click":1,"event_id":3,"event_content":{"id":5755},"tips":"59元起"},{"advert_id":8795,"page_id":4,"location_id":2,"show_id":3,"contents":"花花公子男鞋专场","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/7a/7ab7beefc6415d3d78307955c94ef77f.jpg","is_click":1,"event_id":3,"event_content":{"id":5746},"tips":"159元起"},{"advert_id":8793,"page_id":4,"location_id":2,"show_id":3,"contents":"战地吉普品牌专场","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/6a/6a4514939d292b9f91c4c96a0fa70f76.jpg","is_click":1,"event_id":3,"event_content":{"id":5770},"tips":"59元起"},{"advert_id":8764,"page_id":4,"location_id":2,"show_id":3,"contents":"NB鬼冢虎亚瑟潮牌断码","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/af/af57f8e6e857141244a746f2838ed073.jpg","is_click":1,"event_id":3,"event_content":{"id":5721},"tips":"269元起"},{"advert_id":8928,"page_id":4,"location_id":2,"show_id":3,"contents":"户外断码甩卖捡漏随缘","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/13/13fb3cdfb0ef48d6673a7948decca6f9.jpg","is_click":1,"event_id":3,"event_content":{"id":5778},"tips":"9元起"},{"advert_id":8771,"page_id":4,"location_id":2,"show_id":3,"contents":"匹克贵人鸟李宁好货买一送一","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/4e/4e006be6d8d55d68d847c33f470f0a27.jpg","is_click":1,"event_id":3,"event_content":{"id":5724},"tips":"最低79两件"},{"advert_id":8916,"page_id":4,"location_id":2,"show_id":3,"contents":"Lee假期特惠","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/78/7870a40f2c6a17954f9cb6bed9e42c47.jpg","is_click":1,"event_id":3,"event_content":{"id":5821},"tips":"69元起"},{"advert_id":8769,"page_id":4,"location_id":2,"show_id":3,"contents":"安踏夏季鞋服","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/76/76a68ca4f349cbec014e45f099f3406c.jpg","is_click":1,"event_id":3,"event_content":{"id":5722},"tips":"169封顶"},{"advert_id":8864,"page_id":4,"location_id":2,"show_id":3,"contents":"你总要有双三叶草","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/2b/2bf7b8b9817afebf311b2d84c4966a32.jpg","is_click":1,"event_id":3,"event_content":{"id":5786},"tips":"589元起"},{"advert_id":8774,"page_id":4,"location_id":2,"show_id":3,"contents":"戏水正当季李宁游泳专场","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/5e/5e404f65d8555fbcd1b45649cbcdf695.jpg","is_click":1,"event_id":3,"event_content":{"id":5727},"tips":"38元起"},{"advert_id":8791,"page_id":4,"location_id":2,"show_id":3,"contents":"Dickies工装经典","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/5d/5d88eb528bf6ec857c0e77d5abed11ee.jpg","is_click":1,"event_id":3,"event_content":{"id":5768},"tips":"多件多折"},{"advert_id":8770,"page_id":4,"location_id":2,"show_id":3,"contents":"特步鸿星尔克当季TOP款","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/bf/bfe4dcb1b2799a83503dc128f79c3cad.jpg","is_click":1,"event_id":3,"event_content":{"id":5723},"tips":"159元封顶"},{"advert_id":8801,"page_id":4,"location_id":2,"show_id":3,"contents":"富贵鸟  新款特卖","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/37/3711888303f7eb5f7d9dcd64df6c92ba.jpg","is_click":1,"event_id":3,"event_content":{"id":5752},"tips":"最高减100"},{"advert_id":8752,"page_id":4,"location_id":2,"show_id":3,"contents":"狼爪特惠","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201603/04/04224e0ce1e62a95d42f4d96c4cda9b3.jpg","is_click":1,"event_id":3,"event_content":{"id":4882},"tips":"3.5折封顶"},{"advert_id":8917,"page_id":4,"location_id":2,"show_id":3,"contents":"Viishow品牌专场","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/01/015222faa81c7680ffcb5c5430afe06c.jpg","is_click":1,"event_id":3,"event_content":{"id":5822},"tips":"全场满减"},{"advert_id":8792,"page_id":4,"location_id":2,"show_id":3,"contents":"DC品牌专场","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/94/94ec9abb548365d9f5eb4d80533ded7e.jpg","is_click":1,"event_id":3,"event_content":{"id":5769},"tips":"69元起"},{"advert_id":8824,"page_id":4,"location_id":2,"show_id":3,"contents":"悦动COOL夏 哥伦比亚专场","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/f7/f736e7a3801459b0f40d5375564923bd.jpg","is_click":1,"event_id":3,"event_content":{"id":5741},"tips":"2.1折起"},{"advert_id":7886,"page_id":4,"location_id":2,"show_id":3,"contents":"清凉一夏宝贝出游","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201605/33/333a52c3acb449b7d8d69b821d05b3c3.jpg","is_click":1,"event_id":3,"event_content":{"id":5131},"tips":"49元起"},{"advert_id":8751,"page_id":4,"location_id":2,"show_id":3,"contents":"轻盈透气T恤/Polo衫","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/15/150eb083722e136201c44d60590c82fb.jpg","is_click":1,"event_id":3,"event_content":{"id":5312},"tips":"49元起"},{"advert_id":8772,"page_id":4,"location_id":2,"show_id":3,"contents":"361°polo/短袖/短裤","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/ef/ef95743f644f25e272d6e16eaac0a727.jpg","is_click":1,"event_id":3,"event_content":{"id":5725},"tips":"49-149"},{"advert_id":8799,"page_id":4,"location_id":2,"show_id":3,"contents":"星期六集团超级购","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/fd/fddbc9b603682a69283db73de036a281.jpg","is_click":1,"event_id":3,"event_content":{"id":5750},"tips":"最高减100"},{"advert_id":8857,"page_id":4,"location_id":2,"show_id":3,"contents":"好货不过百","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/5d/5d38808bccc70764813b3a7c8efc228e.jpg","is_click":1,"event_id":3,"event_content":{"id":5748},"tips":"129元2双"},{"advert_id":8794,"page_id":4,"location_id":2,"show_id":3,"contents":"康莉  初夏精选","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/41/4164ca7d97da69e9f2ad749405851625.jpg","is_click":1,"event_id":3,"event_content":{"id":5745},"tips":"169元起"},{"advert_id":8800,"page_id":4,"location_id":2,"show_id":3,"contents":"devo  潮人首选","advert_pic":"http://i.okaybuy.cn/images/multipic/new/201606/0d/0d4f047ff6c577b2174bca3c02bf8664.jpg","is_click":1,"event_id":3,"event_content":{"id":5751},"tips":"199元封顶"},{"advert_id":2351,"page_id":2,"location_id":1,"show_id":1,"contents":"最近骗子骗术升级，请您提高防范意识！","advert_pic":"","is_click":1,"event_id":5,"event_content":{"url":"http://t.okbuy.com/act/cheat"},"tips":""},{"advert_id":2198,"page_id":1,"location_id":1,"show_id":1,"contents":"最近骗子骗术升级，请广大用户提高防范意识！","advert_pic":"","is_click":1,"event_id":5,"event_content":{"url":"http://t.okbuy.com/act/cheat"},"tips":""},{"advert_id":6,"page_id":3,"location_id":1,"show_id":1,"contents":"评价，晒单有好礼","advert_pic":null,"is_click":1,"event_id":5,"event_content":{"url":"http://t.okbuy.com/act/comment"},"tips":""},{"advert_id":4,"page_id":1,"location_id":2,"show_id":1,"contents":"评价，晒单有好礼","advert_pic":null,"is_click":1,"event_id":5,"event_content":{"url":"http://t.okbuy.com/act/comment"},"tips":""}]
     */

    private int status;
    private String reason;
    /**
     * advert_id : 8724
     * page_id : 4
     * location_id : 2
     * show_id : 3
     * contents : 我是新人，我有特权
     * advert_pic : http://i.okaybuy.cn/images/multipic/new/201606/61/61d4b28c7a1fb3d54768f4b786924af4.png
     * is_click : 1
     * event_id : 3
     * event_content : {"id":5702}
     * tips : 专享价9元起
     */

    private List<ResultsBean> results;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        private int advert_id;
        private int page_id;
        private int location_id;
        private int show_id;
        private String contents;
        private String advert_pic;
        private int is_click;
        private int event_id;
        /**
         * id : 5702
         */

        private EventContentBean event_content;
        private String tips;

        public int getAdvert_id() {
            return advert_id;
        }

        public void setAdvert_id(int advert_id) {
            this.advert_id = advert_id;
        }

        public int getPage_id() {
            return page_id;
        }

        public void setPage_id(int page_id) {
            this.page_id = page_id;
        }

        public int getLocation_id() {
            return location_id;
        }

        public void setLocation_id(int location_id) {
            this.location_id = location_id;
        }

        public int getShow_id() {
            return show_id;
        }

        public void setShow_id(int show_id) {
            this.show_id = show_id;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }

        public String getAdvert_pic() {
            return advert_pic;
        }

        public void setAdvert_pic(String advert_pic) {
            this.advert_pic = advert_pic;
        }

        public int getIs_click() {
            return is_click;
        }

        public void setIs_click(int is_click) {
            this.is_click = is_click;
        }

        public int getEvent_id() {
            return event_id;
        }

        public void setEvent_id(int event_id) {
            this.event_id = event_id;
        }

        public EventContentBean getEvent_content() {
            return event_content;
        }

        @Override
        public String toString() {
            return "ResultsBean{" +
                    "advert_id=" + advert_id +
                    ", page_id=" + page_id +
                    ", location_id=" + location_id +
                    ", show_id=" + show_id +
                    ", contents='" + contents + '\'' +
                    ", advert_pic='" + advert_pic + '\'' +
                    ", is_click=" + is_click +
                    ", event_id=" + event_id +
                    ", event_content=" + event_content +
                    ", tips='" + tips + '\'' +
                    '}';
        }

        public void setEvent_content(EventContentBean event_content) {
            this.event_content = event_content;
        }

        public String getTips() {
            return tips;
        }

        public void setTips(String tips) {
            this.tips = tips;
        }

        public static class EventContentBean {
            private int id;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
    }
}
