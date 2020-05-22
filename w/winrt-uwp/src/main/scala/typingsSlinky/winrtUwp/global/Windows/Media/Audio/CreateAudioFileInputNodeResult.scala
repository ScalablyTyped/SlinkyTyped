package typingsSlinky.winrtUwp.global.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of creating an audio file input node. */
@JSGlobal("Windows.Media.Audio.CreateAudioFileInputNodeResult")
@js.native
abstract class CreateAudioFileInputNodeResult ()
  extends typingsSlinky.winrtUwp.Windows.Media.Audio.CreateAudioFileInputNodeResult {
  /** Gets the audio file input node. */
  /* CompleteClass */
  override var fileInputNode: typingsSlinky.winrtUwp.Windows.Media.Audio.AudioFileInputNode = js.native
  /** Gets the status of audio file input node creation. */
  /* CompleteClass */
  override var status: typingsSlinky.winrtUwp.Windows.Media.Audio.AudioFileNodeCreationStatus = js.native
}

