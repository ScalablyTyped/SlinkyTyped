package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaSourceEventMap extends js.Object {
  var sourceclose: Event_ = js.native
  var sourceended: Event_ = js.native
  var sourceopen: Event_ = js.native
}

object MediaSourceEventMap {
  @scala.inline
  def apply(sourceclose: Event_, sourceended: Event_, sourceopen: Event_): MediaSourceEventMap = {
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
    def withSourceclose(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceclose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceended(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceopen(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceopen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

