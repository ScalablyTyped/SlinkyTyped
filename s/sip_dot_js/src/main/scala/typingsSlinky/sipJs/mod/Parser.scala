package typingsSlinky.sipJs.mod

import typingsSlinky.sipJs.AnonError
import typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage
import typingsSlinky.sipJs.incomingResponseMessageMod.IncomingResponseMessage
import typingsSlinky.sipJs.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Parser")
@js.native
object Parser extends js.Object {
  def getHeader(data: js.Any, headerStart: Double): Double = js.native
  def parseHeader(message: IncomingRequestMessage, data: js.Any, headerStart: Double, headerEnd: Double): Boolean | AnonError = js.native
  def parseHeader(message: IncomingResponseMessage, data: js.Any, headerStart: Double, headerEnd: Double): Boolean | AnonError = js.native
  def parseMessage(data: String, logger: Logger): js.UndefOr[IncomingRequestMessage | IncomingResponseMessage] = js.native
}

