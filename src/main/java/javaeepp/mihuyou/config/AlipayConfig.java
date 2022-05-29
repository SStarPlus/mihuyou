package javaeepp.mihuyou.config;

public class AlipayConfig {
    // 商户appid
    public static String APPID = "2021000118677275";

    // 私钥 pkcs8格式的
    public static String RSA_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCPvAhRhtv0nLMgcF4aGj1HBUvqHVqaj4QSpBzSQHmq/j6SQwqNyt1E3wBUxa7N/KRaytTEkEj7RHN7IS7VGZ7ihJy2DBhwYYrRMnFdSkLnfR1bxJ6A3APoZc8odglkycbmqYUjAR6wxA7TMVuHEGIvLG0b3ioWh6Y1n4yWTfjzp2ZN8qtPveoWahHdeKJWKsmdG7Qw09/+bXO+hJ7up7xGlDPM0objIc8HqUJmvsnYKhkVpCFuKLsvh4yP4R4oWZjsxyuPBUXarM1qhVyeCPaR/i0Q9SjNZ+5Q7tPjBr1V6HgSnAjdtiGOm82mJLMqdOXpiSar5m9vAqf8PYEIbt1BAgMBAAECggEAVswd2d2uhhD6uuQgb3LY/kJcjYwcYqm3/+nK3czBrFjMQFbr0KRo6mYgNRELdqjSN2G1Ct52tAWqFvj65wUJxZB/cg/r0jGVOq9TdhqaPGB5kikx7m7ujTCt4KknEw4mZrSICZNrjSNYMIDl3LIwGHyjhuiqUeCopkkrBLkhVUEh+dB16qetBhC5NstFehwvTUMm/JKje96BNIpDyKJ0RRpKxsbQxrAkrE9dsxqvNIWQDWdfGliUFEX32HdfrhiekEulW9kZdYzgJuhgI3jTb0hA/Y3prevkbzshLRkrhmkzw0PeW68ZNNPwdwdlue/Bcj6U4pDCQNi9GCJ4GLbh4QKBgQDC4o+h1nZk6OSc0ZG8OovJdFVAJ/8z0s5RmbOByGFtRznu2sWr7VokF+EwQdXz0uvcImioYzDDELK7RNxU97vcriqTc5JmGttCs783Yr9Y0ZEetBra09yo3D0THXOv4BVUGnyOBX+JvfCbk+CTZwBVqQRgJfl/9uOweT+o1PmaGwKBgQC8zxcs5r47wuHVQAkTtx1chWOjSF4QhTy6AY28NKwQ9C8p38XOtjoP3oXsWg2CwyEgNeNeH1wPondignJI6/GkLPN+wPNU0C6MgC0HFsxxjsZ5zo0nCPsVq/bwLAV27S2VN8arO3u/ypSz1mTZorb8mbuicm57ishnpSX/+Zwb0wKBgQCElvf5t5udVAYV2083rO1mBkvp9kxeydGtGtFSPy5p1sfHhfhu3HEzlTuURXZ3CM2HW7GwvqtyS24Oku8Er/eUULqOz1aPOT5rxzcVS427s/jz1r1enD3IdO7ojmUjB2X7bnnHdl4rLJsCfj2Qi8digDeF4tA5C5QlgJibGSsoeQKBgF41Bl9FEo5HAt+gf+byaxgLBlgmd6jOkipNNCdAMMqUzCOcn9owWnAom7H+jNc9/X1Q5g3En+69JcxlQhjYgU1lkGkiZUdgSJmaKt1qpr/SeX21bgCYHpAFqcTUcjWQyjm2Bs7Rc0GTFvdUdiWRZrRLELBRYIcMDEqKwJckOJw5AoGBAKqGk6YgE4cqrs4jA2/wHLJ5dGIJoIZguMNljolColgqN9DbjDeuMhu7CtxkkWX3OMwzq4inEc2e04Nbpf5RMvz8kxauMF+V3ychjsjfuGkgQQrEaJulKANnCx65FMNCnzNUal6WY9OARmti/FPrLQ+jEQuQ3pDgh4nHjFazPAaF";

    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自	定义参数，必须外网可以正常访问
    public static String notify_url = "https://www.baidu.com";

    public static String return_url = "https://www.baidu.com";

    // 请求网关地址
    public static String URL = "https://openapi.alipaydev.com/gateway.do";

    // 编码
    public static String CHARSET = "UTF-8";

    // 返回格式
    public static String FORMAT = "json";

    // 支付宝公钥
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAihbfHTI8A49bCfYVql1csfDFnmeA92IdFqsvuKkasVyITmhjFhSnel6+Cu8XLr1ZzMnOy0Nk3AcylObdzglQ1/X4+Hr61B0jBC8xfkBCyKfYlu+xqXcXuZ8BVYRq/qXH+PjI1gmcx1YlSEoOHAqzwSwipYHLC1Qa+aSAjxDbrlfXQReipywUZHZOCbxfA2HlNzlXa5iJFK5y6DZfUEg5xkNxwtOw/HM2mFbTKK1cTmb6sP8eUYo65EArYNYxBlzxHezizS1vgteU2YF2VL7YpP+Ju/dRtw6tn1xlPU2/OSKC5qZyukv0hc3IFC+bmkbUaGEZpN3Nk+Fh6/M9GuO7kQIDAQAB";

    // RSA2
    public static String SIGNTYPE = "RSA2";
}

