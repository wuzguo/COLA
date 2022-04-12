package com.alibaba.cola.extension.test.customer.domain.rule;

import com.alibaba.cola.extension.IExtensionPoint;
import com.alibaba.cola.extension.test.customer.domain.CustomerEntity;

/**
 * CustomerRuleExtPt
 *
 * @author Frank Zhang
 * @date 2018-01-07 12:03 PM
 */
public interface CustomerRuleExtensionPoint extends IExtensionPoint {

    //Different business check for different biz
    public boolean addCustomerCheck(CustomerEntity customerEntity);

    //Different upgrade policy for different biz
    default public void customerUpgradePolicy(CustomerEntity customerEntity){
        //Nothing special
    }
}
