package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
@js.native
class MobileBroadbandAccount () extends IMobileBroadbandAccount

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
@js.native
object MobileBroadbandAccount extends js.Object {
  var availableNetworkAccountIds: IVectorView[String] = js.native
  def createFromNetworkAccountId(networkAccountId: String): MobileBroadbandAccount = js.native
}

