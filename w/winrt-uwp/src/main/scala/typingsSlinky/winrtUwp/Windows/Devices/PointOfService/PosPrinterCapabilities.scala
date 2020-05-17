package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the capabilities of the point-of-service printer. */
@js.native
trait PosPrinterCapabilities extends js.Object {
  /** Gets whether the point-of-service printer can map the characters that the application sends (in the character set that the ClaimedPosPrinter.CharacterSet property defines) to the character sets that the PosPrinter.SupportedCharacterSets property defines. */
  var canMapCharacterSet: Boolean = js.native
  /** Gets the character set that the point-of-service printer uses by default. */
  var defaultCharacterSet: Double = js.native
  /** Gets whether the point-of-service printer has a sensor that detects if the printer cover is open. */
  var hasCoverSensor: Boolean = js.native
  /** Gets whether the point-of-service printer supports reporting statistics. */
  var isStatisticsReportingSupported: Boolean = js.native
  /** Gets whether the point-of-service printer supports updating statistics. */
  var isStatisticsUpdatingSupported: Boolean = js.native
  /** Gets whether the point-of-service printer supports printer transactions. */
  var isTransactionSupported: Boolean = js.native
  /** Gets the capabilities of the journal station for the point-of-service printer. */
  var journal: JournalPrinterCapabilities = js.native
  /** Gets the power reporting capabilities of the point-of-service printer. */
  var powerReportingType: UnifiedPosPowerReportingType = js.native
  /** Gets the capabilities of the receipt station for the point-of-service printer. */
  var receipt: ReceiptPrinterCapabilities = js.native
  /** Gets the capabilities of the slip station for the point-of-service printer. */
  var slip: SlipPrinterCapabilities = js.native
}

object PosPrinterCapabilities {
  @scala.inline
  def apply(
    canMapCharacterSet: Boolean,
    defaultCharacterSet: Double,
    hasCoverSensor: Boolean,
    isStatisticsReportingSupported: Boolean,
    isStatisticsUpdatingSupported: Boolean,
    isTransactionSupported: Boolean,
    journal: JournalPrinterCapabilities,
    powerReportingType: UnifiedPosPowerReportingType,
    receipt: ReceiptPrinterCapabilities,
    slip: SlipPrinterCapabilities
  ): PosPrinterCapabilities = {
    val __obj = js.Dynamic.literal(canMapCharacterSet = canMapCharacterSet.asInstanceOf[js.Any], defaultCharacterSet = defaultCharacterSet.asInstanceOf[js.Any], hasCoverSensor = hasCoverSensor.asInstanceOf[js.Any], isStatisticsReportingSupported = isStatisticsReportingSupported.asInstanceOf[js.Any], isStatisticsUpdatingSupported = isStatisticsUpdatingSupported.asInstanceOf[js.Any], isTransactionSupported = isTransactionSupported.asInstanceOf[js.Any], journal = journal.asInstanceOf[js.Any], powerReportingType = powerReportingType.asInstanceOf[js.Any], receipt = receipt.asInstanceOf[js.Any], slip = slip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosPrinterCapabilities]
  }
  @scala.inline
  implicit class PosPrinterCapabilitiesOps[Self <: PosPrinterCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanMapCharacterSet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMapCharacterSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultCharacterSet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCharacterSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasCoverSensor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCoverSensor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStatisticsReportingSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStatisticsReportingSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStatisticsUpdatingSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStatisticsUpdatingSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTransactionSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransactionSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJournal(value: JournalPrinterCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("journal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerReportingType(value: UnifiedPosPowerReportingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerReportingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceipt(value: ReceiptPrinterCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlip(value: SlipPrinterCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

