package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechSynthesisEventMap extends js.Object {
  var voiceschanged: Event_ = js.native
}

object SpeechSynthesisEventMap {
  @scala.inline
  def apply(voiceschanged: Event_): SpeechSynthesisEventMap = {
    val __obj = js.Dynamic.literal(voiceschanged = voiceschanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisEventMap]
  }
  @scala.inline
  implicit class SpeechSynthesisEventMapOps[Self <: SpeechSynthesisEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVoiceschanged(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceschanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

