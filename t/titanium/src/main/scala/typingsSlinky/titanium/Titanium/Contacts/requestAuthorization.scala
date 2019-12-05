package typingsSlinky.titanium.Titanium.Contacts

import typingsSlinky.titanium.ContactsAuthorizationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Contacts.requestAuthorization")
@js.native
object requestAuthorization extends js.Object {
  /**
  		 * If authorization is unknown, will bring up a dialog requesting permission.
  		 */
  def apply(callback: js.Function1[/* param0 */ ContactsAuthorizationResponse, _]): Unit = js.native
}

