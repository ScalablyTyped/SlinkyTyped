package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the track data obtained following a card swipe. */
@js.native
trait MagneticStripeReaderTrackData extends js.Object {
  /** Gets the raw or decoded data from the swiped card. */
  var data: IBuffer = js.native
  /** Gets the discretionary data from the swiped card. */
  var discretionaryData: IBuffer = js.native
  /** Gets the encrypted data from the swiped card. */
  var encryptedData: IBuffer = js.native
}

object MagneticStripeReaderTrackData {
  @scala.inline
  def apply(data: IBuffer, discretionaryData: IBuffer, encryptedData: IBuffer): MagneticStripeReaderTrackData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], discretionaryData = discretionaryData.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderTrackData]
  }
  @scala.inline
  implicit class MagneticStripeReaderTrackDataOps[Self <: MagneticStripeReaderTrackData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscretionaryData(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discretionaryData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptedData(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

