package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for the AccountUpdated event. */
@js.native
trait MobileBroadbandAccountUpdatedEventArgs extends js.Object {
  /** Gets a value indicating whether the device information has changed for the account. */
  var hasDeviceInformationChanged: Boolean = js.native
  /** Gets a value that indicates if the CurrentNetwork was updated for the account. */
  var hasNetworkChanged: Boolean = js.native
  /** Gets the network account Id of the updated account. */
  var networkAccountId: String = js.native
}

object MobileBroadbandAccountUpdatedEventArgs {
  @scala.inline
  def apply(hasDeviceInformationChanged: Boolean, hasNetworkChanged: Boolean, networkAccountId: String): MobileBroadbandAccountUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(hasDeviceInformationChanged = hasDeviceInformationChanged.asInstanceOf[js.Any], hasNetworkChanged = hasNetworkChanged.asInstanceOf[js.Any], networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandAccountUpdatedEventArgs]
  }
  @scala.inline
  implicit class MobileBroadbandAccountUpdatedEventArgsOps[Self <: MobileBroadbandAccountUpdatedEventArgs] (val x: Self) extends AnyVal {
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

