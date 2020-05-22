package typingsSlinky.winrt.global.Windows.Networking.NetworkOperators

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
@js.native
class UssdSession ()
  extends typingsSlinky.winrt.Windows.Networking.NetworkOperators.UssdSession {
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def sendMessageAndGetReplyAsync(message: typingsSlinky.winrt.Windows.Networking.NetworkOperators.UssdMessage): IAsyncOperation[typingsSlinky.winrt.Windows.Networking.NetworkOperators.UssdReply] = js.native
}

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
@js.native
object UssdSession extends js.Object {
  def createFromNetworkAccountId(networkAccountId: String): typingsSlinky.winrt.Windows.Networking.NetworkOperators.UssdSession = js.native
  def createFromNetworkInterfaceId(networkInterfaceId: String): typingsSlinky.winrt.Windows.Networking.NetworkOperators.UssdSession = js.native
}

