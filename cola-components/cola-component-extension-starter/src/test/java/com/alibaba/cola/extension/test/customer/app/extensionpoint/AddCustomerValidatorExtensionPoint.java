package com.alibaba.cola.extension.test.customer.app.extensionpoint;

import com.alibaba.cola.extension.IExtensionPoint;
import com.alibaba.cola.extension.test.customer.client.AddCustomerCmd;

/**
 * AddCustomerValidatorExtPt
 *
 * @author Frank Zhang
 * @date 2018-01-07 1:27 AM
 */
public interface AddCustomerValidatorExtensionPoint extends IExtensionPoint {

    public void validate(AddCustomerCmd addCustomerCmd);
}
