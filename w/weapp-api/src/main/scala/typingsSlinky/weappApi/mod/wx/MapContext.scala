package typingsSlinky.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapContext extends js.Object {
  //  获取当前地图中心的经纬度。返回的是 gcj02 坐标系，可以用于 wx.openLocation()
  def getCenterLocation(options: GetCenterLocationSuccCbOptions): Unit = js.native
  //  获取当前地图的视野范围
  def getRegion(options: GetReginOptions): Unit = js.native
  //  获取当前地图的缩放级别
  def getScale(options: GetScaleOptions): Unit = js.native
  //  缩放视野展示所有经纬度
  def includePoints(options: zoomPointsOptions): Unit = js.native
  //  将地图中心移动到当前定位点。需要配合map组件的show-location使用
  def moveToLocation(): Unit = js.native
  //  平移marker，带动画
  def translateMarker(options: translateMarkerOptions): Unit = js.native
}

object MapContext {
  @scala.inline
  def apply(
    getCenterLocation: GetCenterLocationSuccCbOptions => Unit,
    getRegion: GetReginOptions => Unit,
    getScale: GetScaleOptions => Unit,
    includePoints: zoomPointsOptions => Unit,
    moveToLocation: () => Unit,
    translateMarker: translateMarkerOptions => Unit
  ): MapContext = {
    val __obj = js.Dynamic.literal(getCenterLocation = js.Any.fromFunction1(getCenterLocation), getRegion = js.Any.fromFunction1(getRegion), getScale = js.Any.fromFunction1(getScale), includePoints = js.Any.fromFunction1(includePoints), moveToLocation = js.Any.fromFunction0(moveToLocation), translateMarker = js.Any.fromFunction1(translateMarker))
    __obj.asInstanceOf[MapContext]
  }
  @scala.inline
  implicit class MapContextOps[Self <: MapContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCenterLocation(value: GetCenterLocationSuccCbOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCenterLocation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRegion(value: GetReginOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScale(value: GetScaleOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncludePoints(value: zoomPointsOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePoints")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveToLocation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTranslateMarker(value: translateMarkerOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateMarker")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

