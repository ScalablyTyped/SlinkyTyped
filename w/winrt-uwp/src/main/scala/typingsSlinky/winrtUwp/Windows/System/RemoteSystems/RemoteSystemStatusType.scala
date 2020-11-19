package typingsSlinky.winrtUwp.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RemoteSystemStatusType extends js.Object
/** Contains the values that describe a remote system's status type. This is a simplification of the RemoteSystemStatus enumeration and is used to construct a RemoteSystemStatusTypeFilter object. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemStatusType")
@js.native
object RemoteSystemStatusType extends js.Object {
  
  /** The remote system can have any availability status and be discoverable. */
  @js.native
  sealed trait any extends RemoteSystemStatusType
  
  /** The remote system must have a Status property value of Available in order to be discoverable. */
  @js.native
  sealed trait available extends RemoteSystemStatusType
}
