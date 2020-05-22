package typingsSlinky.titanium.Titanium

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaEventMap extends ProxyEventMap {
  var cameraready: MediaCamerareadyEvent
  var routechange: MediaRoutechangeEvent
  var volume: MediaVolumeEvent
}

object MediaEventMap {
  @scala.inline
  def apply(cameraready: MediaCamerareadyEvent, routechange: MediaRoutechangeEvent, volume: MediaVolumeEvent): MediaEventMap = {
    val __obj = js.Dynamic.literal(cameraready = cameraready.asInstanceOf[js.Any], routechange = routechange.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaEventMap]
  }
}

