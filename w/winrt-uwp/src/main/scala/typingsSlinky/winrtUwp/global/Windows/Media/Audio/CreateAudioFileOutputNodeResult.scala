package typingsSlinky.winrtUwp.global.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of creating an audio file output node. */
@JSGlobal("Windows.Media.Audio.CreateAudioFileOutputNodeResult")
@js.native
abstract class CreateAudioFileOutputNodeResult ()
  extends typingsSlinky.winrtUwp.Windows.Media.Audio.CreateAudioFileOutputNodeResult {
  /** Gets the audio file output node. */
  /* CompleteClass */
  override var fileOutputNode: typingsSlinky.winrtUwp.Windows.Media.Audio.AudioFileOutputNode = js.native
  /** Gets the status of audio file output node creation. */
  /* CompleteClass */
  override var status: typingsSlinky.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus = js.native
}

