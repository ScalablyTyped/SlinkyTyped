package typingsSlinky.syslogClient.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("syslog-client", "Client")
@js.native
class Client () extends EventEmitter {
  def this(target: String) = this()
  def this(target: js.UndefOr[scala.Nothing], options: ClientOptions) = this()
  def this(target: String, options: ClientOptions) = this()
  
  def buildFormattedMessage(message: String, options: MessageOptions): Buffer = js.native
  
  def close(): Client = js.native
  
  def getTransport(cb: js.Function2[/* error */ js.Error | Null, /* transport */ Transport, Unit]): Unit = js.native
  
  def log(message: String): Client = js.native
  def log(
    message: String,
    options: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* error */ js.Error | Null, Unit]
  ): Client = js.native
  def log(message: String, options: MessageOptions): Client = js.native
  def log(message: String, options: MessageOptions, cb: js.Function1[/* error */ js.Error | Null, Unit]): Client = js.native
  
  def onClose(): Client = js.native
  
  def onError(error: js.Error): Client = js.native
}
