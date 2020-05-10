package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Telemetry extends Remote {
  /**
    * Log the given data to telemetry.
    *
    * @param data The data to log. Must be a JSON serializable object.
    */
  def logEvent(data: js.Any): Unit = js.native
}

object Telemetry {
  @scala.inline
  def apply(
    attach: IConnection => Unit,
    connection: IConnection,
    fillServerCapabilities: ServerCapabilities => Unit,
    initialize: ClientCapabilities => Unit,
    logEvent: js.Any => Unit
  ): Telemetry = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), connection = connection.asInstanceOf[js.Any], fillServerCapabilities = js.Any.fromFunction1(fillServerCapabilities), initialize = js.Any.fromFunction1(initialize), logEvent = js.Any.fromFunction1(logEvent))
    __obj.asInstanceOf[Telemetry]
  }
  @scala.inline
  implicit class TelemetryOps[Self <: Telemetry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogEvent(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logEvent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

