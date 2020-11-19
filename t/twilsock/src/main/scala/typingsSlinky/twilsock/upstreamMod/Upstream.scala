package typingsSlinky.twilsock.upstreamMod

import typingsSlinky.twilsock.configurationMod.Configuration
import typingsSlinky.twilsock.packetinterfaceMod.PacketInterface
import typingsSlinky.twilsock.twilsockMod.TwilsockImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock/lib/services/upstream", "Upstream")
@js.native
class Upstream protected () extends js.Object {
  def this(transport: PacketInterface, twilsock: TwilsockImpl, config: Configuration) = this()
  
  def actualSend(message: js.Any): js.Promise[Result] = js.native
  
  val config: js.Any = js.native
  
  val pendingMessages: js.Any = js.native
  
  def rejectPendingMessages(): Unit = js.native
  
  def saveMessage(message: js.Any): js.Promise[Result] = js.native
  
  /**
    * Send an upstream message
    * @param {Twilsock#Message} message Message structure with header, body and remote address
    * @returns {Promise<Result>} Result from remote side
    */
  def send(method: String, url: String): js.Promise[Result] = js.native
  def send(method: String, url: String, headers: js.UndefOr[scala.Nothing], body: js.Any): js.Promise[Result] = js.native
  def send(method: String, url: String, headers: Headers): js.Promise[Result] = js.native
  def send(method: String, url: String, headers: Headers, body: js.Any): js.Promise[Result] = js.native
  
  def sendPendingMessages(): Unit = js.native
  
  val transport: js.Any = js.native
  
  val twilsock: js.Any = js.native
}
