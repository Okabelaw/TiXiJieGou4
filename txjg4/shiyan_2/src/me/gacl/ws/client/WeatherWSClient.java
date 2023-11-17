package me.gacl.ws.client;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class WeatherWSClient {

    public static void main(String[] args) {
        //����һ��WeatherWS����
        WeatherWS factory = new WeatherWS();
        //���ݹ�������һ��WeatherWSSoap����
        WeatherWSSoap weatherWSSoap = factory.getWeatherWSSoap();
        //����WebService�ṩ��getWeather������ȡ�����е�����Ԥ�����
        ArrayOfString weatherInfo = weatherWSSoap.getWeather("�ɶ�", null);
        List<String> lstWeatherInfo = weatherInfo.getString();
        //��������Ԥ����Ϣ
        for (String string : lstWeatherInfo) {
            System.out.println(string);
            System.out.println("------------------------");
        }
    }
}
