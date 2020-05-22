package typingsSlinky.winrtUwp.global.Windows.System.RemoteSystems

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of a specific discovery type. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemDiscoveryTypeFilter")
@js.native
class RemoteSystemDiscoveryTypeFilter protected ()
  extends typingsSlinky.winrtUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryTypeFilter {
  /** Initializes an instance of the RemoteSystemDiscoveryTypeFilter class. */
  def this(discoveryType: typingsSlinky.winrtUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType) = this()
  /** String representation(s) of the device type(s) that the containing RemoteSystemKindFilter object targets. */
  /* CompleteClass */
  override var remoteSystemKinds: IVectorView[String] = js.native
}

