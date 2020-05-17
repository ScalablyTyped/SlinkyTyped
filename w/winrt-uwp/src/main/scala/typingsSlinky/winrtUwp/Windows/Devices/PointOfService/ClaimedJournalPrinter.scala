package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a journal printer station that has been claimed for use. */
@js.native
trait ClaimedJournalPrinter extends js.Object {
  /** Gets or sets the number of characters per line for the journal printer station. */
  var charactersPerLine: Double = js.native
  /** Gets or sets the color cartridge that the journal printer station should use when it prints. This property must agree with what is available through ColorCartridgeCapabilities . */
  var colorCartridge: PosPrinterColorCartridge = js.native
  /** Gets whether the printer cartridge for the journal printer station is empty. Note, this may throw an exception if the corresponding sensor is not available on the printer. See JournalPrinterCapabilities to verify sensor availability. */
  var isCartridgeEmpty: Boolean = js.native
  /** Gets whether the cartridge for journal printer station has been removed. Note, this may throw an exception if the corresponding sensor is not available on the printer. See JournalPrinterCapabilities to verify sensor availability. */
  var isCartridgeRemoved: Boolean = js.native
  /** Gets whether the printer cover for the journal printer station is open. */
  var isCoverOpen: Boolean = js.native
  /** Gets whether the head for the journal printer station is currently cleaning. */
  var isHeadCleaning: Boolean = js.native
  /** Gets or sets whether the journal printer station prints with high quality or high speed. Note, this may throw an exception if the corresponding sensor is not available on the printer. */
  var isLetterQuality: Boolean = js.native
  /** Gets whether the paper is empty for the journal printer station. Note, this may throw an exception if the corresponding sensor is not available on the printer. See JournalPrinterCapabilities to verify sensor availability. */
  var isPaperEmpty: Boolean = js.native
  /** Gets whether the printer paper is near the end for the journal printer station. Note, this may throw an exception if the corresponding sensor is not available on the printer. See JournalPrinterCapabilities to verify sensor availability. */
  var isPaperNearEnd: Boolean = js.native
  /** Gets whether the journal printer station is ready to print. Note, this may throw an exception if the corresponding sensor is not available on the printer. See JournalPrinterCapabilities to verify sensor availability. */
  var isReadyToPrint: Boolean = js.native
  /** Gets or sets the current height of the printed line for the journal printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var lineHeight: Double = js.native
  /** Gets or sets the spacing of each single-high print line for the journal printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. This spacing includes both the height of printed line and of the white space between each pair of lines. */
  var lineSpacing: Double = js.native
  /** Gets the current width of the printed line for the journal printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var lineWidth: Double = js.native
  /**
    * Creates a new print job for the journal printer station.
    * @return The new print job for the journal printer station.
    */
  def createJob(): JournalPrintJob = js.native
  /**
    * Determines if a JournalPrintJob can successfully execute a print instruction with the specified data.
    * @param data The data sequence that you want to validate before you use it with the JournalPrintJob.Print method. This sequence may include printable data and escape sequences.
    * @return True if the data passes validation; otherwise false.
    */
  def validateData(data: String): Boolean = js.native
}

object ClaimedJournalPrinter {
  @scala.inline
  def apply(
    charactersPerLine: Double,
    colorCartridge: PosPrinterColorCartridge,
    createJob: () => JournalPrintJob,
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
    validateData: String => Boolean
  ): ClaimedJournalPrinter = {
    val __obj = js.Dynamic.literal(charactersPerLine = charactersPerLine.asInstanceOf[js.Any], colorCartridge = colorCartridge.asInstanceOf[js.Any], createJob = js.Any.fromFunction0(createJob), isCartridgeEmpty = isCartridgeEmpty.asInstanceOf[js.Any], isCartridgeRemoved = isCartridgeRemoved.asInstanceOf[js.Any], isCoverOpen = isCoverOpen.asInstanceOf[js.Any], isHeadCleaning = isHeadCleaning.asInstanceOf[js.Any], isLetterQuality = isLetterQuality.asInstanceOf[js.Any], isPaperEmpty = isPaperEmpty.asInstanceOf[js.Any], isPaperNearEnd = isPaperNearEnd.asInstanceOf[js.Any], isReadyToPrint = isReadyToPrint.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], validateData = js.Any.fromFunction1(validateData))
    __obj.asInstanceOf[ClaimedJournalPrinter]
  }
  @scala.inline
  implicit class ClaimedJournalPrinterOps[Self <: ClaimedJournalPrinter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharactersPerLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charactersPerLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorCartridge(value: PosPrinterColorCartridge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorCartridge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateJob(value: () => JournalPrintJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createJob")(js.Any.fromFunction0(value))
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
    def withValidateData(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateData")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

