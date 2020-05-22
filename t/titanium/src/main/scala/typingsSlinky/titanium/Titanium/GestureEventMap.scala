package typingsSlinky.titanium.Titanium

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureEventMap extends ProxyEventMap {
  var orientationchange: GestureOrientationchangeEvent
  var shake: GestureShakeEvent
}

object GestureEventMap {
  @scala.inline
  def apply(orientationchange: GestureOrientationchangeEvent, shake: GestureShakeEvent): GestureEventMap = {
    val __obj = js.Dynamic.literal(orientationchange = orientationchange.asInstanceOf[js.Any], shake = shake.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureEventMap]
  }
}

