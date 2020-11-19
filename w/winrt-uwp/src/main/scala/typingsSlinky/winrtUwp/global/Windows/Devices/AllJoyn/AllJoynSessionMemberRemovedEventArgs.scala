package typingsSlinky.winrtUwp.global.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a remote app removed from a session. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionMemberRemovedEventArgs")
@js.native
class AllJoynSessionMemberRemovedEventArgs protected ()
  extends typingsSlinky.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionMemberRemovedEventArgs {
  /**
    * Generates an object containing information about a remote app removed from a session.
    * @param uniqueName The unique bus name of the remote app removed from the session.
    */
  def this(uniqueName: String) = this()
}
