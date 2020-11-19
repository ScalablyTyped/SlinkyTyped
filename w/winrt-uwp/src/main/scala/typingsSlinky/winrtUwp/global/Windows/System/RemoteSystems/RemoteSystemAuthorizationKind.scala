package typingsSlinky.winrtUwp.global.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains values specifying whether the client device can discover only same-user devices or other users' devices as well. Cross-user devices must be available through a proximal connection in order to be discovered (see RemoteSystemDiscoveryType for details). */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemAuthorizationKind")
@js.native
object RemoteSystemAuthorizationKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAuthorizationKind with Double
  ] = js.native
  
  /* 1 */ val anonymous: typingsSlinky.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAuthorizationKind.anonymous with Double = js.native
  
  /* 0 */ val sameUser: typingsSlinky.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAuthorizationKind.sameUser with Double = js.native
}
