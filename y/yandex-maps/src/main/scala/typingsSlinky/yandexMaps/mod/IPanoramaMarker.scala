package typingsSlinky.yandexMaps.mod

import typingsSlinky.yandexMaps.mod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanoramaMarker extends js.Object {
  var properties: Manager = js.native
  def getIconSet(): js.Promise[IPanoramaMarkerIconSet] = js.native
  def getPanorama(): IPanorama = js.native
  def getPosition(): js.Array[Double] = js.native
}

object IPanoramaMarker {
  @scala.inline
  def apply(
    getIconSet: () => js.Promise[IPanoramaMarkerIconSet],
    getPanorama: () => IPanorama,
    getPosition: () => js.Array[Double],
    properties: Manager
  ): IPanoramaMarker = {
    val __obj = js.Dynamic.literal(getIconSet = js.Any.fromFunction0(getIconSet), getPanorama = js.Any.fromFunction0(getPanorama), getPosition = js.Any.fromFunction0(getPosition), properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanoramaMarker]
  }
  @scala.inline
  implicit class IPanoramaMarkerOps[Self <: IPanoramaMarker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetIconSet(value: () => js.Promise[IPanoramaMarkerIconSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIconSet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPanorama(value: () => IPanorama): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPanorama")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPosition(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProperties(value: Manager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

