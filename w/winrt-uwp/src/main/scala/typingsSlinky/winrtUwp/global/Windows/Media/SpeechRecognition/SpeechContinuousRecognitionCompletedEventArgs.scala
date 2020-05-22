package typingsSlinky.winrtUwp.global.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the SpeechContinuousRecognitionSession.Completed event. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechContinuousRecognitionCompletedEventArgs")
@js.native
abstract class SpeechContinuousRecognitionCompletedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechContinuousRecognitionCompletedEventArgs {
  /** Gets the result of a speech recognition session, or the result of a grammar constraint compilation. */
  /* CompleteClass */
  override var status: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResultStatus = js.native
}

