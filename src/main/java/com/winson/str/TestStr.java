package com.winson.str;

/**
 * @author com.winson
 * @date 2020/12/15
 **/
public class TestStr {

    public static void main(String[] args) {
//        String result = "曙光信息产业（北京）有限公司（下称中科曙光，股票代码：SH 603019）是一家在科技部、中科院大力推动下，以国家\"863\"计划重大科研成果为基础组建的高新技术企业。作为国内高性能计算领域的领军企业，亚洲第一大高性能计算机厂商，中科曙光已连续8年蝉联中国高性能计算机TOP100排行榜市场份额第一，素有中国高性能计算第一股之称。以中科院计算所、国家智能计算机研究开发中心和国家高性能计算机工程中心为技术依托，曙光拥有服务器、存储、云计算、高性能计算、网络安全、数据中心、大数据等健全的产业生态链，并多年潜心发展全国“城市云”中心、先进计算中心和智慧城市的宏伟蓝图，目前已有新疆、成都、无锡、南京、包头等40余个在运行的城市云计算中心、先进计算中心、数据中心，并正在加速 “百城百行”、“数据中国”的战略布局。 20多年来，曙光公司始终倡导着“自主创新服务中国”的品牌理念，以全面、专业、增值的服务为广大中国用户提供良好的应用体验，曙光的硬件产品、解决方案、云计算服务已被广泛应用于政府、能源、互联网、教育、气象、医疗及公共事业等社会各个领域。并在我国西南、华南、华中、东北等地成功实现了“城市云”布局，筹建了成都、无锡、南京、包头等多个城市云计算中心，为快速高效地提升区域经济建设，丰富人们日常生活所需信息资源提供了坚实的科技保障。";
//
//        System.out.println(result.length());
//
//        String content = "要求本科及以上";
//        System.out.println(content.indexOf("本科"));
//        System.out.println(content.contains("本科"));
        String raw = "{\"index\":{\"_id\":\"641676\"}}";
//        System.out.println("体验".hashCode());
//        System.out.println("实习".hashCode());
//        System.out.println("大学".hashCode());
        int first = raw.lastIndexOf("\"");
        int second = raw.lastIndexOf("\"", first - 1);
        System.out.println(raw.substring(17, raw.lastIndexOf("\"")));

    }

}
