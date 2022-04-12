package com.alibaba.cola.extension.test.customer.app.extension;

import com.alibaba.cola.exception.BizException;
import com.alibaba.cola.extension.Extension;
import com.alibaba.cola.extension.test.customer.app.extensionpoint.AddCustomerValidatorExtensionPoint;
import com.alibaba.cola.extension.test.customer.client.AddCustomerCmd;
import com.alibaba.cola.extension.test.customer.client.Constants;

/**
 * AddCustomerBizTwoValidator
 *
 * @author Frank Zhang
 * @date 2018-01-07 1:31 AM
 */
@Extension(bizId = Constants.BIZ_2)
public class AddCustomerBizTwoValidator implements AddCustomerValidatorExtensionPoint {

    public void validate(AddCustomerCmd addCustomerCmd) {
        //For BIZ TWO CustomerTYpe could not be null
        if (addCustomerCmd.getCustomerDTO().getCustomerType() == null) {
            throw new BizException("CustomerType could not be null");
        }
    }
}
