package typingsSlinky.winrtUwp.global.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a peer that was added to a session. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionMemberAddedEventArgs")
@js.native
class AllJoynSessionMemberAddedEventArgs protected ()
  extends typingsSlinky.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionMemberAddedEventArgs {
  /**
    * Generates an object that contains information about the remote app added to the session.
    * @param uniqueName The unique Consumer name.
    */
  def this(uniqueName: String) = this()
}
