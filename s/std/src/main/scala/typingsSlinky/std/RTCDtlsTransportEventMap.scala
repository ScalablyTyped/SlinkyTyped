package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDtlsTransportEventMap extends js.Object {
  var error: RTCErrorEvent = js.native
  var statechange: org.scalajs.dom.raw.Event = js.native
}

object RTCDtlsTransportEventMap {
  @scala.inline
  def apply(error: RTCErrorEvent, statechange: org.scalajs.dom.raw.Event): RTCDtlsTransportEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDtlsTransportEventMap]
  }
  @scala.inline
  implicit class RTCDtlsTransportEventMapOps[Self <: RTCDtlsTransportEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: RTCErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatechange(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statechange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

