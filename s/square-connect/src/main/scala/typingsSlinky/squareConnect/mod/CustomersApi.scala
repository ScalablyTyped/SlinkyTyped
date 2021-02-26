package typingsSlinky.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CustomersApi")
@js.native
/**
  * Constructs a new CustomersApi.
  * @param apiClient Optional API client implementation to use, default to ApiClient.instance if unspecified.
  */
class CustomersApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  /**
    * Creates a new customer for a business, which can have associated cards on file. You must provide at least one of the
    * following values in your request to this endpoint: `given_name`. `family_name`, `company_name`, `email_address`,`phone_number`.
    */
  def createCustomer(body: CreateCustomerRequest): js.Promise[CreateCustomerResponse] = js.native
  
  /**
    * Adds a card on file to an existing customer. As with charges, calls to `CreateCustomerCard` are idempotent.
    * Multiple calls with the same card nonce return the same card record that was created with the provided nonce during the _first_ call.
    */
  def createCustomerCard(customerId: String, body: CreateCustomerCardRequest): js.Promise[CreateCustomerCardResponse] = js.native
  
  /**
    * Deletes a customer from a business, along with any linked cards on file.
    * When two profiles are merged into a single profile, that profile is assigned a new `customer_id`.
    * You must use the new `customer_id` to delete merged profiles.
    */
  def deleteCustomer(args: js.Any*): js.Promise[DeleteCustomerResponse] = js.native
  
  /**
    * Removes a card on file from a customer.
    */
  def deleteCustomerCard(customerId: String, cardId: String): js.Promise[DeleteCustomerCardResponse] = js.native
  
  /**
    * Lists a business's customers.
    */
  def listCustomers(args: js.Any*): js.Promise[ListCustomersResponse] = js.native
  
  /**
    * Returns details for a single customer.
    */
  def retrieveCustomer(customerId: String): js.Promise[RetrieveCustomerResponse] = js.native
  
  /**
    * Searches the customer profiles associated with a Square account.
    * Calling SearchCustomers without an explicit query parameter returns all customer profiles ordered alphabetically based
    * on `given_name` and `family_name`.
    */
  def searchCustomers(args: js.Any*): js.Promise[SearchCustomersResponse] = js.native
  
  /**
    * Updates the details of an existing customer. When two profiles are merged into a single profile, that profile
    * is assigned a new `customer_id`. You must use the new `customer_id` to update merged profiles. You cannot edit
    * a customer's cards on file with this endpoint. To make changes to a card on file, you must delete the existing
    * card on file with the [DeleteCustomerCard](#endpoint-deletecustomercard) endpoint, then create a new one with
    * the [CreateCustomerCard](#endpoint-createcustomercard) endpoint.
    */
  def updateCustomer(args: js.Any*): js.Promise[UpdateCustomerResponse] = js.native
}
