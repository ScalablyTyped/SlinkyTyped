package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an operation status change. */
@js.native
trait BarcodeScannerStatusUpdatedEventArgs extends js.Object {
  /** Gets the vendor specific status code. */
  var extendedStatus: Double = js.native
  /** Gets the status change information. */
  var status: BarcodeScannerStatus = js.native
}

object BarcodeScannerStatusUpdatedEventArgs {
  @scala.inline
  def apply(extendedStatus: Double, status: BarcodeScannerStatus): BarcodeScannerStatusUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(extendedStatus = extendedStatus.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerStatusUpdatedEventArgs]
  }
  @scala.inline
  implicit class BarcodeScannerStatusUpdatedEventArgsOps[Self <: BarcodeScannerStatusUpdatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtendedStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: BarcodeScannerStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

