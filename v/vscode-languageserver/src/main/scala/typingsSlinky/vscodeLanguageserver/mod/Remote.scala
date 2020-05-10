package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Remote extends js.Object {
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection = js.native
  /**
    * Attach the remote to the given connection.
    *
    * @param connection The connection this remote is operating on.
    */
  def attach(connection: IConnection): Unit = js.native
  /**
    * Called to fill in the server capabilities this feature implements.
    *
    * @param capabilities The server capabilities to fill.
    */
  def fillServerCapabilities(capabilities: ServerCapabilities): Unit = js.native
  /**
    * Called to initialize the remote with the given
    * client capabilities
    *
    * @param capabilities The client capabilities
    */
  def initialize(capabilities: ClientCapabilities): Unit = js.native
}

object Remote {
  @scala.inline
  def apply(
    attach: IConnection => Unit,
    connection: IConnection,
    fillServerCapabilities: ServerCapabilities => Unit,
    initialize: ClientCapabilities => Unit
  ): Remote = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), connection = connection.asInstanceOf[js.Any], fillServerCapabilities = js.Any.fromFunction1(fillServerCapabilities), initialize = js.Any.fromFunction1(initialize))
    __obj.asInstanceOf[Remote]
  }
  @scala.inline
  implicit class RemoteOps[Self <: Remote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttach(value: IConnection => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConnection(value: IConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillServerCapabilities(value: ServerCapabilities => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillServerCapabilities")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitialize(value: ClientCapabilities => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

