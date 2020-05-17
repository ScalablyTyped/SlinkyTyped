package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechRecognitionAlternative extends js.Object {
  val confidence: Double = js.native
  val transcript: java.lang.String = js.native
}

object SpeechRecognitionAlternative {
  @scala.inline
  def apply(confidence: Double, transcript: java.lang.String): SpeechRecognitionAlternative = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], transcript = transcript.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionAlternative]
  }
  @scala.inline
  implicit class SpeechRecognitionAlternativeOps[Self <: SpeechRecognitionAlternative] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranscript(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcript")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

