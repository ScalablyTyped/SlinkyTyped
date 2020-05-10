package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMobileBroadbandAccountUpdatedEventArgs extends js.Object {
  var hasDeviceInformationChanged: Boolean = js.native
  var hasNetworkChanged: Boolean = js.native
  var networkAccountId: String = js.native
}

object IMobileBroadbandAccountUpdatedEventArgs {
  @scala.inline
  def apply(hasDeviceInformationChanged: Boolean, hasNetworkChanged: Boolean, networkAccountId: String): IMobileBroadbandAccountUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(hasDeviceInformationChanged = hasDeviceInformationChanged.asInstanceOf[js.Any], hasNetworkChanged = hasNetworkChanged.asInstanceOf[js.Any], networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMobileBroadbandAccountUpdatedEventArgs]
  }
  @scala.inline
  implicit class IMobileBroadbandAccountUpdatedEventArgsOps[Self <: IMobileBroadbandAccountUpdatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasDeviceInformationChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDeviceInformationChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasNetworkChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNetworkChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkAccountId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

