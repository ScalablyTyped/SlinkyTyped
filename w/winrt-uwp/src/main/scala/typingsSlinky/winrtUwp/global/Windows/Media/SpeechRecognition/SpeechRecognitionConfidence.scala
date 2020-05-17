package typingsSlinky.winrtUwp.global.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies confidence levels that indicate how accurately a spoken phrase was matched to a phrase in an active constraint. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionConfidence")
@js.native
object SpeechRecognitionConfidence extends js.Object {
  /* 0 */ val high: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence.high with Double = js.native
  /* 2 */ val low: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence.low with Double = js.native
  /* 1 */ val medium: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence.medium with Double = js.native
  /* 3 */ val rejected: typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence.rejected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence with Double
  ] = js.native
}

