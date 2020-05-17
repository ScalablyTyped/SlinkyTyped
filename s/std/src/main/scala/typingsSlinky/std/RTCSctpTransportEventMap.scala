package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCSctpTransportEventMap extends js.Object {
  var statechange: org.scalajs.dom.raw.Event = js.native
}

object RTCSctpTransportEventMap {
  @scala.inline
  def apply(statechange: org.scalajs.dom.raw.Event): RTCSctpTransportEventMap = {
    val __obj = js.Dynamic.literal(statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSctpTransportEventMap]
  }
  @scala.inline
  implicit class RTCSctpTransportEventMapOps[Self <: RTCSctpTransportEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatechange(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statechange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

