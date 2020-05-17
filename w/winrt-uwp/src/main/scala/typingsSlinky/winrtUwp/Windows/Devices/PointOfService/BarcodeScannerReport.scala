package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the barcode scanner data. */
@js.native
trait BarcodeScannerReport extends js.Object {
  /** Gets the full raw data from the DataReceived event. */
  var scanData: IBuffer = js.native
  /** Gets the decoded barcode label, which does not include the header, checksum, and other miscellaneous information. */
  var scanDataLabel: IBuffer = js.native
  /** Gets the decoded barcode label type. Possible values are defined in the BarcodeSymbologies class. */
  var scanDataType: Double = js.native
}

object BarcodeScannerReport {
  @scala.inline
  def apply(scanData: IBuffer, scanDataLabel: IBuffer, scanDataType: Double): BarcodeScannerReport = {
    val __obj = js.Dynamic.literal(scanData = scanData.asInstanceOf[js.Any], scanDataLabel = scanDataLabel.asInstanceOf[js.Any], scanDataType = scanDataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerReport]
  }
  @scala.inline
  implicit class BarcodeScannerReportOps[Self <: BarcodeScannerReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScanData(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScanDataLabel(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanDataLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScanDataType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanDataType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

