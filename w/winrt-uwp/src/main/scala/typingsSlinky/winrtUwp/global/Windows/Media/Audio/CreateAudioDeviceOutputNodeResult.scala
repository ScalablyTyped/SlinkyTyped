package typingsSlinky.winrtUwp.global.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of creating an audio device output node. */
@JSGlobal("Windows.Media.Audio.CreateAudioDeviceOutputNodeResult")
@js.native
abstract class CreateAudioDeviceOutputNodeResult ()
  extends typingsSlinky.winrtUwp.Windows.Media.Audio.CreateAudioDeviceOutputNodeResult {
  /** Gets the audio device output node. */
  /* CompleteClass */
  override var deviceOutputNode: typingsSlinky.winrtUwp.Windows.Media.Audio.AudioDeviceOutputNode = js.native
  /** Gets the status of audio device output node creation. */
  /* CompleteClass */
  override var status: typingsSlinky.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus = js.native
}

