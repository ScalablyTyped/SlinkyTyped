package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteConsole extends Remote {
  /**
    * Show an error message.
    *
    * @param message The message to show.
    */
  def error(message: String): Unit = js.native
  /**
    * Show an information message.
    *
    * @param message The message to show.
    */
  def info(message: String): Unit = js.native
  /**
    * Log a message.
    *
    * @param message The message to log.
    */
  def log(message: String): Unit = js.native
  /**
    * Show a warning message.
    *
    * @param message The message to show.
    */
  def warn(message: String): Unit = js.native
}

object RemoteConsole {
  @scala.inline
  def apply(
    attach: IConnection => Unit,
    connection: IConnection,
    error: String => Unit,
    fillServerCapabilities: ServerCapabilities => Unit,
    info: String => Unit,
    initialize: ClientCapabilities => Unit,
    log: String => Unit,
    warn: String => Unit
  ): RemoteConsole = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), connection = connection.asInstanceOf[js.Any], error = js.Any.fromFunction1(error), fillServerCapabilities = js.Any.fromFunction1(fillServerCapabilities), info = js.Any.fromFunction1(info), initialize = js.Any.fromFunction1(initialize), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[RemoteConsole]
  }
  @scala.inline
  implicit class RemoteConsoleOps[Self <: RemoteConsole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInfo(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLog(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWarn(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

