package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reports results of a call to MobileBroadbandUicc.GetUiccAppsAsync . */
@js.native
trait MobileBroadbandUiccAppsResult extends js.Object {
  /** Gets the status of the completed MobileBroadbandUicc.GetUiccAppsAsync operation. If this value is not Success, then other properties may not be valid. */
  var status: MobileBroadbandUiccAppOperationStatus = js.native
  /** A list of UICC applications retrieved using MobileBroadbandUicc.GetUiccAppsAsync . Note that this is only valid when Status is Success. */
  var uiccApps: IVectorView[MobileBroadbandUiccApp] = js.native
}

object MobileBroadbandUiccAppsResult {
  @scala.inline
  def apply(status: MobileBroadbandUiccAppOperationStatus, uiccApps: IVectorView[MobileBroadbandUiccApp]): MobileBroadbandUiccAppsResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], uiccApps = uiccApps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandUiccAppsResult]
  }
  @scala.inline
  implicit class MobileBroadbandUiccAppsResultOps[Self <: MobileBroadbandUiccAppsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: MobileBroadbandUiccAppOperationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUiccApps(value: IVectorView[MobileBroadbandUiccApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiccApps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

