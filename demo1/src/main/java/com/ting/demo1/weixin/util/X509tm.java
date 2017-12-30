package com.ting.demo1.weixin.util;


import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;


//证书信任管理器（用于https请求）
public class X509tm implements javax.net.ssl.X509TrustManager {

    @Override
    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

    }

    @Override
    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
//        return new X509Certificate[0];
    }
}
