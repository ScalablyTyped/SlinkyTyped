package typingsSlinky.sipDotJs.sipDotJsMod.Core

import typingsSlinky.sipDotJs.Anon_Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.Parser")
@js.native
object Parser extends js.Object {
  def getHeader(data: js.Any, headerStart: Double): Double = js.native
  def parseHeader(
    message: typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage,
    data: js.Any,
    headerStart: Double,
    headerEnd: Double
  ): Boolean | Anon_Error = js.native
  def parseHeader(
    message: typingsSlinky.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage,
    data: js.Any,
    headerStart: Double,
    headerEnd: Double
  ): Boolean | Anon_Error = js.native
  def parseMessage(data: String, logger: typingsSlinky.sipDotJs.libCoreLogLoggerMod.Logger): js.UndefOr[
    typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage | typingsSlinky.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage
  ] = js.native
}

