package in.practice.ajinkya.product;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix="my.app")
public class Product {
	private Integer pid;
	private String pname;
	private Integer pcost;
	
	private List<String> li;
	private String [] arr;
	
	private Map<String, String> mp;
	private Properties pr;
}

