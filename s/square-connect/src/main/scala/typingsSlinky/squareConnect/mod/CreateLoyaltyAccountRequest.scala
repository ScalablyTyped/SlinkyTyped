package typingsSlinky.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateLoyaltyAccountRequest")
@js.native
class CreateLoyaltyAccountRequest () extends StObject {
  
  /**
    * A unique string that identifies this `CreateLoyaltyAccount` request. Keys can be any valid string, but must be unique for every request.
    */
  var idempotency_key: String = js.native
  
  /**
    * The loyalty account to create.
    */
  var loyalty_account: LoyaltyAccount = js.native
}
