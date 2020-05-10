package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMobileBroadbandAccountStatics extends js.Object {
  var availableNetworkAccountIds: IVectorView[String] = js.native
  def createFromNetworkAccountId(networkAccountId: String): MobileBroadbandAccount = js.native
}

object IMobileBroadbandAccountStatics {
  @scala.inline
  def apply(
    availableNetworkAccountIds: IVectorView[String],
    createFromNetworkAccountId: String => MobileBroadbandAccount
  ): IMobileBroadbandAccountStatics = {
    val __obj = js.Dynamic.literal(availableNetworkAccountIds = availableNetworkAccountIds.asInstanceOf[js.Any], createFromNetworkAccountId = js.Any.fromFunction1(createFromNetworkAccountId))
    __obj.asInstanceOf[IMobileBroadbandAccountStatics]
  }
  @scala.inline
  implicit class IMobileBroadbandAccountStaticsOps[Self <: IMobileBroadbandAccountStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableNetworkAccountIds(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableNetworkAccountIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateFromNetworkAccountId(value: String => MobileBroadbandAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromNetworkAccountId")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

