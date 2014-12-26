package org.thomasmore.oo3.course.resortui.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Reservation")
@XmlRootElement
public class ReservationEntity extends BasicEntity {

    private String startDate;
    private String startTime;
    private String endDate;
    private String endTime;
    private Integer amountCustomers;
    private boolean cancellationInsurance;
    private String bungalowName;
    private String customerName;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getAmountCustomers() {
        return amountCustomers;
    }

    public void setAmountCustomers(Integer amountCustomers) {
        this.amountCustomers = amountCustomers;
    }

    public boolean isCancellationInsurance() {
        return cancellationInsurance;
    }

    public void setCancellationInsurance(boolean cancellationInsurance) {
        this.cancellationInsurance = cancellationInsurance;
    }

    public String getBungalowName() {
        return bungalowName;
    }

    public void setBungalowName(String bungalowName) {
        this.bungalowName = bungalowName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
