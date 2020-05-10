package typingsSlinky.squareConnect.mod

import typingsSlinky.squareConnect.squareConnectStrings.PENDING
import typingsSlinky.squareConnect.squareConnectStrings.VERIFIED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RegisterDomainResponse")
@js.native
class RegisterDomainResponse () extends js.Object {
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  /**
    * Status of the domain registration. See `RegisterDomainResponseStatus` for possible values.
    */
  var status: js.UndefOr[PENDING | VERIFIED] = js.native
}

