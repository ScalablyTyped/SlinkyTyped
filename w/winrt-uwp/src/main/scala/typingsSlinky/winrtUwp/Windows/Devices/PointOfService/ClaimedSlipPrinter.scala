package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.Rect
import typingsSlinky.winrtUwp.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a slip printer station that has been claimed for use. */
@js.native
trait ClaimedSlipPrinter extends js.Object {
  /** Gets or sets the number of characters the slip printer station can print per line of text. */
  var charactersPerLine: Double = js.native
  /** Gets or sets the color cartridge that the slip printer station should use when it prints. */
  var colorCartridge: PosPrinterColorCartridge = js.native
  /** Gets whether the cartridge of the slip printer station is currently out of ink or toner. */
  var isCartridgeEmpty: Boolean = js.native
  /** Gets whether the cartridge of the slip printer station is currently removed. */
  var isCartridgeRemoved: Boolean = js.native
  /** Gets whether the cover of the slip printer station is currently open. */
  var isCoverOpen: Boolean = js.native
  /** Gets whether the slip printer station is currently cleaning its print head. */
  var isHeadCleaning: Boolean = js.native
  /** Gets or sets whether the slip printer station prints with high quality or high speed. */
  var isLetterQuality: Boolean = js.native
  /** Gets whether the slip printer station needs paper. */
  var isPaperEmpty: Boolean = js.native
  /** Gets whether the slip printer station is almost out of paper. */
  var isPaperNearEnd: Boolean = js.native
  /** Gets whether the slip printer station is on and accepting print jobs. */
  var isReadyToPrint: Boolean = js.native
  /** Gets or sets the current height of the printed line for the slip printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var lineHeight: Double = js.native
  /** Gets or sets the spacing of each single-high print line for the slip printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. This spacing includes both the height of printed line and of the white space between each pair of lines. */
  var lineSpacing: Double = js.native
  /** Gets the current width of the printed line for the slip printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var lineWidth: Double = js.native
  /** Gets the number of lines that the slip printer station can print after the ClaimedSlipPrinter.IsPaperNearEnd property is set to true but before the printer reaches the end of the slip. */
  var linesNearEndToEnd: Double = js.native
  /** Gets the maximum number of lines that the slip printer station can print on a form. */
  var maxLines: Double = js.native
  /** Gets the size of paper that the claimed slip printer station currently uses, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var pageSize: Size = js.native
  /** Gets the print area for the slip printer station, expressed in the unit of measurement that the ClaimedPosPrinter.MapMode property specifies. */
  var printArea: Rect = js.native
  /** Gets the side of the sheet on which the claimed slip printer station is currently printing. */
  var printSide: PosPrinterPrintSide = js.native
  /** Gets the maximum number of characters that the slip printer station can print on each line in sideways mode. */
  var sidewaysMaxChars: Double = js.native
  /** Gets the maximum number of lines that the slip printer station can print in sideways mode. */
  var sidewaysMaxLines: Double = js.native
  /**
    * Changes the side of the sheet on which the claimed slip printer station is currently printing.
    * @param printSide The side of the sheet on which the claimed slip printer station is currently printing.
    */
  def changePrintSide(printSide: PosPrinterPrintSide): Unit = js.native
  /** Closes the mechanism that holds the slip in place while the slip printer station is printing, typically after the user inserts or removes the slip. */
  def closeJaws(): Unit = js.native
  /**
    * Creates a new print job for the slip printer stiation.
    * @return The new print job for the slip printer station.
    */
  def createJob(): SlipPrintJob = js.native
  /**
    * Waits for the user to insert a slip into the slip printer station.
    * @param timeout The interval of time that the operation should wait for the user to insert the slip before exiting.
    * @return An asynchronous operation that returns true if the user inserts the slip within the specified time span, and returns false otherwise.
    */
  def insertSlipAsync(timeout: Double): IPromiseWithIAsyncOperation[Boolean] = js.native
  /** Opens the mechanism that holds the slip in place while the slip printer station is printing, typically before the user inserts or removes the slip. */
  def openJaws(): Unit = js.native
  /**
    * Waits for the user to remove a slip from the slip printer station.
    * @param timeout The interval of time that the operation should wait for the user to remove the slip before exiting.
    * @return An asynchronous operation that returns true if the user removes the slip within the specified time span, and returns false otherwise.
    */
  def removeSlipAsync(timeout: Double): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Determines whether a data sequence, possibly including one or more escape sequences, is valid for the slip printer station, before you use that data sequence when you call the SlipPrintJob.Print and SlipPrintJob.ExecuteAsync methods.
    * @param data The data sequence that you want to validate before you use it with the SlipPrintJob.Print method. This sequence may include printable data and escape sequences.
    * @return True if the data passes validation; otherwise false.
    */
  def validateData(data: String): Boolean = js.native
}

object ClaimedSlipPrinter {
  @scala.inline
  def apply(
    changePrintSide: PosPrinterPrintSide => Unit,
    charactersPerLine: Double,
    closeJaws: () => Unit,
    colorCartridge: PosPrinterColorCartridge,
    createJob: () => SlipPrintJob,
    insertSlipAsync: Double => IPromiseWithIAsyncOperation[Boolean],
    isCartridgeEmpty: Boolean,
    isCartridgeRemoved: Boolean,
    isCoverOpen: Boolean,
    isHeadCleaning: Boolean,
    isLetterQuality: Boolean,
    isPaperEmpty: Boolean,
    isPaperNearEnd: Boolean,
    isReadyToPrint: Boolean,
    lineHeight: Double,
    lineSpacing: Double,
    lineWidth: Double,
    linesNearEndToEnd: Double,
    maxLines: Double,
    openJaws: () => Unit,
    pageSize: Size,
    printArea: Rect,
    printSide: PosPrinterPrintSide,
    removeSlipAsync: Double => IPromiseWithIAsyncOperation[Boolean],
    sidewaysMaxChars: Double,
    sidewaysMaxLines: Double,
    validateData: String => Boolean
  ): ClaimedSlipPrinter = {
    val __obj = js.Dynamic.literal(changePrintSide = js.Any.fromFunction1(changePrintSide), charactersPerLine = charactersPerLine.asInstanceOf[js.Any], closeJaws = js.Any.fromFunction0(closeJaws), colorCartridge = colorCartridge.asInstanceOf[js.Any], createJob = js.Any.fromFunction0(createJob), insertSlipAsync = js.Any.fromFunction1(insertSlipAsync), isCartridgeEmpty = isCartridgeEmpty.asInstanceOf[js.Any], isCartridgeRemoved = isCartridgeRemoved.asInstanceOf[js.Any], isCoverOpen = isCoverOpen.asInstanceOf[js.Any], isHeadCleaning = isHeadCleaning.asInstanceOf[js.Any], isLetterQuality = isLetterQuality.asInstanceOf[js.Any], isPaperEmpty = isPaperEmpty.asInstanceOf[js.Any], isPaperNearEnd = isPaperNearEnd.asInstanceOf[js.Any], isReadyToPrint = isReadyToPrint.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], linesNearEndToEnd = linesNearEndToEnd.asInstanceOf[js.Any], maxLines = maxLines.asInstanceOf[js.Any], openJaws = js.Any.fromFunction0(openJaws), pageSize = pageSize.asInstanceOf[js.Any], printArea = printArea.asInstanceOf[js.Any], printSide = printSide.asInstanceOf[js.Any], removeSlipAsync = js.Any.fromFunction1(removeSlipAsync), sidewaysMaxChars = sidewaysMaxChars.asInstanceOf[js.Any], sidewaysMaxLines = sidewaysMaxLines.asInstanceOf[js.Any], validateData = js.Any.fromFunction1(validateData))
    __obj.asInstanceOf[ClaimedSlipPrinter]
  }
  @scala.inline
  implicit class ClaimedSlipPrinterOps[Self <: ClaimedSlipPrinter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangePrintSide(value: PosPrinterPrintSide => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changePrintSide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCharactersPerLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charactersPerLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseJaws(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeJaws")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withColorCartridge(value: PosPrinterColorCartridge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorCartridge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateJob(value: () => SlipPrintJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createJob")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsertSlipAsync(value: Double => IPromiseWithIAsyncOperation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSlipAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsCartridgeEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCartridgeEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCartridgeRemoved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCartridgeRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCoverOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCoverOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHeadCleaning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeadCleaning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLetterQuality(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLetterQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPaperEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaperEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPaperNearEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaperNearEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReadyToPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadyToPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinesNearEndToEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linesNearEndToEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenJaws(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openJaws")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPageSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintArea(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintSide(value: PosPrinterPrintSide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveSlipAsync(value: Double => IPromiseWithIAsyncOperation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSlipAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSidewaysMaxChars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidewaysMaxChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSidewaysMaxLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidewaysMaxLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateData(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateData")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

