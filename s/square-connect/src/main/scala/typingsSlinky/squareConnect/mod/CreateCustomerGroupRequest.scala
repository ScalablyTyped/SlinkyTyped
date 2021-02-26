package typingsSlinky.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateCustomerGroupRequest")
@js.native
class CreateCustomerGroupRequest () extends StObject {
  
  /**
    * The customer group to create.
    */
  var group: CustomerGroup = js.native
  
  /**
    * The idempotency key for the request.
    * See the [Idempotency](https://developer.squareup.com/docs/basics/api101/idempotency) guide for more information.
    */
  var idempotency_key: js.UndefOr[String] = js.native
}
