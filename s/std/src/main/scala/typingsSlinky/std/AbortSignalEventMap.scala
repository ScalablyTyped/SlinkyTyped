package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortSignalEventMap extends js.Object {
  var abort: org.scalajs.dom.raw.Event = js.native
}

object AbortSignalEventMap {
  @scala.inline
  def apply(abort: org.scalajs.dom.raw.Event): AbortSignalEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortSignalEventMap]
  }
  @scala.inline
  implicit class AbortSignalEventMapOps[Self <: AbortSignalEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

