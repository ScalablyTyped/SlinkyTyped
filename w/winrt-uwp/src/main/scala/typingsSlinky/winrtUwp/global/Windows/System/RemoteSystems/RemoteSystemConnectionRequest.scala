package typingsSlinky.winrtUwp.global.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an intent to communicate with a specific remote system (device). */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemConnectionRequest")
@js.native
class RemoteSystemConnectionRequest protected ()
  extends typingsSlinky.winrtUwp.Windows.System.RemoteSystems.RemoteSystemConnectionRequest {
  /** Initializes an instance of the RemoteSystemConnectionRequest class. */
  def this(remoteSystem: typingsSlinky.winrtUwp.Windows.System.RemoteSystems.RemoteSystem) = this()
}
/* static members */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemConnectionRequest")
@js.native
object RemoteSystemConnectionRequest extends js.Object {
  
  /** Initializes a new instance of the RemoteSystemConnectionRequest class for a particular application on a remote system. */
  def createForApp(remoteSystemApp: typingsSlinky.winrtUwp.Windows.System.RemoteSystems.RemoteSystemApp): typingsSlinky.winrtUwp.Windows.System.RemoteSystems.RemoteSystemConnectionRequest = js.native
}
