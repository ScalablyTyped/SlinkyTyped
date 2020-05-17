package typingsSlinky.sipJs

import typingsSlinky.sipJs.anon.Error
import typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage
import typingsSlinky.sipJs.incomingResponseMessageMod.IncomingResponseMessage
import typingsSlinky.sipJs.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  @js.native
  object Parser extends js.Object {
    def getHeader(data: js.Any, headerStart: Double): Double = js.native
    def parseHeader(message: IncomingRequestMessage, data: js.Any, headerStart: Double, headerEnd: Double): Boolean | Error = js.native
    def parseHeader(message: IncomingResponseMessage, data: js.Any, headerStart: Double, headerEnd: Double): Boolean | Error = js.native
    def parseMessage(data: String, logger: Logger): js.UndefOr[IncomingRequestMessage | IncomingResponseMessage] = js.native
  }
  
}

