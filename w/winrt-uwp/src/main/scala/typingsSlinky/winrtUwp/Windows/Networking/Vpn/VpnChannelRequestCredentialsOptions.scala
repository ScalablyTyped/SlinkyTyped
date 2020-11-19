package typingsSlinky.winrtUwp.Windows.Networking.Vpn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VpnChannelRequestCredentialsOptions extends js.Object
/** Specifies the values defining whether a requested credential is a retry case, or should be used for single sign on. */
@JSGlobal("Windows.Networking.Vpn.VpnChannelRequestCredentialsOptions")
@js.native
object VpnChannelRequestCredentialsOptions extends js.Object {
  
  /** None. */
  @js.native
  sealed trait none extends VpnChannelRequestCredentialsOptions
  
  /** Retrying. */
  @js.native
  sealed trait retrying extends VpnChannelRequestCredentialsOptions
  
  /** Use for single sign on. */
  @js.native
  sealed trait useForSingleSignIn extends VpnChannelRequestCredentialsOptions
}
