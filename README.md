# Yaypay integration-rest-client

Lightweight rest client for [Yaypay.com](https://yaypay.com)

## Dependency

- org.apache.httpcomponents: httpclient
- org.apache.commons: commons-collections4
- com.fasterxml.jackson.core: jackson-databind
- com.fasterxml.jackson.datatype: jackson-datatype-jsr310
- junit
- mockito

## Usage

Prepare service:
```java
//Provided from Yaypay team
String apiUrl = "https://www.developer.yaypay.com/api/v1/";

//Provided from Yaypay team
String authorizationToken = "qwertyuiop1234568"

ApiService apiService = new ApiService(apiUrl, authorizationToken);
```

Methods:

`apiKey` - this key should be request from Yaypay team
```java
 Long startTransaction(String apiKey, Date startPeriod, Date endPeriod, String sourceSystemType, boolean transactionIsIrregular) 
 
 void finishTransaction(Long transactionId, String apiKey) 
 
 void finishTransaction(Long transactionId, String apiKey, boolean isHistorical) 
 
 List<String> getOpenInvoiceIds(Integer bizId, String apiKey) 
 
 void createOrUpdateInvoices(Long transactionId, List<InvoiceRequest> invoiceRequests, String apiKey) throws InterruptedException, ExecutionException 
 
 void createOrUpdateContacts(Long transactionId, List<ContactRequest> contactRequests, String apiKey) throws InterruptedException, ExecutionException 
 
 void createOrUpdateCustomers(Long transactionId, List<CustomerRequest> customerRequests, String apiKey)
 
 void createOrUpdatePayments(Long transactionId, List<PaymentRequest> paymentRequests, String apiKey) throws InterruptedException, ExecutionException 
 
 void createOrUpdateCreditMemos(Long transactionId, List<CreditMemoRequest> creditMemoRequests, String apiKey) throws InterruptedException, ExecutionException 
 
 void createOrUpdateAdjustment(Long transactionId, List<AdjustmentRequest> adjustmentRequests, String apiKey) throws InterruptedException, ExecutionException 
 
 void createOrUpdateExternalCompanies(Long transactionId, List<ExternalCompanyRequest> externalCompanyRequests, String apiKey) throws InterruptedException, ExecutionException 
 
 void createOrUpdateExternalContacts(Long transactionId, List<ExternalContactRequest> externalContactRequests, String apiKey) throws InterruptedException, ExecutionException 
 
 void createOrUpdateSales(Long transactionId, List<SalesRequest> salesRequests, String apiKey) throws InterruptedException, ExecutionException 
 
 void createOrUpdateCurrencies(Long transactionId, List<CurrencyRequest> currencyRequests, String apiKey) throws InterruptedException, ExecutionException 
 
 void createOrUpdateContents(Long transactionId, List<ContentRequest> contentRequests, String apiKey) throws InterruptedException, ExecutionException 
 
 void createOrUpdateContent(Long transactionId, ContentRequest contentRequests, String apiKey) 
 
 Collection<CustomerResponse> getCustomers(Integer bizId, String apiKey, String sourceSystemType, boolean withOpenBalancesOnly) 
 
 void deleteCustomers(List<DeleteEntity> deletedDtos, Long transactionId, String apiKey) throws ExecutionException, InterruptedException 
 
 Set<String> deleteInvoices(List<DeleteEntity> deletedDtos, Long transactionId, String apiKey) throws ExecutionException, InterruptedException 
 
 Set<String> deletePayments(List<DeleteEntity> deletedDtos, Long transactionId, String apiKey) throws ExecutionException, InterruptedException 
 
 Set<String> deleteCreditMemos(List<DeleteEntity> deletedDtos, Long transactionId, String apiKey) throws ExecutionException, InterruptedException 
 
 Set<String> deleteAdjustments(List<DeleteEntity> deletedDtos, Long transactionId, String apiKey) throws ExecutionException, InterruptedException 
 
 Set<String> deleteContacts(List<DeleteEntity> deletedDtos, Long transactionId, String apiKey) throws ExecutionException, InterruptedException 
 
 Set<String> deleteEntity(SyncEntity syncEntityType, List<DeleteEntity> deleteEntities, Long transactionId, String apiKey) throws ExecutionException, InterruptedException 
 
 List<String> getActiveEntityIds(SyncEntity syncEntityType, Integer bizId, String apiKey, String sourceSystemType) 
```

 