package typingsSlinky.winrtUwp.global.Windows.Media.Audio

import typingsSlinky.winrtUwp.Windows.Media.AudioFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents arguments for an AudioFrameCompleted event. */
@JSGlobal("Windows.Media.Audio.AudioFrameCompletedEventArgs")
@js.native
abstract class AudioFrameCompletedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Media.Audio.AudioFrameCompletedEventArgs {
  /** Gets the audio frame that was just completed by the AudioFrameInputNode . A frame is completed when all of the audio in the frame has been consumed by the audio graph. */
  /* CompleteClass */
  override var frame: AudioFrame = js.native
}

