package gov.nist.hit.vr.config;

import gov.nist.hit.core.hl7v2.service.*;
import gov.nist.hit.core.service.ResourceLoader;
import gov.nist.hit.core.service.ResourcebundleLoader;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class VRWebBeanConfig {

    @Bean
    public ResourceLoader resourceLoader() {
        HL7V2ResourceLoaderImpl rs = new HL7V2ResourceLoaderImpl();
        return rs;
    }

    @Bean
    public ResourcebundleLoader resourcebundleLoader() {
        return new HL7V2ResourceLoaderImpl();
    }

    @Bean
    public HL7V2ValidationReportConverter hl7v2ValidationReportConverter() {
        return new HL7V2ValidationReportConverterImpl();
    }

    @Bean
    public HL7V2MessageValidator hl7v2MessageValidator() {
        return new HL7V2MessageValidatorImpl();
    }

    @Bean
    public HL7V2MessageParser hl7v2MessageParser() {
        return new HL7V2MessageParserImpl();
    }



}
