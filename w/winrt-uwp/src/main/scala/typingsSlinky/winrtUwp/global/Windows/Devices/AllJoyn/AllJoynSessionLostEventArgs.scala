package typingsSlinky.winrtUwp.global.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information that identifies the reason for a lost session. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionLostEventArgs")
@js.native
class AllJoynSessionLostEventArgs protected ()
  extends typingsSlinky.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostEventArgs {
  /**
    * Generates an AllJoynSessionLostEventArgs object containing information that identifies the reason for the lost session.
    * @param reason The reason the session was lost.
    */
  def this(reason: typingsSlinky.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason) = this()
}
