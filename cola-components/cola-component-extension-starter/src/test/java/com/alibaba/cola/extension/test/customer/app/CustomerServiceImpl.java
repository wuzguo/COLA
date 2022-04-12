package com.alibaba.cola.extension.test.customer.app;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.alibaba.cola.extension.test.customer.client.AddCustomerCmd;
import com.alibaba.cola.extension.test.customer.client.CustomerDTO;
import com.alibaba.cola.extension.test.customer.client.GetOneCustomerQry;
import com.alibaba.cola.extension.test.customer.client.ICustomerService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 *
 * @author Frank Zhang 2018-01-06 7:40 PM
 */
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Resource
    private AddCustomerCmdExe addCustomerCmdExe;

    @Resource
    private GetOneCustomerQryExe getOneCustomerQryExe;


    @Override
    public Response addCustomer(AddCustomerCmd addCustomerCmd) {
        return addCustomerCmdExe.execute(addCustomerCmd);
    }

    @Override
    public SingleResponse<CustomerDTO> getCustomer(GetOneCustomerQry getOneCustomerQry) {
        return getOneCustomerQryExe.execute(getOneCustomerQry);
    }
}
