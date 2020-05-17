package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCSrtpSdesTransportEventMap extends js.Object {
  var error: org.scalajs.dom.raw.Event = js.native
}

object RTCSrtpSdesTransportEventMap {
  @scala.inline
  def apply(error: org.scalajs.dom.raw.Event): RTCSrtpSdesTransportEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSrtpSdesTransportEventMap]
  }
  @scala.inline
  implicit class RTCSrtpSdesTransportEventMapOps[Self <: RTCSrtpSdesTransportEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

