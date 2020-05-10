package typingsSlinky.yandexMaps.mod

import typingsSlinky.yandexMaps.mod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanoramaConnectionArrow extends IPanoramaConnection {
  var properties: Manager = js.native
  def getDirection(): js.Array[Double] = js.native
  def getPanorama(): IPanorama = js.native
}

object IPanoramaConnectionArrow {
  @scala.inline
  def apply(
    getConnectedPanorama: () => js.Promise[IPanorama],
    getDirection: () => js.Array[Double],
    getPanorama: () => IPanorama,
    properties: Manager
  ): IPanoramaConnectionArrow = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = js.Any.fromFunction0(getConnectedPanorama), getDirection = js.Any.fromFunction0(getDirection), getPanorama = js.Any.fromFunction0(getPanorama), properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanoramaConnectionArrow]
  }
  @scala.inline
  implicit class IPanoramaConnectionArrowOps[Self <: IPanoramaConnectionArrow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDirection(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPanorama(value: () => IPanorama): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPanorama")(js.Any.fromFunction0(value))
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

