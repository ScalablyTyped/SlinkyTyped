package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioWorkletNodeEventMap extends js.Object {
  var processorerror: org.scalajs.dom.raw.Event = js.native
}

object AudioWorkletNodeEventMap {
  @scala.inline
  def apply(processorerror: org.scalajs.dom.raw.Event): AudioWorkletNodeEventMap = {
    val __obj = js.Dynamic.literal(processorerror = processorerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioWorkletNodeEventMap]
  }
  @scala.inline
  implicit class AudioWorkletNodeEventMapOps[Self <: AudioWorkletNodeEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcessorerror(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processorerror")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

