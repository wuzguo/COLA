package com.alibaba.cola.extension.test.customer.app.extensionpoint;

import com.alibaba.cola.extension.IExtensionPoint;
import com.alibaba.cola.extension.test.customer.client.AddCustomerCmd;
import com.alibaba.cola.extension.test.customer.domain.CustomerEntity;

/**
 * CustomerConvertorExtPt
 *
 * @author Frank Zhang
 * @date 2018-01-07 2:37 AM
 */
public interface CustomerConvertorExtensionPoint extends IExtensionPoint {

    public CustomerEntity clientToEntity(AddCustomerCmd addCustomerCmd);
}
