package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementEventMap extends js.Object {
  var fullscreenchange: org.scalajs.dom.raw.Event
  var fullscreenerror: org.scalajs.dom.raw.Event
}

object ElementEventMap {
  @scala.inline
  def apply(fullscreenchange: org.scalajs.dom.raw.Event, fullscreenerror: org.scalajs.dom.raw.Event): ElementEventMap = {
    val __obj = js.Dynamic.literal(fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementEventMap]
  }
}

