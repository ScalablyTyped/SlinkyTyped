package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechSynthesisErrorEventInit extends SpeechSynthesisEventInit {
  var error: SpeechSynthesisErrorCode = js.native
}

object SpeechSynthesisErrorEventInit {
  @scala.inline
  def apply(error: SpeechSynthesisErrorCode, utterance: SpeechSynthesisUtterance): SpeechSynthesisErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], utterance = utterance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisErrorEventInit]
  }
  @scala.inline
  implicit class SpeechSynthesisErrorEventInitOps[Self <: SpeechSynthesisErrorEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: SpeechSynthesisErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

