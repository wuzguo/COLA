package com.alibaba.cola.extension.test.customer.client;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;

/**
 * ICustomerService
 *
 * @author Frank Zhang 2018-01-06 7:24 PM
 */
public interface ICustomerService {

    Response addCustomer(AddCustomerCmd addCustomerCmd);

    SingleResponse<CustomerDTO> getCustomer(GetOneCustomerQry getOneCustomerQry);
}
