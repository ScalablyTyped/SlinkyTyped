package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "GetBankAccountResponse")
@js.native
class GetBankAccountResponse () extends js.Object {
  
  /**
    * The requested `BankAccount` object.
    */
  var bank_account: js.UndefOr[BankAccount] = js.native
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
