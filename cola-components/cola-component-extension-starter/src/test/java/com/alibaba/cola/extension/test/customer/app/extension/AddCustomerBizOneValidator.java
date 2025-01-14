package com.alibaba.cola.extension.test.customer.app.extension;

import com.alibaba.cola.exception.BizException;
import com.alibaba.cola.extension.Extension;
import com.alibaba.cola.extension.test.customer.app.extensionpoint.AddCustomerValidatorExtensionPoint;
import com.alibaba.cola.extension.test.customer.client.AddCustomerCmd;
import com.alibaba.cola.extension.test.customer.client.Constants;
import com.alibaba.cola.extension.test.customer.domain.CustomerType;

/**
 * AddCustomerBizOneValidator
 *
 * @author Frank Zhang
 * @date 2018-01-07 1:31 AM
 */
@Extension(bizId = Constants.BIZ_1)
public class AddCustomerBizOneValidator implements AddCustomerValidatorExtensionPoint {

    public void validate(AddCustomerCmd addCustomerCmd) {
        //For BIZ TWO CustomerTYpe could not be VIP
        if (CustomerType.VIP == addCustomerCmd.getCustomerDTO().getCustomerType()) {
            throw new BizException("Customer Type could not be VIP for Biz One");
        }
    }
}
