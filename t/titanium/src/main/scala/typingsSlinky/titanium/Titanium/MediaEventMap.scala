package typingsSlinky.titanium.Titanium

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaEventMap extends ProxyEventMap {
  var cameraready: MediaCamerareadyEvent = js.native
  var routechange: MediaRoutechangeEvent = js.native
  var volume: MediaVolumeEvent = js.native
}

object MediaEventMap {
  @scala.inline
  def apply(cameraready: MediaCamerareadyEvent, routechange: MediaRoutechangeEvent, volume: MediaVolumeEvent): MediaEventMap = {
    val __obj = js.Dynamic.literal(cameraready = cameraready.asInstanceOf[js.Any], routechange = routechange.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaEventMap]
  }
  @scala.inline
  implicit class MediaEventMapOps[Self <: MediaEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCameraready(value: MediaCamerareadyEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutechange(value: MediaRoutechangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolume(value: MediaVolumeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

