package typingsSlinky.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the SpeechRecognizer.HypothesisGenerated event. */
@js.native
trait SpeechRecognitionHypothesisGeneratedEventArgs extends js.Object {
  /** Gets a recognition result fragment returned by the speech recognizer during an ongoing dictation session. */
  var hypothesis: SpeechRecognitionHypothesis = js.native
}

object SpeechRecognitionHypothesisGeneratedEventArgs {
  @scala.inline
  def apply(hypothesis: SpeechRecognitionHypothesis): SpeechRecognitionHypothesisGeneratedEventArgs = {
    val __obj = js.Dynamic.literal(hypothesis = hypothesis.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionHypothesisGeneratedEventArgs]
  }
  @scala.inline
  implicit class SpeechRecognitionHypothesisGeneratedEventArgsOps[Self <: SpeechRecognitionHypothesisGeneratedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHypothesis(value: SpeechRecognitionHypothesis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hypothesis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

