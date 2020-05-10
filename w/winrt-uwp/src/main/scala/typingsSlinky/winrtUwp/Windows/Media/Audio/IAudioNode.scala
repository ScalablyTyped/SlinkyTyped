package typingsSlinky.winrtUwp.Windows.Media.Audio

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.IClosable
import typingsSlinky.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines an audio node. */
@js.native
trait IAudioNode extends IClosable {
  /** Gets or sets a value indicating if the audio node consumes input. */
  var consumeInput: Boolean = js.native
  /** Gets the list of effect definitions for the audio node. */
  var effectDefinitions: IVector[IAudioEffectDefinition] = js.native
  /** Gets the encoding properties for the audio node. */
  var encodingProperties: AudioEncodingProperties = js.native
  /** Gets or sets the outgoing gain for the audio node. */
  var outgoingGain: Double = js.native
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
  /** Resets the audio node. */
  def reset(): Unit = js.native
  /** Starts the audio node. */
  def start(): Unit = js.native
  /** Stops the audio node. */
  def stop(): Unit = js.native
}

object IAudioNode {
  @scala.inline
  def apply(
    close: () => Unit,
    consumeInput: Boolean,
    disableEffectsByDefinition: IAudioEffectDefinition => Unit,
    effectDefinitions: IVector[IAudioEffectDefinition],
    enableEffectsByDefinition: IAudioEffectDefinition => Unit,
    encodingProperties: AudioEncodingProperties,
    outgoingGain: Double,
    reset: () => Unit,
    start: () => Unit,
    stop: () => Unit
  ): IAudioNode = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), consumeInput = consumeInput.asInstanceOf[js.Any], disableEffectsByDefinition = js.Any.fromFunction1(disableEffectsByDefinition), effectDefinitions = effectDefinitions.asInstanceOf[js.Any], enableEffectsByDefinition = js.Any.fromFunction1(enableEffectsByDefinition), encodingProperties = encodingProperties.asInstanceOf[js.Any], outgoingGain = outgoingGain.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[IAudioNode]
  }
  @scala.inline
  implicit class IAudioNodeOps[Self <: IAudioNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumeInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumeInput")(value.asInstanceOf[js.Any])
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

