package typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet

import typingsSlinky.winrtUwp.Windows.Devices.Geolocation.BasicGeoposition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents relevant location data for a wallet item. */
@js.native
trait WalletRelevantLocation extends js.Object {
  /** Gets or sets the message associated with a relevant location. */
  var displayMessage: String = js.native
  /** Gets or sets the basic geographic position information of the location. */
  var position: BasicGeoposition = js.native
}

object WalletRelevantLocation {
  @scala.inline
  def apply(displayMessage: String, position: BasicGeoposition): WalletRelevantLocation = {
    val __obj = js.Dynamic.literal(displayMessage = displayMessage.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletRelevantLocation]
  }
  @scala.inline
  implicit class WalletRelevantLocationOps[Self <: WalletRelevantLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: BasicGeoposition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

