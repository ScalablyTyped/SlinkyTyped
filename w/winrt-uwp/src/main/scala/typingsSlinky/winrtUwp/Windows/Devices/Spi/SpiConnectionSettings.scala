package typingsSlinky.winrtUwp.Windows.Devices.Spi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the settings for the connection with a device. */
@js.native
trait SpiConnectionSettings extends js.Object {
  /** Gets or sets the chip select line for the connection to the SPI device. */
  var chipSelectLine: Double = js.native
  /** Gets or sets the clock frequency for the connection. */
  var clockFrequency: Double = js.native
  /** Gets or sets the bit length for data on this connection. */
  var dataBitLength: Double = js.native
  /** Gets or sets the SpiMode for this connection. */
  var mode: SpiMode = js.native
  /** Gets or sets the sharing mode for the SPI connection. */
  var sharingMode: SpiSharingMode = js.native
}

object SpiConnectionSettings {
  @scala.inline
  def apply(
    chipSelectLine: Double,
    clockFrequency: Double,
    dataBitLength: Double,
    mode: SpiMode,
    sharingMode: SpiSharingMode
  ): SpiConnectionSettings = {
    val __obj = js.Dynamic.literal(chipSelectLine = chipSelectLine.asInstanceOf[js.Any], clockFrequency = clockFrequency.asInstanceOf[js.Any], dataBitLength = dataBitLength.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], sharingMode = sharingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpiConnectionSettings]
  }
  @scala.inline
  implicit class SpiConnectionSettingsOps[Self <: SpiConnectionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChipSelectLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chipSelectLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClockFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataBitLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBitLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: SpiMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharingMode(value: SpiSharingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharingMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

