package javaeepp.mihuyou.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import javaeepp.mihuyou.config.AlipayConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Index")
public class IndexController {
    @ResponseBody
    @RequestMapping("/Pay")
    public String Pay(String out_trade_no,String subject,String total_amount,String body,String timeout_express,String product_code) throws AlipayApiException {
        AlipayConfig alipayConfig = new AlipayConfig();

        AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig.URL,alipayConfig.APPID,alipayConfig.RSA_PRIVATE_KEY,alipayConfig.FORMAT,
                alipayConfig.CHARSET,alipayConfig.ALIPAY_PUBLIC_KEY,alipayConfig.SIGNTYPE);

            AlipayTradeWapPayRequest request = new AlipayTradeWapPayRequest();

            AlipayTradeWapPayModel model = new AlipayTradeWapPayModel();
            model.setOutTradeNo(out_trade_no);
            model.setSubject(subject);
            model.setTotalAmount(total_amount);
            model.setBody(body);
            model.setTimeoutExpress(timeout_express);
            model.setProductCode(product_code);


            request.setBizModel(model);
            request.setNotifyUrl(alipayConfig.notify_url);
            request.setReturnUrl(alipayConfig.return_url);

            String form = alipayClient.pageExecute(request).getBody();
            System.out.println(form);
        return form;
    }
}
