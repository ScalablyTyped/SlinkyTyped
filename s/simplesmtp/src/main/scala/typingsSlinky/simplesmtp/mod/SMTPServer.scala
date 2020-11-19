package typingsSlinky.simplesmtp.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("simplesmtp", "SMTPServer")
@js.native
class SMTPServer () extends EventEmitter {
  def this(options: SmtpServerOptions) = this()
  
  /**
    * <p>Closes the server</p>
    *
    * @param {Function} callback The callback function to run when the server is closed
    */
  def end(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Server starts listening on defined port and hostname
    *
    * @param {Number} port The port number to listen
    * @param {String} [host] The hostname to listen
    * @param {Function} callback The callback function to run when the server is listening
    */
  def listen(port: Double, host: String): Unit = js.native
  def listen(port: Double, host: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
}
