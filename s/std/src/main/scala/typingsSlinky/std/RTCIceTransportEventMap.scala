package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceTransportEventMap extends js.Object {
  var gatheringstatechange: org.scalajs.dom.raw.Event
  var selectedcandidatepairchange: org.scalajs.dom.raw.Event
  var statechange: org.scalajs.dom.raw.Event
}

object RTCIceTransportEventMap {
  @scala.inline
  def apply(
    gatheringstatechange: org.scalajs.dom.raw.Event,
    selectedcandidatepairchange: org.scalajs.dom.raw.Event,
    statechange: org.scalajs.dom.raw.Event
  ): RTCIceTransportEventMap = {
    val __obj = js.Dynamic.literal(gatheringstatechange = gatheringstatechange.asInstanceOf[js.Any], selectedcandidatepairchange = selectedcandidatepairchange.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RTCIceTransportEventMap]
  }
}

