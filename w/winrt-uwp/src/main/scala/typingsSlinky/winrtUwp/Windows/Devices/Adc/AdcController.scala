package typingsSlinky.winrtUwp.Windows.Devices.Adc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an ADC controller on the system */
@js.native
trait AdcController extends js.Object {
  /** The number of channels available on the ADC controller. */
  var channelCount: Double = js.native
  /** Gets or sets the channel mode for the ADC controller. */
  var channelMode: AdcChannelMode = js.native
  /** Gets the maximum value that the controller can report. */
  var maxValue: Double = js.native
  /** The minimum value the controller can report. */
  var minValue: Double = js.native
  /** Gets the resolution of the controller as number of bits it has. For example, if we have a 10-bit ADC, that means it can detect 1024 (2^10) discrete levels. */
  var resolutionInBits: Double = js.native
  /**
    * Verifies that the specified channel mode is supported by the controller.
    * @param channelMode The channel mode.
    * @return True if the specified channel mode is supported, otherwise false.
    */
  def isChannelModeSupported(channelMode: AdcChannelMode): Boolean = js.native
  /**
    * Opens a connection to the specified ADC channel.
    * @param channelNumber The channel to connect to.
    * @return The ADC channel.
    */
  def openChannel(channelNumber: Double): AdcChannel = js.native
}

object AdcController {
  @scala.inline
  def apply(
    channelCount: Double,
    channelMode: AdcChannelMode,
    isChannelModeSupported: AdcChannelMode => Boolean,
    maxValue: Double,
    minValue: Double,
    openChannel: Double => AdcChannel,
    resolutionInBits: Double
  ): AdcController = {
    val __obj = js.Dynamic.literal(channelCount = channelCount.asInstanceOf[js.Any], channelMode = channelMode.asInstanceOf[js.Any], isChannelModeSupported = js.Any.fromFunction1(isChannelModeSupported), maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], openChannel = js.Any.fromFunction1(openChannel), resolutionInBits = resolutionInBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdcController]
  }
  @scala.inline
  implicit class AdcControllerOps[Self <: AdcController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelMode(value: AdcChannelMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsChannelModeSupported(value: AdcChannelMode => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChannelModeSupported")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenChannel(value: Double => AdcChannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openChannel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolutionInBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionInBits")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

