package com.herbalife.examples;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.util.List;

@ApplicationScoped
public class Company {
    @ConfigProperty(name = "my.company.name", defaultValue = "Herbalife")
    private String name;

    @ConfigProperty(name = "my.company.url", defaultValue = "https://www.herbalife.com")
    private String url;

    @ConfigProperty(name = "my.company.employeeCount", defaultValue = "100000")
    private long employeeCount;

    @ConfigProperty(name = "my.company.founders")
    private List<String> founders;

    //Define members like ceo, headQuarters, stockPrice and inject values
    //from application.properties

    @ConfigProperty(name = "my.company.ceo", defaultValue = "John Doe")
    private String ceo;

    @ConfigProperty(name = "my.company.headQuarters", defaultValue = "Los Angeles, CA")
    private String headQuarters;

    @ConfigProperty(name = "my.company.stockPrice", defaultValue = "100.00")
    private double stockPrice;

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getHeadQuarters() {
        return headQuarters;
    }

    public void setHeadQuarters(String headQuarters) {
        this.headQuarters = headQuarters;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(long employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", employeeCount=" + employeeCount +
                ", ceo='" + ceo + '\'' +
                ", headQuarters='" + headQuarters + '\'' +
                ", stockPrice=" + stockPrice +
                ", founders=" + founders +
                '}';
    }
}
