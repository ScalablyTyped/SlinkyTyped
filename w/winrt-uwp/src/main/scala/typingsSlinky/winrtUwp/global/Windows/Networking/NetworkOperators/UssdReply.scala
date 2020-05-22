package typingsSlinky.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the network response after sending a USSD message. */
@JSGlobal("Windows.Networking.NetworkOperators.UssdReply")
@js.native
abstract class UssdReply ()
  extends typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators.UssdReply {
  /** Gets the message for the USSD response. */
  /* CompleteClass */
  override var message: typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators.UssdMessage = js.native
  /** Gets the result code for the USSD response. */
  /* CompleteClass */
  override var resultCode: typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators.UssdResultCode = js.native
}

