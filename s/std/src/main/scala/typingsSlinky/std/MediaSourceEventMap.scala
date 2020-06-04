package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaSourceEventMap extends js.Object {
  var sourceclose: org.scalajs.dom.raw.Event
  var sourceended: org.scalajs.dom.raw.Event
  var sourceopen: org.scalajs.dom.raw.Event
}

object MediaSourceEventMap {
  @scala.inline
  def apply(
    sourceclose: org.scalajs.dom.raw.Event,
    sourceended: org.scalajs.dom.raw.Event,
    sourceopen: org.scalajs.dom.raw.Event
  ): MediaSourceEventMap = {
    val __obj = js.Dynamic.literal(sourceclose = sourceclose.asInstanceOf[js.Any], sourceended = sourceended.asInstanceOf[js.Any], sourceopen = sourceopen.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceEventMap]
  }
  @scala.inline
  implicit class MediaSourceEventMapOps[Self <: MediaSourceEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSourceclose(value: org.scalajs.dom.raw.Event): Self = this.set("sourceclose", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceended(value: org.scalajs.dom.raw.Event): Self = this.set("sourceended", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceopen(value: org.scalajs.dom.raw.Event): Self = this.set("sourceopen", value.asInstanceOf[js.Any])
  }
  
}

