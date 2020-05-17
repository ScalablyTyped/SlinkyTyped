package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ErrorOccurred event. */
@js.native
trait BarcodeScannerErrorOccurredEventArgs extends js.Object {
  /** Gets the data associated with the ErrorOccurred event. */
  var errorData: UnifiedPosErrorData = js.native
  /** Indicates whether it is worthwhile to make another attempt at the operation. */
  var isRetriable: Boolean = js.native
  /** Gets any data that was successfully read. */
  var partialInputData: BarcodeScannerReport = js.native
}

object BarcodeScannerErrorOccurredEventArgs {
  @scala.inline
  def apply(errorData: UnifiedPosErrorData, isRetriable: Boolean, partialInputData: BarcodeScannerReport): BarcodeScannerErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(errorData = errorData.asInstanceOf[js.Any], isRetriable = isRetriable.asInstanceOf[js.Any], partialInputData = partialInputData.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerErrorOccurredEventArgs]
  }
  @scala.inline
  implicit class BarcodeScannerErrorOccurredEventArgsOps[Self <: BarcodeScannerErrorOccurredEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorData(value: UnifiedPosErrorData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRetriable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRetriable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartialInputData(value: BarcodeScannerReport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialInputData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

