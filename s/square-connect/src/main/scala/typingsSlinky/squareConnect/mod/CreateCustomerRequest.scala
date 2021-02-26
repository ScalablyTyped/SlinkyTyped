package typingsSlinky.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateCustomerRequest")
@js.native
class CreateCustomerRequest () extends StObject {
  
  /**
    * The physical address associated with the customer profile.
    */
  var address: js.UndefOr[Address] = js.native
  
  /**
    * The birthday associated with the customer profile, in RFC 3339 format. Year is optional, timezone and times are not allowed.
    * For example: `0000-09-01T00:00:00-00:00` indicates a birthday on September 1st.
    * `1998-09-01T00:00:00-00:00` indications a birthday on September 1st __1998__.
    */
  var birthday: js.UndefOr[String] = js.native
  
  /**
    * A business name associated with the customer profile.
    */
  var company_name: js.UndefOr[String] = js.native
  
  /**
    * The email address associated with the customer profile.
    */
  var email_address: js.UndefOr[String] = js.native
  
  /**
    * The family (i.e., last) name associated with the customer profile.
    */
  var family_name: js.UndefOr[String] = js.native
  
  /**
    * The given (i.e., first) name associated with the customer profile.
    */
  var given_name: js.UndefOr[String] = js.native
  
  /**
    * The idempotency key for the request.
    * See the [Idempotency](https://developer.squareup.com/docs/working-with-apis/idempotency) guide for more information.
    */
  var idempotency_key: js.UndefOr[String] = js.native
  
  /**
    * A nickname for the customer profile.
    */
  var nickname: js.UndefOr[String] = js.native
  
  /**
    * A custom note associated with the customer profile.
    */
  var note: js.UndefOr[String] = js.native
  
  /**
    * The 11-digit phone number associated with the customer profile.
    */
  var phone_number: js.UndefOr[String] = js.native
  
  /**
    * An optional, second ID used to associate the customer profile with an entity in another system.
    */
  var reference_id: js.UndefOr[String] = js.native
}
