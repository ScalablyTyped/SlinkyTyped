package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the capabilities of receipt station of a point-of-service printer. */
@js.native
trait ReceiptPrinterCapabilities extends js.Object {
  /** Gets whether the receipt printer station can perform paper cuts. */
  var canCutPaper: Boolean = js.native
  /** Gets information about the sensors that the receipt printer station has available to report the status of the printer station. */
  var cartridgeSensors: PosPrinterCartridgeSensors = js.native
  /** Gets the color cartridges that the receipt printer station can use to print in color. */
  var colorCartridgeCapabilities: PosPrinterColorCapabilities = js.native
  /** Gets whether the receipt printer station can print in a rotated upside-down mode. */
  var is180RotationSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print barcodes. */
  var isBarcodeSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print bitmaps. */
  var isBitmapSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print bold characters. */
  var isBoldSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print characters that are both double-high and double-wide. */
  var isDoubleHighDoubleWidePrintSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print double-high characters. */
  var isDoubleHighPrintSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print double-wide characters. */
  var isDoubleWidePrintSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print a dark color plus an alternate color. */
  var isDualColorSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print italic characters. */
  var isItalicSupported: Boolean = js.native
  /** Gets whether the receipt printer station can print information rotated 90 degrees to the left. */
  var isLeft90RotationSupported: Boolean = js.native
  /** Gets whether the receipt printer station has an out-of-paper sensor. */
  var isPaperEmptySensorSupported: Boolean = js.native
  /** Gets whether the receipt printer station has a low-paper sensor. */
  var isPaperNearEndSensorSupported: Boolean = js.native
  /** Gets whether the receipt printer station supports setting a custom size for the area of the page on which the printer should print. */
  var isPrintAreaSupported: Boolean = js.native
  /** Gets whether a point-of-service printer with a station that prints receipts is present. */
  var isPrinterPresent: Boolean = js.native
  /** Gets whether the receipt printer station can print information rotated 90 degrees to the right. */
  var isRight90RotationSupported: Boolean = js.native
  /** Gets whether the receipt printer station has a stamp capability. */
  var isStampSupported: Boolean = js.native
  /** Gets whether the receipt printer station can underline characters. */
  var isUnderlineSupported: Boolean = js.native
  /** Gets the type of mark-sensed paper handling that is available for the receipt printer station. */
  var markFeedCapabilities: PosPrinterMarkFeedCapabilities = js.native
  /** Gets information about the capabilities of the receipt printer station to draw ruled lines. */
  var ruledLineCapabilities: PosPrinterRuledLineCapabilities = js.native
  /** Gets a list of the directions in which the receipt printer station can rotate a barcode when printing. */
  var supportedBarcodeRotations: IVectorView[PosPrinterRotation] = js.native
  /** Gets a list of the directions in which the receipt printer station can rotate a bitmap when printing. */
  var supportedBitmapRotations: IVectorView[PosPrinterRotation] = js.native
  /** Gets a collection of the line widths in characters per line that the receipt printer station supports. */
  var supportedCharactersPerLine: IVectorView[Double] = js.native
}

object ReceiptPrinterCapabilities {
  @scala.inline
  def apply(
    canCutPaper: Boolean,
    cartridgeSensors: PosPrinterCartridgeSensors,
    colorCartridgeCapabilities: PosPrinterColorCapabilities,
    is180RotationSupported: Boolean,
    isBarcodeSupported: Boolean,
    isBitmapSupported: Boolean,
    isBoldSupported: Boolean,
    isDoubleHighDoubleWidePrintSupported: Boolean,
    isDoubleHighPrintSupported: Boolean,
    isDoubleWidePrintSupported: Boolean,
    isDualColorSupported: Boolean,
    isItalicSupported: Boolean,
    isLeft90RotationSupported: Boolean,
    isPaperEmptySensorSupported: Boolean,
    isPaperNearEndSensorSupported: Boolean,
    isPrintAreaSupported: Boolean,
    isPrinterPresent: Boolean,
    isRight90RotationSupported: Boolean,
    isStampSupported: Boolean,
    isUnderlineSupported: Boolean,
    markFeedCapabilities: PosPrinterMarkFeedCapabilities,
    ruledLineCapabilities: PosPrinterRuledLineCapabilities,
    supportedBarcodeRotations: IVectorView[PosPrinterRotation],
    supportedBitmapRotations: IVectorView[PosPrinterRotation],
    supportedCharactersPerLine: IVectorView[Double]
  ): ReceiptPrinterCapabilities = {
    val __obj = js.Dynamic.literal(canCutPaper = canCutPaper.asInstanceOf[js.Any], cartridgeSensors = cartridgeSensors.asInstanceOf[js.Any], colorCartridgeCapabilities = colorCartridgeCapabilities.asInstanceOf[js.Any], is180RotationSupported = is180RotationSupported.asInstanceOf[js.Any], isBarcodeSupported = isBarcodeSupported.asInstanceOf[js.Any], isBitmapSupported = isBitmapSupported.asInstanceOf[js.Any], isBoldSupported = isBoldSupported.asInstanceOf[js.Any], isDoubleHighDoubleWidePrintSupported = isDoubleHighDoubleWidePrintSupported.asInstanceOf[js.Any], isDoubleHighPrintSupported = isDoubleHighPrintSupported.asInstanceOf[js.Any], isDoubleWidePrintSupported = isDoubleWidePrintSupported.asInstanceOf[js.Any], isDualColorSupported = isDualColorSupported.asInstanceOf[js.Any], isItalicSupported = isItalicSupported.asInstanceOf[js.Any], isLeft90RotationSupported = isLeft90RotationSupported.asInstanceOf[js.Any], isPaperEmptySensorSupported = isPaperEmptySensorSupported.asInstanceOf[js.Any], isPaperNearEndSensorSupported = isPaperNearEndSensorSupported.asInstanceOf[js.Any], isPrintAreaSupported = isPrintAreaSupported.asInstanceOf[js.Any], isPrinterPresent = isPrinterPresent.asInstanceOf[js.Any], isRight90RotationSupported = isRight90RotationSupported.asInstanceOf[js.Any], isStampSupported = isStampSupported.asInstanceOf[js.Any], isUnderlineSupported = isUnderlineSupported.asInstanceOf[js.Any], markFeedCapabilities = markFeedCapabilities.asInstanceOf[js.Any], ruledLineCapabilities = ruledLineCapabilities.asInstanceOf[js.Any], supportedBarcodeRotations = supportedBarcodeRotations.asInstanceOf[js.Any], supportedBitmapRotations = supportedBitmapRotations.asInstanceOf[js.Any], supportedCharactersPerLine = supportedCharactersPerLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptPrinterCapabilities]
  }
  @scala.inline
  implicit class ReceiptPrinterCapabilitiesOps[Self <: ReceiptPrinterCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanCutPaper(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCutPaper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCartridgeSensors(value: PosPrinterCartridgeSensors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cartridgeSensors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorCartridgeCapabilities(value: PosPrinterColorCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorCartridgeCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs180RotationSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is180RotationSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBarcodeSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBarcodeSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBitmapSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBitmapSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBoldSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBoldSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDoubleHighDoubleWidePrintSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDoubleHighDoubleWidePrintSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDoubleHighPrintSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDoubleHighPrintSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDoubleWidePrintSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDoubleWidePrintSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDualColorSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDualColorSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsItalicSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isItalicSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLeft90RotationSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLeft90RotationSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPaperEmptySensorSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaperEmptySensorSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPaperNearEndSensorSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaperNearEndSensorSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPrintAreaSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrintAreaSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPrinterPresent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrinterPresent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRight90RotationSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRight90RotationSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStampSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStampSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUnderlineSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnderlineSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkFeedCapabilities(value: PosPrinterMarkFeedCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markFeedCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuledLineCapabilities(value: PosPrinterRuledLineCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruledLineCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedBarcodeRotations(value: IVectorView[PosPrinterRotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedBarcodeRotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedBitmapRotations(value: IVectorView[PosPrinterRotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedBitmapRotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedCharactersPerLine(value: IVectorView[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCharactersPerLine")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

