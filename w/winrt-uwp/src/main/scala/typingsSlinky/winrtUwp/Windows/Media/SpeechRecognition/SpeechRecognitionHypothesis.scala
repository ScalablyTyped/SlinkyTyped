package typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A recognition result fragment returned by the speech recognizer during an ongoing dictation session. */
@js.native
trait SpeechRecognitionHypothesis extends js.Object {
  /** Gets the text of the hypothesis, or recognition result fragment, returned by the speech recognizer during an ongoing dictation session. */
  var text: String = js.native
}

object SpeechRecognitionHypothesis {
  @scala.inline
  def apply(text: String): SpeechRecognitionHypothesis = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionHypothesis]
  }
  @scala.inline
  implicit class SpeechRecognitionHypothesisOps[Self <: SpeechRecognitionHypothesis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

