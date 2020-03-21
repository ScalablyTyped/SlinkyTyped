package typingsSlinky.sipJs.clientContextMod

import typingsSlinky.events.mod.EventEmitter
import typingsSlinky.sipJs.clientContextMod.ClientContext.Options
import typingsSlinky.sipJs.coreMod.IncomingResponseMessage
import typingsSlinky.sipJs.coreMod.Logger
import typingsSlinky.sipJs.coreMod.NameAddrHeader
import typingsSlinky.sipJs.coreMod.OutgoingRequestMessage
import typingsSlinky.sipJs.coreMod.URI
import typingsSlinky.sipJs.enumsMod.TypeStrings
import typingsSlinky.sipJs.libSessionDescriptionHandlerMod.BodyObj
import typingsSlinky.sipJs.uAMod.UA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/ClientContext", "ClientContext")
@js.native
class ClientContext_ protected () extends EventEmitter {
  def this(ua: UA, method: String, target: String) = this()
  def this(ua: UA, method: String, target: URI) = this()
  def this(ua: UA, method: String, target: String, options: Options) = this()
  def this(ua: UA, method: String, target: URI, options: Options) = this()
  var body: js.UndefOr[BodyObj] = js.native
  var data: js.Any = js.native
  var localIdentity: NameAddrHeader = js.native
  var logger: Logger = js.native
  var method: String = js.native
  var remoteIdentity: NameAddrHeader = js.native
  var request: OutgoingRequestMessage = js.native
  var `type`: TypeStrings = js.native
  var ua: UA = js.native
  def onRequestTimeout(): Unit = js.native
  def onTransportError(): Unit = js.native
  def receiveResponse(response: IncomingResponseMessage): Unit = js.native
  def send(): this.type = js.native
}

