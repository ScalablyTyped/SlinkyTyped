package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanorama extends js.Object {
  def getAngularBBox(): js.Array[Double] = js.native
  def getConnectionArrows(): js.Array[IPanoramaConnectionArrow] = js.native
  def getConnectionMarkers(): js.Array[IPanoramaConnectionMarker] = js.native
  def getCoordSystem(): ICoordSystem = js.native
  def getDefaultDirection(): js.Array[Double] = js.native
  def getDefaultSpan(): js.Array[Double] = js.native
  def getGraph(): IPanoramaGraph | Null = js.native
  def getMarkers(): js.Array[IPanoramaMarker] = js.native
  def getName(): String = js.native
  def getPosition(): js.Array[Double] = js.native
  def getTileLevels(): js.Array[IPanoramaTileLevel] = js.native
  def getTileSize(): js.Array[Double] = js.native
}

object IPanorama {
  @scala.inline
  def apply(
    getAngularBBox: () => js.Array[Double],
    getConnectionArrows: () => js.Array[IPanoramaConnectionArrow],
    getConnectionMarkers: () => js.Array[IPanoramaConnectionMarker],
    getCoordSystem: () => ICoordSystem,
    getDefaultDirection: () => js.Array[Double],
    getDefaultSpan: () => js.Array[Double],
    getGraph: () => IPanoramaGraph | Null,
    getMarkers: () => js.Array[IPanoramaMarker],
    getName: () => String,
    getPosition: () => js.Array[Double],
    getTileLevels: () => js.Array[IPanoramaTileLevel],
    getTileSize: () => js.Array[Double]
  ): IPanorama = {
    val __obj = js.Dynamic.literal(getAngularBBox = js.Any.fromFunction0(getAngularBBox), getConnectionArrows = js.Any.fromFunction0(getConnectionArrows), getConnectionMarkers = js.Any.fromFunction0(getConnectionMarkers), getCoordSystem = js.Any.fromFunction0(getCoordSystem), getDefaultDirection = js.Any.fromFunction0(getDefaultDirection), getDefaultSpan = js.Any.fromFunction0(getDefaultSpan), getGraph = js.Any.fromFunction0(getGraph), getMarkers = js.Any.fromFunction0(getMarkers), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getTileLevels = js.Any.fromFunction0(getTileLevels), getTileSize = js.Any.fromFunction0(getTileSize))
    __obj.asInstanceOf[IPanorama]
  }
  @scala.inline
  implicit class IPanoramaOps[Self <: IPanorama] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAngularBBox(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAngularBBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetConnectionArrows(value: () => js.Array[IPanoramaConnectionArrow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnectionArrows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetConnectionMarkers(value: () => js.Array[IPanoramaConnectionMarker]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnectionMarkers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCoordSystem(value: () => ICoordSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCoordSystem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDefaultDirection(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultDirection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDefaultSpan(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultSpan")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGraph(value: () => IPanoramaGraph | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGraph")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMarkers(value: () => js.Array[IPanoramaMarker]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarkers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPosition(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTileLevels(value: () => js.Array[IPanoramaTileLevel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTileLevels")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTileSize(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTileSize")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

