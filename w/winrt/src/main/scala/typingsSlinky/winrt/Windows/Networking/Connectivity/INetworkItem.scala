package typingsSlinky.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INetworkItem extends js.Object {
  var networkId: String = js.native
  def getNetworkTypes(): NetworkTypes = js.native
}

object INetworkItem {
  @scala.inline
  def apply(getNetworkTypes: () => NetworkTypes, networkId: String): INetworkItem = {
    val __obj = js.Dynamic.literal(getNetworkTypes = js.Any.fromFunction0(getNetworkTypes), networkId = networkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[INetworkItem]
  }
  @scala.inline
  implicit class INetworkItemOps[Self <: INetworkItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetNetworkTypes(value: () => NetworkTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNetworkTypes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNetworkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

