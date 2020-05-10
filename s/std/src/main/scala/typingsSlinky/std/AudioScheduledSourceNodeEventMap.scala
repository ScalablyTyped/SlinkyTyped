package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioScheduledSourceNodeEventMap extends js.Object {
  var ended: Event_ = js.native
}

object AudioScheduledSourceNodeEventMap {
  @scala.inline
  def apply(ended: Event_): AudioScheduledSourceNodeEventMap = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioScheduledSourceNodeEventMap]
  }
  @scala.inline
  implicit class AudioScheduledSourceNodeEventMapOps[Self <: AudioScheduledSourceNodeEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnded(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ended")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

