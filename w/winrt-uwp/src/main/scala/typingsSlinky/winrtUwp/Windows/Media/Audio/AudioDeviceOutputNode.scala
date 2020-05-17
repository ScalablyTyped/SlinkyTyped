package typingsSlinky.winrtUwp.Windows.Media.Audio

import typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio device output node. */
@js.native
trait AudioDeviceOutputNode extends js.Object {
  /** Gets or sets a value indicating if the audio device output node consumes input. */
  var consumeInput: Boolean = js.native
  /** Gets information about the audio device. */
  var device: DeviceInformation = js.native
  /** Gets the list of effect definitions for the audio device output node. */
  var effectDefinitions: IVector[IAudioEffectDefinition] = js.native
  /** Gets the encoding properties for the audio device output node. */
  var encodingProperties: AudioEncodingProperties = js.native
  /** Gets or sets the outgoing gain for the audio device output node. */
  var outgoingGain: Double = js.native
  /** Closes the audio device output node. */
  def close(): Unit = js.native
  /**
    * Disables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to disable.
    */
  def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  /**
    * Enables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to enable.
    */
  def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  /** Resets the audio device output node. */
  def reset(): Unit = js.native
  /** Starts the audio device output node. */
  def start(): Unit = js.native
  /** Stops the audio device output node. */
  def stop(): Unit = js.native
}

object AudioDeviceOutputNode {
  @scala.inline
  def apply(
    close: () => Unit,
    consumeInput: Boolean,
    device: DeviceInformation,
    disableEffectsByDefinition: IAudioEffectDefinition => Unit,
    effectDefinitions: IVector[IAudioEffectDefinition],
    enableEffectsByDefinition: IAudioEffectDefinition => Unit,
    encodingProperties: AudioEncodingProperties,
    outgoingGain: Double,
    reset: () => Unit,
    start: () => Unit,
    stop: () => Unit
  ): AudioDeviceOutputNode = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), consumeInput = consumeInput.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], disableEffectsByDefinition = js.Any.fromFunction1(disableEffectsByDefinition), effectDefinitions = effectDefinitions.asInstanceOf[js.Any], enableEffectsByDefinition = js.Any.fromFunction1(enableEffectsByDefinition), encodingProperties = encodingProperties.asInstanceOf[js.Any], outgoingGain = outgoingGain.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[AudioDeviceOutputNode]
  }
  @scala.inline
  implicit class AudioDeviceOutputNodeOps[Self <: AudioDeviceOutputNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConsumeInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumeInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevice(value: DeviceInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableEffectsByDefinition(value: IAudioEffectDefinition => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEffectsByDefinition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEffectDefinitions(value: IVector[IAudioEffectDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableEffectsByDefinition(value: IAudioEffectDefinition => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEffectsByDefinition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncodingProperties(value: AudioEncodingProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodingProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoingGain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingGain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

