package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechSynthesisEventInit extends EventInit {
  var charIndex: js.UndefOr[Double] = js.native
  var charLength: js.UndefOr[Double] = js.native
  var elapsedTime: js.UndefOr[Double] = js.native
  var name: js.UndefOr[java.lang.String] = js.native
  var utterance: SpeechSynthesisUtterance = js.native
}

object SpeechSynthesisEventInit {
  @scala.inline
  def apply(utterance: SpeechSynthesisUtterance): SpeechSynthesisEventInit = {
    val __obj = js.Dynamic.literal(utterance = utterance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisEventInit]
  }
  @scala.inline
  implicit class SpeechSynthesisEventInitOps[Self <: SpeechSynthesisEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUtterance(value: SpeechSynthesisUtterance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utterance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withCharLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charLength")(js.undefined)
        ret
    }
    @scala.inline
    def withElapsedTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElapsedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

