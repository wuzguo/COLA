#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
{package}.dto.CustomerAddCmd;
import ${package}.dto.CustomerListByNameQry;{package}.dto.data.CustomerDTO;

public interface ICustomerService {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
