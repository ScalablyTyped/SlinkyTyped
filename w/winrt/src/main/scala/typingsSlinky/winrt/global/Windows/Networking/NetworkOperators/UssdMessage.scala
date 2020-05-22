package typingsSlinky.winrt.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.UssdMessage")
@js.native
class UssdMessage protected ()
  extends typingsSlinky.winrt.Windows.Networking.NetworkOperators.UssdMessage {
  def this(messageText: String) = this()
  /* CompleteClass */
  override var dataCodingScheme: Double = js.native
  /* CompleteClass */
  override var payloadAsText: String = js.native
  /* CompleteClass */
  override def getPayload(): js.typedarray.Uint8Array = js.native
  /* CompleteClass */
  override def setPayload(value: js.typedarray.Uint8Array): Unit = js.native
}

