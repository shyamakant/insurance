/*
 * package com.hcl.insuranceApplication;
 * 
 * import static
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
 * import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
 * 
 * import java.util.Optional;
 * 
 * import org.junit.Test; import org.junit.runner.RunWith; import
 * org.mockito.Mock; import org.mockito.Mockito; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
 * import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
 * import org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.boot.test.context.TestConfiguration; import
 * org.springframework.boot.test.mock.mockito.MockBean; import
 * org.springframework.http.MediaType; import
 * org.springframework.test.context.junit4.SpringRunner; import
 * org.springframework.test.web.servlet.MockMvc;
 * 
 * import com.fasterxml.jackson.databind.ObjectMapper; import
 * com.hcl.insuranceApplication.controller.InsuranceController; import
 * com.hcl.insuranceApplication.entity.Account; import
 * com.hcl.insuranceApplication.entity.Address; import
 * com.hcl.insuranceApplication.entity.Customer; import
 * com.hcl.insuranceApplication.entity.Payee; import
 * com.hcl.insuranceApplication.repository.AccountRepository; import
 * com.hcl.insuranceApplication.repository.CustomerRepository; import
 * com.hcl.insuranceApplication.repository.PayeeRepository;
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @WebMvcTest public class PayeeTest {
 * 
 * @Autowired private MockMvc mockMvc;
 * 
 * @MockBean private PayeeRepository respository;
 * 
 * @MockBean private AccountRepository acountRepository;
 * 
 * @MockBean private CustomerRepository customerRespository;
 * 
 * @Test public void addPayeeTest() throws Exception {
 * com.hcl.insuranceApplication.vo.Payee payeeVO = new
 * com.hcl.insuranceApplication.vo.Payee(); payeeVO.setCustomerId(1l);
 * payeeVO.setpAccountNo(123l); payeeVO.setPayeeName("Shyama"); Address address
 * = new Address(); Customer cust = new Customer(); cust.setCustomerId(1l); //
 * cust.setBirthDate(); cust.setEmail("shyamakant.sharma@hcl.com");
 * cust.setFullName("Shyama kant sharma"); cust.setGender("Male");
 * cust.setMobileNo("7709110248"); cust.getAddress().add(address);
 * Optional<Customer> customer1 = Optional.of(cust); Account acc = new
 * Account(); acc.setAccountId(1l); acc.setAccountNumber(12345l);
 * acc.setAccountType("saving"); acc.setBalance(345345.0);
 * acc.setCustomer(cust); cust.getAccounts().add(acc); Payee payee = new
 * Payee(); payee.setAccount(acc); payee.setAuthCode(2345);
 * payee.setCustomer(cust); payee.setIsConfirmed(false); payee.setPayeeId(1l);
 * payee.setPayeeName("shyama");
 * Mockito.when(acountRepository.findREFBAccountNO(Mockito.anyLong())).
 * thenReturn(acc);
 * Mockito.when(customerRespository.findById(Mockito.anyLong())).thenReturn(
 * customer1); Mockito.when(respository.save(payee)).thenReturn(payee);
 * 
 * mockMvc.perform(post("/account/payee") .content(new
 * ObjectMapper().writeValueAsString(payee)).contentType(MediaType.
 * APPLICATION_JSON)) .andExpect(status().isOk());
 * 
 * } }
 */