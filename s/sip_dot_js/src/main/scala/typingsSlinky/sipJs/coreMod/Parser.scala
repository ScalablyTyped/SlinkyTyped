package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Parser {
  
  @JSImport("sip.js/lib/core", "Parser.getHeader")
  @js.native
  def getHeader(data: js.Any, headerStart: Double): Double = js.native
  
  @JSImport("sip.js/lib/core", "Parser.parseHeader")
  @js.native
  def parseHeader(
    message: typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage,
    data: js.Any,
    headerStart: Double,
    headerEnd: Double
  ): Boolean | Error = js.native
  @JSImport("sip.js/lib/core", "Parser.parseHeader")
  @js.native
  def parseHeader(
    message: typingsSlinky.sipJs.incomingResponseMessageMod.IncomingResponseMessage,
    data: js.Any,
    headerStart: Double,
    headerEnd: Double
  ): Boolean | Error = js.native
  
  @JSImport("sip.js/lib/core", "Parser.parseMessage")
  @js.native
  def parseMessage(data: String, logger: typingsSlinky.sipJs.loggerMod.Logger): js.UndefOr[
    typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage | typingsSlinky.sipJs.incomingResponseMessageMod.IncomingResponseMessage
  ] = js.native
}
