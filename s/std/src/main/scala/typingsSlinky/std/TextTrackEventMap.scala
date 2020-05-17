package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrackEventMap extends js.Object {
  var cuechange: org.scalajs.dom.raw.Event = js.native
  var error: org.scalajs.dom.raw.Event = js.native
  var load: org.scalajs.dom.raw.Event = js.native
}

object TextTrackEventMap {
  @scala.inline
  def apply(
    cuechange: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.Event,
    load: org.scalajs.dom.raw.Event
  ): TextTrackEventMap = {
    val __obj = js.Dynamic.literal(cuechange = cuechange.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackEventMap]
  }
  @scala.inline
  implicit class TextTrackEventMapOps[Self <: TextTrackEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCuechange(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cuechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

