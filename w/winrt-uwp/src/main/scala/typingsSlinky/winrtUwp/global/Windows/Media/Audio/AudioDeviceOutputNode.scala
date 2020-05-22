package typingsSlinky.winrtUwp.global.Windows.Media.Audio

import typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio device output node. */
@JSGlobal("Windows.Media.Audio.AudioDeviceOutputNode")
@js.native
abstract class AudioDeviceOutputNode ()
  extends typingsSlinky.winrtUwp.Windows.Media.Audio.AudioDeviceOutputNode {
  /** Gets or sets a value indicating if the audio device output node consumes input. */
  /* CompleteClass */
  override var consumeInput: Boolean = js.native
  /** Gets information about the audio device. */
  /* CompleteClass */
  override var device: DeviceInformation = js.native
  /** Gets the list of effect definitions for the audio device output node. */
  /* CompleteClass */
  override var effectDefinitions: IVector[IAudioEffectDefinition] = js.native
  /** Gets the encoding properties for the audio device output node. */
  /* CompleteClass */
  override var encodingProperties: AudioEncodingProperties = js.native
  /** Gets or sets the outgoing gain for the audio device output node. */
  /* CompleteClass */
  override var outgoingGain: Double = js.native
  /** Closes the audio device output node. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Disables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to disable.
    */
  /* CompleteClass */
  override def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  /**
    * Enables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to enable.
    */
  /* CompleteClass */
  override def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  /** Resets the audio device output node. */
  /* CompleteClass */
  override def reset(): Unit = js.native
  /** Starts the audio device output node. */
  /* CompleteClass */
  override def start(): Unit = js.native
  /** Stops the audio device output node. */
  /* CompleteClass */
  override def stop(): Unit = js.native
}

