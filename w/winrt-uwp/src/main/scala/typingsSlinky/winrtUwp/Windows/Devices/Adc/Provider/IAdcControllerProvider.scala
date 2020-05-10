package typingsSlinky.winrtUwp.Windows.Devices.Adc.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents properties and methods common to all ADC controllers. */
@js.native
trait IAdcControllerProvider extends js.Object {
  /** Gets the number of channels available on for the controller. */
  var channelCount: Double = js.native
  /** Gets or sets the controller channel mode. */
  var channelMode: ProviderAdcChannelMode = js.native
  /** Gets the maximum value that the controller can return. */
  var maxValue: Double = js.native
  /** Gets the minimum value that the controller can return. */
  var minValue: Double = js.native
  /** Gets the resolution of the controller as number of bits it has. */
  var resolutionInBits: Double = js.native
  /**
    * Acquires a connection to the specified channel.
    * @param channel Which channel to connect to.
    */
  def acquireChannel(channel: Double): Unit = js.native
  /**
    * Determines if the specified channel mode is supported by the controller.
    * @param channelMode The channel mode in question.
    * @return True if the specified channel mode is supported, otherwise false.
    */
  def isChannelModeSupported(channelMode: ProviderAdcChannelMode): Boolean = js.native
  /**
    * Gets the digital representation of the analog value on the specified channel.
    * @param channelNumber Which channel to read from.
    * @return The digital representation of the analog value.
    */
  def readValue(channelNumber: Double): Double = js.native
  /**
    * Releases the channel connection, opening that channel for others to use.
    * @param channel Which channel to close the connection to.
    */
  def releaseChannel(channel: Double): Unit = js.native
}

object IAdcControllerProvider {
  @scala.inline
  def apply(
    acquireChannel: Double => Unit,
    channelCount: Double,
    channelMode: ProviderAdcChannelMode,
    isChannelModeSupported: ProviderAdcChannelMode => Boolean,
    maxValue: Double,
    minValue: Double,
    readValue: Double => Double,
    releaseChannel: Double => Unit,
    resolutionInBits: Double
  ): IAdcControllerProvider = {
    val __obj = js.Dynamic.literal(acquireChannel = js.Any.fromFunction1(acquireChannel), channelCount = channelCount.asInstanceOf[js.Any], channelMode = channelMode.asInstanceOf[js.Any], isChannelModeSupported = js.Any.fromFunction1(isChannelModeSupported), maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], readValue = js.Any.fromFunction1(readValue), releaseChannel = js.Any.fromFunction1(releaseChannel), resolutionInBits = resolutionInBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAdcControllerProvider]
  }
  @scala.inline
  implicit class IAdcControllerProviderOps[Self <: IAdcControllerProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcquireChannel(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquireChannel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChannelCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelMode(value: ProviderAdcChannelMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsChannelModeSupported(value: ProviderAdcChannelMode => Boolean): Self = {
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
    def withReadValue(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReleaseChannel(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseChannel")(js.Any.fromFunction1(value))
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

