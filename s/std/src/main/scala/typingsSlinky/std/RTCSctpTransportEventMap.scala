package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCSctpTransportEventMap extends js.Object {
  var statechange: org.scalajs.dom.raw.Event
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStatechange(value: org.scalajs.dom.raw.Event): Self = this.set("statechange", value.asInstanceOf[js.Any])
  }
  
}

