package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceGathererEventMap extends js.Object {
  var error: org.scalajs.dom.raw.Event
  var localcandidate: RTCIceGathererEvent
}

object RTCIceGathererEventMap {
  @scala.inline
  def apply(error: org.scalajs.dom.raw.Event, localcandidate: RTCIceGathererEvent): RTCIceGathererEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], localcandidate = localcandidate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RTCIceGathererEventMap]
  }
}

